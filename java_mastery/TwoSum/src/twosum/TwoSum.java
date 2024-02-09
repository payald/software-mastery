/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package twosum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author payal
 */
public class TwoSum {

    public static List<Integer> findIndices(List<Integer> list,int target){
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<list.size();i++){
            map.put(list.get(i), i);
        }
        for(int i=0;i<list.size();i++){
            int diff=target-list.get(i);
            if (map.containsKey(diff) && map.get(diff)!=i){
                return Arrays.asList(i,map.get(diff));
            }
        }
        return Arrays.asList(-1,-1);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Integer> list=Arrays.asList(2,9,3,6,1,7);
        int target=15;
        List<Integer> indices=findIndices(list, target);
        for(int num:list){
            System.out.println(num);
        }
        System.out.println("---------------------------");
        for(int num:indices){
            System.out.println(num);
        }
    }
    
}
