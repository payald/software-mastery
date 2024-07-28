/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package frequencysort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode.com/problems/sort-array-by-increasing-frequency/description/
 * Given an array of integers nums, sort the array in increasing order based 
 * on the frequency of the values. If multiple values have the same frequency, 
 * sort them in decreasing order. Return the sorted array.
 * @author payal
 */
public class FrequencySort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] nums=new int[]{-1,1,-6,4,5,-6,1,4,1};
        int[] newList=frequencySort(nums);
        for(int num:newList){
            System.out.println(num+" ");
        }
    }
    
    private static int[] frequencySort(int[] nums){
        Arrays.sort(nums);
        Map<Integer,Integer> freqs=new HashMap<>();
        
        //create a hashmap of frequencies
        for(int i=0;i<nums.length;i++){
            int val=freqs.containsKey(nums[i])?freqs.get(nums[i])+1:1;
            freqs.put(nums[i],val);
            
        }
        Map<Integer,Integer> sortedFreqs=getSortedMap(freqs);
        
        int index=0;
        for(Map.Entry<Integer,Integer> entry:sortedFreqs.entrySet()){
            for(int i=0;i<entry.getValue();i++){
                nums[index++]=entry.getKey();
            }
        }
        
        return nums;
    }
    private static Map<Integer,Integer> getSortedMap(Map<Integer,Integer> map){
        //Convert map to list and sort it
        List<Map.Entry<Integer,Integer>> list=new LinkedList<>(map.entrySet());
        Collections.sort(list, (new Comparator<Map.Entry<Integer, Integer>> () {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, 
                               Map.Entry<Integer, Integer> o2)
            {
                //acs order
                int ret= (o1.getValue()).compareTo(o2.getValue());
                if (ret==0){
                    //desc order
                    return (o2.getKey()).compareTo(o1.getKey());
                }
                return ret;
            }
        }));
        //LinkedHashMap is used to retain the sorted list
        Map<Integer,Integer> sortedMap=new LinkedHashMap<>();
        for(Map.Entry<Integer,Integer> entry:list){
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }
    
}
