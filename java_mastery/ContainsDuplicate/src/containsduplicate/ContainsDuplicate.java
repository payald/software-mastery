/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package containsduplicate;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author payal
 */
public class ContainsDuplicate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Integer> list=Arrays.asList(1,2,3,4,1);
        if (containsDuplicate(list)){
            System.out.println("contains duplicate");
        }else{
                System.out.println("does not contain dusplicates");
        }
    }
    
    public static boolean containsDuplicate(List<Integer> nums){
        HashSet<Integer> auxMem=new HashSet<>();
        for(int num:nums){
            if (auxMem.contains(num)){
                return true;
            }else{
                auxMem.add(num);
            }
        }
        return false;
    }
}
