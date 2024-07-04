/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minmoves;

import java.util.Arrays;

/**
 * Minimum Number of Moves to Seat Everyone - Leetcode 2037
 * https://www.youtube.com/watch?v=wS7Ag33hf8E
 * @author payal
 */
public class MinMoves {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] seats=new int[]{3,1,5};
        int[] students=new int[]{2,7,4};
        System.out.println(minMovesToSeat(seats, students));
    }
    private static int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int count=0;
        for(int i=0;i<seats.length;i++){
            count+=Math.abs(seats[i]-students[i]);
        }
        return count;
    }
}
