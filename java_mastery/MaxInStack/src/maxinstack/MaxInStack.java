/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maxinstack;

import java.util.Objects;
import java.util.Optional;
import java.util.Stack;

/**
 * This stack will return only the max element no matter how many times it is popped
 * @author payal
 */
public class MaxInStack {
    static int MAXSIZE =5;
    static int count=0;
    static Stack<Double> mainStack=new Stack<>();
    static Stack<Double> auxMaxStack=new Stack<>();
    static Optional<Double> pop(){
        if (auxMaxStack.empty() || mainStack.empty()){
            return Optional.empty();
        }
        Double maxEle=auxMaxStack.peek();
        Double mainEle=mainStack.peek();
        System.out.println(maxEle+"::"+mainEle);
        if (Objects.equals(maxEle, mainEle)){
            System.out.println("popped auxMaxStack");
            auxMaxStack.pop();
        }
        Double top=mainStack.pop();
        count--;
        return Optional.of(top);
    }
    static Optional<Double> push(double num){
        if (mainStack.isEmpty()|| auxMaxStack.isEmpty()){
            System.out.println("first push in auxMaxStack");
            auxMaxStack.push(num);
        }else if (count==MAXSIZE){
            return Optional.empty();
        }else{
            Double top=auxMaxStack.peek();
            if (top<num){
                auxMaxStack.push(num);
            }
        }
        mainStack.push(num);
        count++;
        return Optional.of(num);
    }
    static Optional<Double> peek(){
        if (mainStack.isEmpty()){
            return Optional.empty();
        }
        return Optional.of(mainStack.peek());
    }
    
    static Optional<Double> peekMax(){
        if (auxMaxStack.isEmpty()){
            return Optional.empty();
        }
        return Optional.of(auxMaxStack.peek());
    }
    static void printElement(Optional<Double> top, boolean isMaxElement){
        if (top.isEmpty()){
            System.out.println("Stack is empty");
        }else{
            Double topElement=top.get();
            String prefix = isMaxElement?"MAX ":"NORMAL ";
            System.out.println(prefix+topElement);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        if (MaxInStack.push(14.3).isEmpty()){
            System.out.println("Stack is full. Pop an element and try again");
        }
        if (MaxInStack.push(20.3).isEmpty()){
            System.out.println("Stack is full. Pop an element and try again");
        }
        if (MaxInStack.push(9.3).isEmpty()){
            System.out.println("Stack is full. Pop an element and try again");
        }
        if (MaxInStack.push(11.3).isEmpty()){
            System.out.println("Stack is full. Pop an element and try again");
        }
        if (MaxInStack.push(15.3).isEmpty()){
            System.out.println("Stack is full. Pop an element and try again");
        }
        if (MaxInStack.push(18.3).isEmpty()){//to check stack full condition
            System.out.println("Stack is full. Pop an element and try again");
        }
        
        Optional<Double> top;
        top=MaxInStack.peekMax();
        MaxInStack.printElement(top,true);
        top=MaxInStack.pop();
        MaxInStack.printElement(top,false);
        
        top=MaxInStack.peekMax();
        MaxInStack.printElement(top,true);
        top=MaxInStack.pop();
        MaxInStack.printElement(top,false);
        
        top=MaxInStack.peekMax();
        MaxInStack.printElement(top,true);
        top=MaxInStack.pop();
        MaxInStack.printElement(top,false);
        
        top=MaxInStack.peekMax();
        MaxInStack.printElement(top,true);
        top=MaxInStack.pop();
        MaxInStack.printElement(top,false);
        
        top=MaxInStack.peekMax();
        MaxInStack.printElement(top,true);
        top=MaxInStack.pop();
        MaxInStack.printElement(top,false);
        
        top=MaxInStack.peekMax();
        MaxInStack.printElement(top,true);
        top=MaxInStack.pop();
        MaxInStack.printElement(top,false);
    }
    
}


