/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package genparanthesis;
import java.util.ArrayDeque; 
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Generate Parentheses
 * https://www.youtube.com/watch?v=s9fokUqJ76A
 * @author payal
 */
public class GenParanthesis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Deque<String> stack=new ArrayDeque<>();
        List<String> listOfParenthesis=new LinkedList<>();
        generateParenthesis(3,0,0,stack,listOfParenthesis);
        for(String parenthesis:listOfParenthesis){
            System.out.println(parenthesis);
        }
    }
    private static void generateParenthesis(int n,int openCount, int closedCount,Deque<String> stack, List<String> result){
        
        if (openCount==n && closedCount==n){
            String finalparenthesis = stack.stream().collect(Collectors.joining(""));
            result.add(finalparenthesis);
            return;
        }
        if (openCount<n){
            stack.addLast("(");
            generateParenthesis(n, openCount+1, closedCount,stack, result);
            stack.removeLast();
        }
        if (closedCount<openCount){
            stack.addLast(")");
            generateParenthesis(n, openCount, closedCount+1,stack, result);
            stack.removeLast();
        }
        
    }
}
