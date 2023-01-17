/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author payal
 * Print the transpose of a matrix
 */
public class Matrix {

    public static void printMatrix(Integer[][] arr){
        for (Integer[] arrRows : arr) {
            for (int col = 0; col<arr[0].length; col++) {
                System.out.print(arrRows[col] + " ");
            }
            System.out.println();
        }
    }
    
    public static void transposeMatrix(Integer[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<i;j++){
                int temp=arr[j][i];
                arr[j][i]=arr[i][j];
                arr[i][j]=temp;
            }
        }
    }
    public static void rotateMatrix(Integer[][] arr){
        transposeMatrix(arr);
        for(Integer[] arrRow:arr){
            int left=0;
            int right=arrRow.length-1;
            while(left<right)
            {
                int temp=arrRow[right];
                arrRow[right]=arrRow[left];
                arrRow[left]=temp;
                left++;right--;
            }
        }
    }
}
