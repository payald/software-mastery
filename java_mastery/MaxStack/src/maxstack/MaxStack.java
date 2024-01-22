/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maxstack;

import java.util.Objects;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * There is a provision in this stack to find the max at any given moment
 * in the stack else it is a normal stack
 * @author payal
 */
public class MaxStack {
    
    static class MaximumStack{
        static Stack<Integer> mainStack=new Stack<>();
        static Stack<Integer> auxMaxStack=new Stack<>();
        
        static Integer pop() throws Exception{
            if (auxMaxStack.empty() || mainStack.empty()){
                throw new Exception("Stack is Empty");
            }
            if (Objects.equals(mainStack.peek(), auxMaxStack.peek())){
                auxMaxStack.pop();
            }
            return mainStack.pop();
        }
        static void push(int num){
            if (auxMaxStack.empty() || auxMaxStack.peek()<num){
                auxMaxStack.push(num);
            }
            mainStack.push(num);
        }
        static int peekMax() throws Exception{
            if (auxMaxStack.empty()){
                throw new Exception("Stack is Empty");
            }
            return auxMaxStack.peek();
        }
        static int peek() throws Exception{
            if (mainStack.empty()){
                throw new Exception("Stack is Empty");
            }
            return mainStack.peek();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            System.out.println("List 1");
            MaximumStack.push(4);
            MaximumStack.push(19);
            MaximumStack.push(7);
            MaximumStack.push(14);
            MaximumStack.push(20);
            System.out.println(MaximumStack.peekMax());
            MaximumStack.pop();
            System.out.println(MaximumStack.peekMax());
            MaximumStack.pop();
            System.out.println(MaximumStack.peekMax());
            MaximumStack.pop();
            System.out.println(MaximumStack.peekMax());
            MaximumStack.pop();
            System.out.println(MaximumStack.peekMax());
            MaximumStack.pop();
            
            System.out.println("List 2");
            MaximumStack.push(40);
            MaximumStack.push(19);
            MaximumStack.push(7);
            MaximumStack.push(14);
            MaximumStack.push(20);
            MaximumStack.push(5);
            System.out.println(MaximumStack.peekMax());
            MaximumStack.pop();
            System.out.println(MaximumStack.peekMax());
            MaximumStack.pop();
            System.out.println(MaximumStack.peekMax());
            MaximumStack.pop();
            System.out.println(MaximumStack.peekMax());
            MaximumStack.pop();
            System.out.println(MaximumStack.peekMax());
            MaximumStack.pop();
            System.out.println(MaximumStack.peekMax());
            MaximumStack.pop();
            MaximumStack.pop();//to check exception
        } catch (Exception ex) {
            System.out.println("Exception "+ex.getMessage());
            Logger.getLogger(MaxStack.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
