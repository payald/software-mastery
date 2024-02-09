/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package average;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author payal
 */
public class Average {

    public static double getAvg(List<Integer> list){
        if (list==null || list.isEmpty()){
            return 0;
        }
        return list.stream().reduce(0, Integer::sum)/(double)list.size();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Integer> list=Arrays.asList(2,3,4);
        double avg=getAvg(list);
        System.out.println("Avg is " +avg);
    }
    
}
