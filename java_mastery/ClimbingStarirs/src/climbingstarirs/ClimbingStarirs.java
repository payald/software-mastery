/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package climbingstarirs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * https://leetcode.com/problems/climbing-stairs/description/
 * https://www.youtube.com/watch?v=Y0lT9Fck7qI
 * @author payal
 */
public class ClimbingStarirs {
    private static List<Integer> count=new ArrayList<>();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=5;
        System.out.println(climbStairsBackTracking(n));
        List<Integer> countList=new ArrayList<>(Collections.nCopies(n+1, -1));
        System.out.println(climbStairsDP(n,countList));
        System.out.println(climbStairsDPBottomUP(n));
    }
    
    //using DP bottom up
    private static int climbStairsDPBottomUP(int n){
        int one=1;
        int two=1;
        for(int i=0;i<n-1;i++){
            int temp=one;
            one=one+two;
            two=temp;
        }
        return one;
    }
    
    //using backtracking
    private static int climbStairsBackTracking(int n){
        if (n==0){
            return 1;
        }
        int count=0;
        if (n>=1){
            count=climbStairsBackTracking(n-1);
            
        }
        
        if (n>=2){
            count+=climbStairsBackTracking(n-2);
        }
        return count;
    }
    
    //using dynamic programming memoization(optimized approach)O(n)
    private static int climbStairsDP(int n, List<Integer> countList){
        if (n==0){
            return 1;
        }
        int countStairs=countList.get(n);
        if (countStairs!=-1){
            return countStairs;
        }
        countStairs=0;
        if (n>=1){
            countStairs=climbStairsDP(n-1,countList);
            
        }
        
        if (n>=2){
            countStairs+=climbStairsDP(n-2,countList);
        }
        countList.add(n, countStairs);
        return countStairs;
    }
    
}
