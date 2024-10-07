/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package balancedparanthesis;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 *
 * @author payal
 */
public class BalancedParanthesis {

    /**
     * @param args the command line arguments
     */
    
    private static boolean isValid(String str){
        char[] chars=str.toCharArray();
        Deque<Character> stk=new ArrayDeque<>();
        for(char ch:chars){
            if (ch=='[' || ch=='{' || ch=='('){
                stk.push(ch);
            }
            if (ch==']' || ch==')' || ch=='}'){
                if (stk.isEmpty()){
                    return false;
                }
                if ((ch==']' && stk.peek()!='[')
                        ||(ch=='}' && stk.peek()!='{')
                        ||(ch==')' && stk.peek()!='(')){
                    return false;
                }
                stk.pop();
            }
        }
        if (!stk.isEmpty()){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        String str=new String("{([])}");
        System.out.println(isValid(str));
        
        String str1=new String("{{([])}");
        System.out.println(isValid(str1));
        
        String str2=new String("{([])}}");
        System.out.println(isValid(str2));
    }
    
    
}
