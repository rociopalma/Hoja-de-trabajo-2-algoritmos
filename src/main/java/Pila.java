
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
        /*String p = "{";
        int i = 0;
        while(i<vector.size()){
            
           p += vector.get(i-vector.size())+", ";
        }
        return p+"}";*/
        return vector.toString();
    }
    
    
}

