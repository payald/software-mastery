/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author payal
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] array={1,2,3,4,5,6,7,8,9};
        ChildClass cl=new ChildClass();
        int[] newArray=cl.removeEven(array);
        for(int i=0;i<newArray.length;i++){
            System.out.print(newArray[i]+" ");
        }
    }
    
}
