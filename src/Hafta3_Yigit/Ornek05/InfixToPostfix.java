package Hafta3_Yigit.Ornek05;

import java.util.Stack;

/**
 *
 * @author bugra
 */
public class InfixToPostfix {
    
    private static boolean isOperator(char c){
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^' || c == '(' || c == ')';
    }
    
    private static int preority(char ch){
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
            default:
                return -1;
        }
    }
    
    private static boolean isOperant(char ch){
        return ( (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') );
    }
    
    public static String convertToPostfix(String infix){
        Stack<Character> stack = new Stack<Character>();
        StringBuffer postfix = new StringBuffer(infix.length());
        char c;
        
        for (int i = 0; i < infix.length(); i++) {
            c = infix.charAt(i);
            
            if(isOperant(c)){
                postfix.append(c);
            }else if( c == '(') {
                stack.push(c);
            }else if( c == ')' ){
                while(!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop());
                }
                if(!stack.isEmpty() && stack.peek() != '('){
                    return null;
                }
                else if(!stack.isEmpty()){
                    stack.pop();
                }
            }
            else if(isOperator(c)){
                if(!stack.isEmpty() && preority(c) < preority(stack.peek())){
                    postfix.append(stack.pop());
                }
                stack.push(c);
            }
        }
        
        while(!stack.isEmpty()){
            postfix.append(stack.pop());
        }
        
        return postfix.toString();
    }
}
