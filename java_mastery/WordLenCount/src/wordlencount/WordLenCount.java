/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package wordlencount;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author payal
 */
public class WordLenCount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String line="a string of mostly smaller words";
        
        List<String> arr=Arrays.stream(line.split(" ")).filter(w->w.length()<6).collect(Collectors.toList());
        if (arr.isEmpty()){
            System.out.println("0 words");
        }else{
            for(String word:arr){
                System.out.println(word);
            }
        }
   }
    
}
