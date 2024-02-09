/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reverselist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author payal
 */
public class ReverseList {
    
    public static List<Integer> reverseList(List<Integer> list){
        List<Integer> revList=new ArrayList<>(list);
        Collections.reverse(revList);
        return revList;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        List<Integer> list=Arrays.asList(2,5,20,30,56);
        List<Integer> reversedList=list.reversed();
        for(int num:list){
            System.out.println(num);
        }
        System.out.println("---------------------------");
        for(int num:reversedList){
            System.out.println(num);
        }
        
        List<Integer> revList=reverseList(list);
        System.out.println("---------------------------");
        for(int num:revList){
            System.out.println(num);
        }
    }
    
}
