
import java.util.Vector;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

/*
 * Esta clase contiene El método main y dos métodos para el funcionamiento del programa. Lectura hace la lectura del txt
 y Init tiene ya los datos de txt y los opera y muestra los resultados
Github: https://github.com/rociopalma/Hoja-de-trabajo-2-algoritmos
 */
/**
 *
 * @author Rocío
 */
public class Main {

    Pila ClasePila = new Pila();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        (new Main()).lectura();
       

    }

    public void lectura() {
        
        try {

            File myObj = new File("datos.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                data = data.trim();
                data.replace("^\\s*" , "");
                //System.out.println(data);
                if (! data.isEmpty()){
                  
                //procesaCadena(data);
                String expresion = "(1 +2 )* 4 + 3 ";
                infixPostfix(expresion);
                }//fin de if
                
            }//fin de while
            myReader.close();
            //Init();
        } catch (FileNotFoundException e) {
            System.out.println("No se encontró el archivo.");
            e.printStackTrace();
        }
    }//fin de metodo

    public void infixPostfix(String cadena){
    String postfix = "";
    InfixToPostFix clase = new InfixToPostFix();
    
    postfix = clase.infixToPostFix(cadena);
    System.out.print(postfix);    
    procesaCadena(postfix);
    }
    
    public void procesaCadena(String cadena){
        String CadenaDatos[] = cadena.split(" ");
                for (int i = 0; i < CadenaDatos.length; i++) {
                    //System.out.println("Cadena: " + CadenaDatos[i]);
                    ClasePila.push(CadenaDatos[i]);
                    
                }//fin de for
                Init();  
    }
    
    
    public void Init() {

        System.out.println("Tamaño de vector: " + ClasePila.size());

        int tamPila = ClasePila.size();
        int Aux1 = 0, Aux2 = 0;
        for (int i = 0; i < tamPila; i++) {
            String operacion = (String) ClasePila.peek();
            switch (operacion) {
                case "+":
                    System.out.println("Vamos a Sumar " + Aux1 + " + " + Aux2);
                    Aux1 = Aux1 + Aux2;
                    System.out.println("Resultado: " + Aux1);
                    ClasePila.pop();
                    break;
                case "-":
                    System.out.println("Vamos a Restar " + Aux1 + " - " + Aux2);
                    Aux1 = Aux1 - Aux2;
                    System.out.println("Resultado: " + Aux1);
                    ClasePila.pop();
                    break;
                case "*":
                    System.out.println("Vamos a Multiplicar " + Aux1 + " * " + Aux2);
                    Aux1 = Aux1 * Aux2;
                    System.out.println("Resultado: " + Aux1);
                    ClasePila.pop();
                    break;
                case "/":
                    System.out.println("Vamos a Dividir "+ Aux1 + " / " + Aux2);
                    Aux1 = Aux1 / Aux2;
                    System.out.println("Resultado: " + Aux1);
                    ClasePila.pop();
                    break;
                default:
                    System.out.println(ClasePila.peek());
                    if (Aux1 == 0) {
                        //Utilizo primero el Cast de String y luego Transformo el valor String a Numerico  
                        Aux1 = Integer.valueOf((String) ClasePila.pop());
                    } else {
                        //Utilizo primero el Cast de String y luego Transformo el valor String a Numerico 
                        Aux2 = Integer.valueOf((String) ClasePila.pop());
                    }
                    break;
            }//fin de swithc
        }//fin de for
    }//fin del metodo

}//fin de clase

