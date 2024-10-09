/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package anagrams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author payal
 */
public class Anagrams {

    
    private static boolean isAnagram(String str1, String str2){
        int len1=str1.length();
        int len2=str2.length();
        if (len1!=len2){
            return false;
        }
        char[] chars1=str1.toCharArray();
        char[] chars2=str2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        
        return Arrays.equals(chars1,chars2);
    }
    
    private static boolean isAnagram2(String str1, String str2){
        int len1=str1.length();
        int len2=str2.length();
        if (len1!=len2){
            return false;
        }
        
        Map<Character,Integer> freq=new HashMap<>();
        for(int i=0;i<len1;i++){
            char ch=str1.charAt(i);
            if (freq.containsKey(ch)){
                freq.put(ch, freq.get(ch)+1);
            }else{
                freq.put(ch, 1);
            }
        }
        for(int i=0;i<len2;i++){
            char ch=str2.charAt(i);
            if (freq.containsKey(ch)){
                int freqCnt=freq.get(ch)-1;
                if (freqCnt<0){
                    return false;
                }
                freq.put(ch, freqCnt);
            }else{
                return false;
            }
        }
        return true;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String[] strs = new String[]{"abcd","cdab"};
        
        
        if (isAnagram(strs[0],strs[1])){
            System.out.println("valid anagram");
        }else{
            System.out.println("invalid anagram");
        }
        
        if (isAnagram2(strs[0],strs[1])){
            System.out.println("valid anagram");
        }else{
            System.out.println("invalid anagram");
        }
    }
    
}
