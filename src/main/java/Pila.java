
import java.util.ArrayList;
import java.util.Vector;

/*
 * Esta Clase contiene las funciones del vector, list y el arrayList 
Github: https://github.com/rociopalma/Hoja-de-trabajo-2-algoritmos
 */
/**
 * @author Rocío
 */
public class Pila<E> implements Stack {

    private Vector<E> vector = new Vector();
    private ArrayList<E> arrayList = new ArrayList();
    private int tipoPila = 1;

    class Nodo {

        public E info;
        public Nodo sig;
    }

    private Nodo raiz;

    public Pila(int tipoPila) {
        this.tipoPila = tipoPila;
    }

    @Override

 /*
 *  Este método agrega elementos a la implementación del stack seleccionada
 * @param item elemento que se agrega al stack
 */
    
    public void push(Object item) {

        if (tipoPila == 1) {
            vector.add((E) item);
        } else if (tipoPila == 2) {
            arrayList.add((E) item);
        } else if (tipoPila == 3) {
            Nodo nuevo;
            nuevo = new Nodo();
            nuevo.info = (E) item;
            if (raiz == null) {
                nuevo.sig = null;
                raiz = nuevo;
            } else {
                Nodo aux = raiz;
                while(aux.sig != null){
                    aux = aux.sig;
                }
                aux.sig = nuevo;
                
            }

        }
    }

    @Override
 /*
 * Esta función remueve el último elemento agregado a la implementación del stack seleccionada
 * @return p devuelve el elemento removido
 */
    public Object pop() {
        Object p = new Object();
        if (tipoPila == 1) {
            p = vector.get(0);
            vector.remove(0);

        } else if (tipoPila == 2) {
            p = arrayList.get(0);
            arrayList.remove(0);
        } else if (tipoPila == 3) {
            if (raiz != null) {
                p = raiz.info;
                raiz = raiz.sig;
            }
        }
        return p;
    }

    @Override
 /*
 *  Esta función toma el último elemento agregado de la implementación del stack seleccionada
 * @return p devuelve el último elemento que se agrega al stack
 */
    public Object peek() {
        Object p = new Object();
        if (tipoPila == 1) {
            p = vector.get(0);
        } else if (tipoPila == 2) {
            p = arrayList.get(0);
        } else if (tipoPila == 3) {
            p = raiz.info;
        }
        return p;
    }

 /*
 *  Esta función revisa si la implementación del stack seleccionada está vacia o no
 * @return vacio retorna true si está vacio y false si no
 */
    @Override
    public boolean empty() {
        boolean vacio = false;

        if (tipoPila == 1) {
            vacio = vector.isEmpty();
        } else if (tipoPila == 2) {
            vacio = arrayList.isEmpty();
        } else if (tipoPila == 3) {
            if (raiz == null) {
                vacio = true;
            }
        }
        return vacio;
    }

    @Override
 /*
 *  Esta función indica el tamaño de implementación del stack seleccionada
 * @return tamanio retorna el tamaño del stack
 */
    public int size() {
        int tamanio = 0;
        if (tipoPila == 1) {
            tamanio = vector.size();
        } else if (tipoPila == 2) {
            tamanio = arrayList.size();
        } else if (tipoPila == 3) {

            Nodo reco = raiz;
            while (reco != null) {
                reco = reco.sig;
                tamanio++;
            }
        }
    return tamanio ;
}

@Override

/*
 *  Esta función devuelve lo que tiene la implementación del stack seleccionada
 * @return cadena devuelve lo que el stack contiene 
 */
public String toString() {
        String cadena = "";
        if (tipoPila == 1) {
            cadena = vector.toString();
        } else if (tipoPila == 2) {
            cadena = arrayList.toString();
        } else if (tipoPila == 3) {
           Nodo reco = raiz;
            while (reco != null) {
                cadena += reco.info;
                reco = reco.sig;  
            } 
        }
        return cadena;
    }

}
