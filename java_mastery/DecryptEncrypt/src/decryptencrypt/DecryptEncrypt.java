/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package decryptencrypt;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author payal
 */
public class DecryptEncrypt {

    public static String encrypt(HashMap<String,String> map, String input){
        String output="";
        int len = input.length();
        for(int i=0;i<len;i++){
            String str = String.valueOf(input.charAt(i));            
            output=output+map.get(str);
            if (i!=len-1){
                output = output+" ";
            }
            
        }
        
        return output;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //String pattern="158-a 157-b ….133-z";
        String pattern ="158-a 157-b 156-c 155-d 154-e 153-f 152-g 151-h";
        String input="heab";
        String in="abc";
        
        HashMap<String,String> map=new HashMap<>();
        
        String[] parts=pattern.split(" ");
        for (String part : parts) {
            String[] sections=part.split("-");
            map.put(sections[1], sections[0]);
        }
        
        for(Map.Entry<String,String> entry:map.entrySet()){
            System.out.print(entry.getKey()+" "+entry.getValue()+",");
        }
        
        System.out.println(input +"->" + encrypt(map,input));
        System.out.println(in +"->" + encrypt(map,in));
    }
    
}
