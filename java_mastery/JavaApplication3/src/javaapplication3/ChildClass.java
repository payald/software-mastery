/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author payal
 */
public class ChildClass {
    //Remove all even elements
    public int[] removeEven(int arr[]){
        int len=arr.length;
        int oddElements=0;
        for(int i=0;i<len;i++){
            if(arr[i]%2!=0){
                oddElements++;
            }
        }
        int[] oddArray=new int[oddElements];
        int j=0;
        for(int i=0;i<len;i++){
            if (arr[i]%2!=0){
                oddArray[j++]=arr[i];
            }
            
        }
        return oddArray;
    }
    
}
