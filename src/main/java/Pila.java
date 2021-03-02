
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
    
    private Vector <E> vector = new Vector();

    @Override
    public void push(Object item) {
         vector.add((E) item);
    }

    @Override
    public Object pop() {
        Object p = vector.get(0);
        vector.remove(0);
        return p;
       
    }

    @Override
    public Object peek() {
        return vector.get(0);
    }

    @Override
    public boolean empty() {
        
        return vector.isEmpty();
    }

    @Override
    public int size() {
         return vector.size();
    } 

    @Override
    public String toString() {
        
        return vector.toString();
    }
    
    
}

