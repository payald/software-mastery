/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package validanagrams;

import java.util.HashMap;

/**
 *
 * @author payal
 */
public class ValidAnagrams {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean isValid = isValidAnagrams("abcd", "dabc");
        if (isValid){
            System.out.println("valid");
        }else{
            System.out.println("not valid");
        }
    }
    public static boolean isValidAnagrams(String str1, String str2){
        int len1=str1.length();
        int len2=str2.length();
        if (len1!=len2){
            return false;
        }
        HashMap<Character,Integer> counter=new HashMap<>();
        char[] chars1=str1.toCharArray();
        for(char ch:chars1){
            if (counter.containsKey(ch)){
                counter.put(ch, counter.get(ch)+1);
            }else{
                counter.put(ch, 1);
            }
        }
        char[] chars2=str2.toCharArray();
        for(char ch:chars2){
            if (!counter.containsKey(ch)){
                return false;
            }else{
                int value=counter.get(ch);
                if (value==0){
                    return false;
                }
                counter.put(ch, value-1);
            }
        }
        return true;
    }
    
}
