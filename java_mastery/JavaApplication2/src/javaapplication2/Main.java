/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author payal
Matrix before rotation
1 2 3 
4 5 6 
7 8 9 
Matrix after transpose
1 4 7 
2 5 8 
3 6 9 
Matrix after rotation
7 4 1 
8 5 2 
9 6 3 
 */
public class Main {
    public static final Integer[][] arr={{1,2,3},{4,5,6},{7,8,9}};
    public static final Integer[][] array={{1,2,3},{4,5,6},{7,8,9}};
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Payal is a pure soul");
        System.out.println("Matrix before rotation");
        Matrix.printMatrix(arr);
        
        Matrix.transposeMatrix(array);
        System.out.println("Matrix after transpose");
        Matrix.printMatrix(array);
        
        //In order to rotate the array 90degree clockwise, we first do
        //transpose and then reverse each row in the matrix
        Matrix.rotateMatrix(arr);
        System.out.println("Matrix after rotation");
        Matrix.printMatrix(arr);
    }
}
