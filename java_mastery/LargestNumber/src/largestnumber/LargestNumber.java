/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package largestnumber;

import java.util.Arrays;


/**
 * https://www.geeksforgeeks.org/given-an-array-of-numbers-arrange-the-numbers-to-form-the-biggest-number/
 * @author payal
 */
public class LargestNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String[] numbers={ "3", "30", "34", "5", "9" };
        Arrays.stream(numbers).forEach(num->System.err.print(num+" "));
        System.out.println(findLargestNumber(numbers));
        String[] nums={ "54", "546", "548", "60" };
        Arrays.stream(nums).forEach(num->System.err.print(num+" "));
        System.out.println(findLargestNumber(nums));
    }
    private static String findLargestNumber(String[] nums){
        Arrays.sort(nums, (num1,num2)->(num2+num1).compareTo(num1+num2));
        //if array contains all zeros then 
        if ("0".equals(nums[0])){
            return "0";
        }      
        StringBuilder str=new StringBuilder();
        for(String num:nums){
            str.append(num);
        }
        return str.toString();
    }
       
}
