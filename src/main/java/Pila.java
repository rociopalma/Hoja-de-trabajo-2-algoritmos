
import java.util.ArrayList;
import java.util.Vector;

/*
 * Esta Clase contiene al vector y las funciones que tendrá el programa. 
Github: https://github.com/rociopalma/Hoja-de-trabajo-2-algoritmos
 */
/**
 *
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
