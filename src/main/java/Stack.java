/*
 * Esta clase es la interfaz la cual tiene declarados los métodos y funciones del programa,no tiene el proceso de los mismos
Github: 
 */

/**
 *
 * @author Rocío
 */
public interface Stack <E>{
    public void push(E item);
    public E pop();
    public E peek();
    public boolean empty();
    public int size();
}

