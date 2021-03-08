/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rocío
 */
public class MainTest {
    
    public MainTest() {
    }

    



    @Test
    public void testinfixToPostFix() {
        System.out.println("infixToPostFix");
        String cadena = "(1+2)*9";
        InfixToPostFix instance = new InfixToPostFix();
        instance.infixToPostFix(cadena);
        String expResult = "12+9*";
        String result = instance.infixToPostFix(cadena);
        assertEquals(expResult, result);
       
        
        
    }


    @Test
    public void testProcesaCadena() {
        System.out.println("Procesa cadena");
        String cadena = "12+9*";
        Main instance = new Main();
        int expResult = 27;
        int result = instance.procesaCadena(cadena);
        assertEquals(expResult, result);
    }
    
}
