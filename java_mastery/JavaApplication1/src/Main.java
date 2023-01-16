
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author payal
 * Display all subarrays of an array
 * Reference - https://www.scaler.com/topics/course/dsa-beginners-java/video/730/
 */
public class Main {
    static int[] arr={1,2,3,4,5,6};

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Payal is a pure soul");
        System.out.println("Array is ");
        for(int element:arr){
            System.out.print(element + " ");
        }
        ChildClass<Integer> cc = new ChildClass<>();
        int arrSize = arr.length;
        int index=0;
        Integer[] array=new Integer[arrSize];
        for(int val:arr){
            array[index++]=val;
        }
        ArrayList<ArrayList<Integer>> subArrs=cc.getSubArrays(array);
        cc.printArrays(subArrs);
    }
    
}
