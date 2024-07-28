/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package productexceptself;

/**
 * https://leetcode.com/problems/product-of-array-except-self/description/
 * Given an integer array nums, return an array answer such that answer[i] is equal 
 * to the product of all the elements of nums except nums[i].
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer. 
 * You must write an algorithm that runs in O(n) time and without using the division operation.
 * @author payal
 */
public class ProductExceptSelf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] nums=new int[]{1,2,3,4};
        int[] prES=productExceptSelf(nums);
        for(int num:prES){
            System.out.println(num+" ");
        }
    }
    
    public static int[] productExceptSelf(int[] nums) {
        int left=1;
        int len=nums.length;
        int right=len-2;
        int[] prefix=new int[len];
        int[] suffix=new int[len];
        int[] productES=new int[len];
        prefix[0]=nums[0];
        suffix[len-1]=nums[len-1];
        while(left<len && right>0){
            prefix[left]=prefix[left-1]*nums[left];
            suffix[right]=suffix[right+1]*nums[right];
            left++;
            right--;
        }
        int index=1;
        productES[0]=suffix[1];
        while(index<len-1){
            productES[index]=prefix[index-1]*suffix[index+1];
            index++;
        }
        productES[len-1]=prefix[len-2];
        return productES;
    }
}
