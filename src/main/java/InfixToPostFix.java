/*
 * Esta clase cambia la expresión infix a un posfix
 *Github: https://github.com/rociopalma/Hoja-de-trabajo-2-algoritmos
 */


import java.util.Stack;

/**
 *
 * @author Rocío
 */
public class InfixToPostFix {

 /*
 * @param c 
 */
    private static int precedence(char c) {
        switch (c) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }
    
 /*
 * Esta funcion lee cada elemento de la expresión y lo ordena como posfix
 * @param expression es la expresión infix que se convierte a posfix 
   @return result devuelve la expresión ya convertida
 */
    public static String infixToPostFix(String expression) {
        String result = "";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            // check if char is operator
            if (precedence(c) > 0) {
                while (stack.isEmpty() == false && precedence(stack.peek()) >= precedence(c)) {
                    result += stack.pop();
                }
                stack.push(c);
            } else if (c == ')') {
                char x = stack.pop();
                while (x != '(') {
                    result += x;
                    x = stack.pop();
                }
            } else if (c == '(') {
                stack.push(c);
            } else {
                // character is neither operator nor (
                result += c;
            }
        }
        for (int i = 0; i <= stack.size(); i++) {
            result += stack.pop();
        }
        return result;
    }
}
