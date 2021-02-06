/*
 * 
 */
import junit.framework.TestCase;
/**
 *
 * @author Rocío
 */
public class TestPila extends TestCase{
 private Pila pila;
 
 public void inicializar(){
     pila = new Pila();
 }
 
 public void testpush() {
     inicializar();
     assertNotNull(pila.push("1"));    
     
    }

    
    public void testpop() {
       inicializar();  
       
    }

    
    public void testpeek() {
        inicializar();  
    }

    
    public void testempty() {
       inicializar();   
      
    }

    
    public void testsize() {
         inicializar();  
    } 

    
}
