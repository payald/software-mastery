/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumofsquares;

import java.time.Clock;

/**
 *
 * @author payal
 */
public class SumOfSquares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        sumOfSquares(9);
        sumOfSquares(20);
    }
    //a2+b2=c
    //a2,b2<c
    //a,b<sqrt(c)
    public static void sumOfSquares(int num){
        double sqrtNum = Math.sqrt(num);
        int leftNum = 0;
        int rightNum = (int) sqrtNum;
        while(leftNum<rightNum){
            int total = (leftNum*leftNum+rightNum*rightNum);
            if (total==num){
                System.out.println(leftNum +"+"+rightNum+"="+num);
                break;
            }else if (total<num){
                leftNum+=1;
            }else{
                rightNum-=1;
            }
        }
    }
    
}
