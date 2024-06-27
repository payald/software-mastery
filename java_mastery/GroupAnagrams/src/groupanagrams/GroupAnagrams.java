/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package groupanagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author payal
 * Yes you can have ArrayLists as a keys in a hash map, but it is a very bad idea since they are mutable.

    If you change the ArrayList in any way (or any of its elements), the mapping will 
    * basically be lost, since the key won't have the same hashCode as it had when it was inserted.
    * 
 * The rule of thumb is to use only immutable data types as keys in a hash map. 
 */
public class GroupAnagrams {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String []strs=new String[]{"bat", "tab", "eat", "tea", "tan", "nat","less"};
        List<List<String>> anagrams=groupAnagrams(strs);
        for(List<String> list:anagrams){
            System.out.println();
            for(String anagram:list){
                System.out.print(anagram+" ");
            }
        }
    }
    
    public static List<List<String>> groupAnagrams(String []strs){
        Map<String,List<String>> anagramsMap=new HashMap<>();
        for(String str:strs){
            char []charArray=str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr=String.valueOf(charArray);
            anagramsMap.computeIfAbsent(sortedStr, k->new ArrayList<>()).add(str);
        }
        return new ArrayList<>(anagramsMap.values());
    }
    
    /*
    Time Complexity
The time complexity of the code is primarily determined by two operations: the sorting operation for each string and the insertion into the dictionary.

Sorting Each String: Assuming the average length of the strings is n and there are m strings to sort, the time complexity of sorting each string using the TimSort algorithm (Python's default sort algorithm) is O(n log n). Since we need to sort m such strings, the total time complexity for this part is O(m * n log n).

Inserting into Dictionary: The insertion of m strings into the dictionary has a time complexity of O(m), since each insertion operation into a dictionary is O(1) on average.

Combining these two, we get the total time complexity as O(m * n log n).
    
    
    Space Complexity
The space complexity is due to the storage of m entries in the dictionary and the lists of anagrams.

Dictionary Storage (HashMap): The dictionary stores lists of anagrams. In the worst case, all strings are anagrams of each other, requiring O(m * n) space (since each of the m strings of length n can be in the same list).

Sorted String Keys: Additionally, for each string, we create a sorted copy to use as a key. Since we sort each string in place and only have m keys at any point in time, the space for the keys would be O(m * n).

Therefore, the total space complexity of the algorithm is O(m * n), as it dominates over the constant factors and smaller terms.
    */
    
}
