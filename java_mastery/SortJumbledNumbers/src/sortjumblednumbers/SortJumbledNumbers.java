/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sortjumblednumbers;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/sort-the-jumbled-numbers/description/
 * 
 * @author payal
 */
public class SortJumbledNumbers {
    
    static class Pair implements Comparable<Pair>{
        int mappedValue;
        int realValue;
        public Pair(int x, int y){
            mappedValue=x;
            realValue=y;
        }

        @Override
        public int compareTo(Pair o) {
            return mappedValue-o.mappedValue;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] mapping=new int[]{8,9,4,0,2,1,3,5,7,6};
        int[] nums=new int[]{991,338,38};
        int sorted[] =sortJumbled(mapping, nums);
        for(int num:sorted){
            System.out.println(num);
        }
    }
    
    private static int[] sortJumbled(int[] mapping,int[] nums){
        int len=nums.length;
        Pair[] sorted=new Pair[len];
        int i=0;
        for(int num:nums){
            int n=num;
            int newNum=0;
            int cnt=1;
            
            while(n>0){
                int digit=n%10;
                newNum=mapping[digit]*cnt+newNum;                
                n=n/10;
                cnt=cnt*10;                
            }            
            sorted[i++]=new Pair(newNum,num);
            
        }
        Arrays.sort(sorted);
        int[] sortedArray=new int[len];
        i=0;
        for(Pair pair:sorted){
            sortedArray[i++]=pair.realValue;
        }
        return sortedArray;
    }
}
