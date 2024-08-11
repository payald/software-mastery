/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package encodedecode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author payal
 */
public class EncodeDecode {
    static final char DELIMITER ='#';
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<String> strs=new ArrayList<>(Arrays.asList("lint","loves","you"));
        String encodedStr=encode(strs);
        System.out.println(encodedStr);
        for(String str:decode(encodedStr)){
            System.err.println(str);
        }
    }    
    
    private static String encode(List<String> strs){
        String encodedString=new String();
        
        for(String str:strs){
            int len=str.length();
            encodedString=encodedString+len+DELIMITER+str;
        }
        return encodedString;
    }
    
    private static List<String> decode(String str){
        List<String> strs=new ArrayList<>();
        char[] chars=str.toCharArray();
        for(int i=0;i<chars.length;i++){
            if (Character.isDigit(chars[i])){
                if (chars[i+1]==DELIMITER){
                    int len=chars[i]-'0';
                    String decodedString=String.copyValueOf(chars, i+2, len);
                    strs.add(decodedString);
                    i+=len+1;
                }               
            }
        }
        return strs;
    }
}
