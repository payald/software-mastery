/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package longestconsequtivesequence;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an unsorted array of integers nums, return the length of the longest consecutive 
 * elements sequence.
 * You must write an algorithm that runs in O(n) time.
 * https://leetcode.com/problems/longest-consecutive-sequence/description/
 * @author payal
 */
public class LongestConsequtiveSequence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] nums={100,4,200,1,3,2};
        int[] nums1={0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestConsecutiveSequence(nums));
        System.out.println(longestConsecutiveSequence(nums1));
    }
    
    private static int longestConsecutiveSequence(int[] nums){
        Set<Integer> numSet=new HashSet<>();
        //set to take care of duplicates as it reduces time complexity
        for(int num:nums){
            numSet.add(num);
        }
        int longest=0;
        
        for(Integer num:numSet){           
            if (!numSet.contains(num-1)) {
                //indicates start of a sequence
                int length=0;
                while(numSet.contains(num+length)){
                    //checking consequtive numbers in sequence
                    length++;
                }
                longest=Math.max(length, longest);
            }
            
        }
        return longest;
    }
}
