
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
Array is 
1 2 3 4 5 6 
Subarray List
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
1 2 3 4 5 6 
2 3 
2 3 4 
2 3 4 5 
2 3 4 5 6 
3 4 
3 4 5 
3 4 5 6 
4 5 
4 5 6 
5 6 
*/

/**
 *
 * @author payal
 * Prints all the subarrays by using starting index and ending index
 * @param <T>
 */
public class ChildClass<T> {
    
    public ChildClass(){
        
    }
    public ArrayList<ArrayList<T>> getSubArrays(T[] arr){
        int length = arr.length;
        ArrayList<ArrayList<T>> subArrays=new ArrayList<>();
        for(int si=0;si<length-1;si++){
            for(int ei=si+1;ei<length;ei++){
                ArrayList<T> subArray = new ArrayList<>();
                for(int index=si;index<=ei;index++){
                    subArray.add(arr[index]);
                }
                subArrays.add(subArray);
            }
        }
        return subArrays;
    }
    public void printArrays(ArrayList<ArrayList<T>> subarrays){
        System.out.println("\nSubarray List");
        for(ArrayList<T> subArray:subarrays){
            for(T element:subArray){
                System.out.print(element+" ");
            }
            System.out.println();
        }
    }
}
