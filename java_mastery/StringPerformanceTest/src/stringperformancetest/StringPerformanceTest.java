/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringperformancetest;

public class StringPerformanceTest {
    public static void main(String[] args) {
        long startTime, endTime;

        // Using String
        startTime = System.currentTimeMillis();
        String str = "Hello";
        for (int i = 0; i < 10000; i++) {
            str += " World";
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time taken with String: " + (endTime - startTime) + " ms");

        // Using StringBuilder
        startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("Hello");
        for (int i = 0; i < 10000; i++) {
            sb.append(" World");
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time taken with StringBuilder: " + (endTime - startTime) + " ms");

        // Using StringBuffer
        startTime = System.currentTimeMillis();
        StringBuffer sbuf = new StringBuffer("Hello");
        for (int i = 0; i < 10000; i++) {
            sbuf.append(" World");
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time taken with StringBuffer: " + (endTime - startTime) + " ms");
    }
}
