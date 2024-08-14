/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package miscsolutions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author payal
 */
public class MiscSolutions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Sum of all  even numbers
        int[] arr={1,2,3,4,5,6,7,8};
        int sum=Arrays.stream(arr).filter(n->n%2==0).sum();
        System.out.println(sum);
        
        String[] arr2={"apple","mango","apple","orange","apple"};
        long cnt=Arrays.stream(arr2).filter(word->word.equals("apple")).count();
        System.out.println(cnt);
        
        List<String> list=Arrays.asList("apple","banana","pear","grape");
        Map<Integer,List<String>> map=list.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(map);
        
        String joined=list.stream().collect(Collectors.joining("*"));
        System.out.println(joined);
    }
    
}
