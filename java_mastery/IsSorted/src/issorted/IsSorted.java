/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package issorted;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author payal
 */
public class IsSorted {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(1,2,3,9,6));
        for(int num:arr){
            System.out.print(num+" ");
        }
        int size = arr.size();
        if (isSorted(arr,size-1,size-1)){
            System.out.println("\nArray is sorted");
        }else{
            System.out.println("\nArray is not sorted");
        }
    }
    
    public static boolean isSorted(ArrayList<Integer> arr, int index, int size){
        if (size<2 || index==0){
            return true;
        }
        return arr.get(index-1)>arr.get(index)?false:isSorted(arr,index-1,size);
    }
    
}
