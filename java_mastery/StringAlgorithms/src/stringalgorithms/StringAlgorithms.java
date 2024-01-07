/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringalgorithms;

/**
 *
 * @author payal
 */
public class StringAlgorithms {

    public static boolean isAllUpperCase(String str){
        return str.chars().allMatch(Character::isUpperCase);
    }
    public static boolean isComplexPassword(String str){
        return str.chars().anyMatch(Character::isDigit) &&
                str.chars().anyMatch(Character::isUpperCase) &&
                str.chars().anyMatch(Character::isUpperCase);
    }
    public static String normalize(String str){
        return str.toLowerCase().trim().replace(",", "");
    }
    public static String reverse(String str){
        if (str==null || str.isEmpty()){
            return str;
        }
        StringBuilder reversed=new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
    public static String reverse2(String str){
        if (str==null || str.isEmpty()){
            return str;
        }
        StringBuilder newStr=new StringBuilder(str);
        return newStr.reverse().toString();
    }
    public static String reverseWords(String str){
        if (str==null || str.isEmpty()){
            return str;
        }
        String[] words=str.split(" ");
        
        StringBuilder newStr=new StringBuilder();
        for (String word : words) {
            newStr.append(word);
            newStr.append(" ");
        }
        newStr.trimToSize();
        return newStr.toString();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(isAllUpperCase("Hello"));
        System.out.println(isAllUpperCase("HELLO"));
        System.out.println(isComplexPassword("PSSpss!1"));
        System.out.println(isComplexPassword("pss!1"));
        System.out.println(normalize("   ABNrtyu,   iowTY  "));
        System.out.println(reverse("Hello"));
        System.out.println(reverse2("Payal"));
        System.out.println(reverse2("I love maa"));
    }
    
}
