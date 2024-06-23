/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraywithtwostacks;

import java.util.EmptyStackException;

/**
 *
 * @author payal
 */
enum StackId{
    One,
    Two
}
public class ArrayWithTwoStacks {
    private int[] dataArray;
    private int size,topOne,topTwo;
    public ArrayWithTwoStacks(int size){
        this.dataArray=new int[size];
        this.size=size;
        this.topOne=-1;
        this.topTwo=size;
    }
    
    public void push(StackId id, int data){
        if (topTwo==topOne+1){
            throw new StackOverflowError("Array is full");
        }
        if (id == StackId.One){
            this.dataArray[++topOne]=data;
        }else{
            this.dataArray[--topTwo]=data;
        }
    }
    
    public int pop(StackId id){
        if (id==StackId.One){
            if (topOne==-1){
                throw new EmptyStackException();
                
            }
            int popped = this.dataArray[topOne--];
            return popped;
        }else{
            if (topTwo==this.size){
                throw new EmptyStackException();
                
            }
            int popped = this.dataArray[topTwo++];
            return popped;
        }
    }
    
    public int top(StackId id){
        if (id==StackId.One){
            if (topOne==-1){
                throw new EmptyStackException();
            }
            return this.dataArray[topOne];
        }else{
            if (topTwo==size){
                throw new EmptyStackException();
            }
            return this.dataArray[topTwo];
        }
    }
    
    public boolean isEmpty(StackId id){
        if (id==StackId.One){
            return topOne==-1;
        }
        return topTwo==size;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayWithTwoStacks stack=new ArrayWithTwoStacks(4);
        try{
                    
            stack.push(StackId.One, 0);
            stack.push(StackId.One, 1);
            stack.push(StackId.Two, 2);
            stack.push(StackId.Two, 3);
            //stack.push(StackId.One, 11);

            while(!stack.isEmpty(StackId.One) && !stack.isEmpty(StackId.Two)){
                System.out.println(stack.top(StackId.One));
                System.out.println(stack.top(StackId.Two));
                stack.pop(StackId.One);
                stack.pop(StackId.Two);
            }
        }catch(StackOverflowError err){
            System.err.println(err.getMessage());
        }catch(EmptyStackException err){
            System.err.println("Stack is empty");
        }
        
    }
    
}
