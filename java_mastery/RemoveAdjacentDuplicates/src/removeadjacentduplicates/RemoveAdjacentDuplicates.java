/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package removeadjacentduplicates;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 *
 * @author payal
 */
public class RemoveAdjacentDuplicates {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Deque<Integer> stk=new ArrayDeque<>(Arrays.asList(1,5,6,8,8,8,0,1,1,0,6,5));
        Deque<Integer> newStk = removeAdjacentDuplicates(stk);
        newStk.forEach(element->System.out.println(element));
    }
    public static Deque<Integer> removeAdjacentDuplicates(Deque<Integer> stk){
        Deque<Integer> newStk=new ArrayDeque<>();
        if (stk.isEmpty()){
            return newStk;
        }
        
        int top=stk.pop();
        while(!stk.isEmpty()){
            if (stk.peek()!=top){
                newStk.push(top);
                top=stk.pop();
            }else{
                stk.pop();
            }
        }
        if (stk.isEmpty()){
            newStk.push(top);
        }
        return newStk;
    }
    
}
