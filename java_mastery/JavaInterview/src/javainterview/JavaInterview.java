/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javainterview;

import java.util.Optional;

/**
 *
 * @author payal
 */
public class JavaInterview {
    
    public static void learnOptional(){
        Optional<String> emptyOpt=Optional.empty();
        Optional<String> nameOpt=Optional.of("Gayatri");
        if (nameOpt.isPresent()){
            System.out.println("Hi "+nameOpt.get());
        }else{
            System.out.println("Name is empty");
        }
        if (!emptyOpt.isEmpty()){
            System.out.println("Name is empty");
        }else{
            System.out.println("Hi empty");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        learnOptional();
    }
    
}
