/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package wordoccurrence;

import java.util.Arrays;

/**
 *
 * @author payal
 */
public class WordOccurrence {

    public static int findWordOccurrence(String line,String word){
        String cleanUpString=line.replaceAll("\\.", "");
        String words[]=cleanUpString.split(" ");
        int count=0;
        for(String eachWord:words){
            if (word.equalsIgnoreCase(eachWord)){
                count++;
            }
        }
        return count;
    }
    public static int findWordOccurrenceStream(String line,String word){
        String cleanUpString=line.replaceAll("\\.", "");
        return (int) Arrays.stream(cleanUpString.split(" ")).filter(eachWord->eachWord.equalsIgnoreCase(word)).count();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String line="There was once a cat";
        String word="dog";
        int count = findWordOccurrence(line, word);
        System.out.println(line);
        System.out.println(word);
        System.out.println("Word appears "+count+" times");
        line="It was a long day. It was also hot outside. That's how it was.";
        word="it";
        count = findWordOccurrenceStream(line, word);
        System.out.println(line);
        System.out.println(word);
        System.out.println("Word appears "+count+" times");
    }
    
}
