/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javads;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;


/**
 *
 * @author payal
 */
public class JavaDS {
    
    public static void changeToUpperCase(String[] arr){
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i].toUpperCase();
        }
    }
    
    public static void learnArrays(){
        String[] weekdays=new String[7];
        System.out.println(Arrays.toString(weekdays));
        
        weekdays[0]="Don";
        System.out.println(Arrays.toString(weekdays));
        
        weekdays=new String[]{"Mon","Tue","Wed"};
        System.out.println(Arrays.toString(weekdays));
        
        changeToUpperCase(weekdays);
        System.out.println(Arrays.toString(weekdays));
        
        int[] arr=new int[]{1,2,3,4,5,6,7,8};
        incrementByOne(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    
    
    public static void incrementByOne(int[] arr){
        for(int i=0;i<arr.length;i++){
            arr[i]++;
        }
    }
    
    public static void learnStack(){
        Deque<String> stk=new ArrayDeque<>();
        stk.push("First");
        stk.push("Second");
        stk.push("Third");
        System.out.println(stk);
        System.out.println(stk.peek());
        System.out.println(stk);
        stk.pop();//throws exception if stack is empty
        System.out.println(stk);
        stk.poll();//ame as pop but does not throw an exception
        System.out.println(stk);
        stk.poll();//ame as pop but does not throw an exception
        System.out.println(stk);
        try{
            stk.pop();///this time the stack is empty
        }catch(Exception e){
            System.out.println("exception "+e.getMessage());
        }
    }
    
    public static void learnTree(){
        Set<String> tree=new TreeSet<>();
        tree.add("grapes");
        tree.add("apples");
        tree.add("mangoes");
        tree.add("grapes");//duplicates are not added
        System.out.println(tree);//elements are stored in asc order
        tree.remove("grapes");
        System.out.println(tree);
        
        
        Set<String> wordSet=new TreeSet<>(Comparator.comparing(String::length));
        
        wordSet.add("Giraffe");
        wordSet.add("Bear");
        wordSet.add("Monkey");
        System.out.println(wordSet);
        wordSet.add("deer");//same length as bear so it won't be considered
        System.out.println(wordSet);
    }
    
    
    
    public static void learnQueue(){
        //Queue<String> shoppingList = new LinkedList<>(); Option 1
        //Queue<String> shoppingList = new ArrayDeque<>(); Option 2
        Queue<Integer> shoppingList = new PriorityQueue<>();
        shoppingList.offer(4);
        shoppingList.offer(5);
        shoppingList.offer(1);
        shoppingList.offer(2);
        System.out.println(shoppingList);
        shoppingList.remove(5);
        System.out.println(shoppingList);
        System.out.println("top element "+shoppingList.peek());
        
    }
    
    public static void learnLinkedList(){
        
        List<String> shoppingList = new LinkedList<>();
        shoppingList.add("bb");
        shoppingList.add("zz");
        shoppingList.add("aa");
        shoppingList.add("gg");
        System.out.println(shoppingList);
        shoppingList.add(1, "dd");
        shoppingList.remove("gg");
        shoppingList.removeFirst();
        System.out.println(shoppingList);
        
        //LinkedList is not thread safe by default so it is fast
        
        List<String> synchronizedShoppingList=Collections.synchronizedList(shoppingList);
        System.out.println(synchronizedShoppingList);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        learnArrays();
        learnLinkedList();
        learnStack();
        learnQueue();
        learnTree();
    }
    
}
