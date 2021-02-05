
import java.util.Vector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
    (new Main()).Init();
    }
    public void Init(){
        ClasePila.push("1");
        ClasePila.push("20");
        ClasePila.push("+");
        
        ClasePila.push("4");
        ClasePila.push("*");
        
        ClasePila.push("3");
        ClasePila.push("-");
        
        System.out.println(ClasePila.toString());
        System.out.println("Tamaño de vector: "+ClasePila.size());
        
        int tamPila = ClasePila.size();
        int Aux1 = 0,Aux2=0;
        for(int i = 0; i < tamPila; i++){
            String operacion = (String) ClasePila.peek();
            switch(operacion){
                case "+":
                    System.out.println("Vamos a Suma " + Aux1 +" + "+ Aux2);
                    Aux1 = Aux1 + Aux2;
                    System.out.println("Resultado: " + Aux1);
                    ClasePila.pop();
                break;
                case "-":
                System.out.println("Vamos a Restar " + Aux1 + " - "+ Aux2);
                Aux1 = Aux1 -Aux2;
                System.out.println("Resultado: " + Aux1);
                ClasePila.pop();
                break;
                case "*":
                System.out.println("Vamos a Multiplicar " + Aux1 + " * "+ Aux2);
                Aux1 = Aux1 *Aux2;
                System.out.println("Resultado: " + Aux1);
                ClasePila.pop();
                break;
                default:
                    System.out.println(ClasePila.peek());
                    if(Aux1 == 0){
                        //Utilizo primero el Cast de String y luego Transformo el valor String a Numerico para evitar el error que nos daba al momento de ejecutar. 
                        Aux1 = Integer.valueOf((String)ClasePila.pop());
                    }else{
                        //Utilizo primero el Cast de String y luego Transformo el valor String a Numerico para evitar el error que nos daba al momento de ejecutar. 
                        Aux2 = Integer.valueOf((String)ClasePila.pop());
                    }
                break;
            }//fin de swithc
        }//fin de for
        }//fin del metodo
}//fin de clase


