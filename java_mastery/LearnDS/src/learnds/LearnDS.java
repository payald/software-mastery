/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package learnds;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author payal
 */
public class LearnDS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String arr[]=new String[5];
        System.out.println(Arrays.toString(arr));
        arr[0]="Mon";
        System.out.println(Arrays.toString(arr));
        arr=new String[]{"hi","bye","kai"};
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i].toUpperCase();
        }
        System.out.println(Arrays.toString(arr));
        
        List<Integer> list=Arrays.asList(1,2,3,4,5,6,7);
        for(int num:list){
            System.out.println(num);
        }
        int array[]=new int[]{1,2,3,5,4,6,7,8};
        Arrays.sort(array);
        int index=Arrays.binarySearch(array, 7);
        System.out.println("Bin search 7 - "+index);
        
        List<String> fruits=new LinkedList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("pear");
        System.out.println(fruits);
        fruits.add(1,"mango");
        System.out.println(fruits);
        fruits.remove("mango");
        System.out.println(fruits);
        List<String> synchronizedList=Collections.synchronizedList(fruits);
        System.out.println(synchronizedList);
        Collections.sort(fruits);
        
        for(int i=0;i<fruits.size();i++){
            System.out.println(fruits.get(i));
        }
        int i=Collections.binarySearch(fruits, "pear");
        System.out.println("pear index "+ i);
        
        Deque<String> stack=new ArrayDeque<>();
        stack.push("First");
        stack.push("Second");
        stack.push("Third");
        System.out.println(stack);
        System.out.println("top of stack "+stack.peek());
        stack.poll();//returns null if empty used to deque
        System.out.println(stack);
        stack.pop();//throws exception if empty used to deque
        System.out.println(stack);
        boolean found=stack.contains("First");
        System.out.println("Found first "+ found);
       
        
        Queue<String> queue=new PriorityQueue<>();//ArrayDeque can be used
        queue.offer("Person One");
        queue.offer("Person Two");
        queue.offer("Person Three");
        System.out.println(queue);
        System.out.println("top of queue "+queue.peek());
        queue.poll();//returns null if empty used to deque
        System.out.println(queue);
        
        found=queue.contains("First");
        System.out.println("Found first "+ found);
        
        
        Set<Integer> set=new TreeSet<>();
        set.add(1);
        set.add(1000);
        set.add(11);
        System.out.println(set);
        set.add(1);
        System.out.println(set);
        set.remove(1);
        System.out.println(set);
        found=set.contains(1);
        System.out.println("1 is "+found);
        
        Set<String> myset=new TreeSet<>(Comparator.comparing(String::length));
        myset.add("giraffe");
        myset.add("bear");
        myset.add("tiger");
        myset.add("wolf");//this wont be added since same length as bear
        System.out.println(myset);
        
        Map<Integer,Integer> mymap=new HashMap<>();
        mymap.put(1, 1);
        mymap.put(2, 2);
        mymap.put(3, 3);
        mymap.put(4, 4);
        System.out.println(mymap);
        System.out.println("3 is "+mymap.get(3));
        System.out.println("is key 1 present ? "+mymap.containsKey(1));
        System.out.println("is value 1 present ? "+mymap.containsValue(1));
        Set<Integer> keys=mymap.keySet();
        System.out.println("keys "+keys);
        for(int key:keys){
            System.out.println(key+"="+mymap.get(key));
        }
        mymap.remove(4);
        for(Entry<Integer,Integer> entry:mymap.entrySet()){
            System.out.println(""+entry.getKey()+"="+entry.getValue());
            entry.setValue(11);
        }
        Collection<Integer> values=mymap.values();
        System.out.println(values);
    }
    
}
