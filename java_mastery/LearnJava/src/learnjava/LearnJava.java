/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package learnjava;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 *
 * @author payal
 */
public class LearnJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        {
        //Filters elements based on a predicate (a condition).


        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        List<String> filteredNames = names.stream()
                                  .filter(name -> name.startsWith("A"))  // Keep only names starting with 'A'
                                  .collect(Collectors.toList());
        System.out.println(filteredNames);  // Output: [Alice]
        }

        {
            //Transforms each element of the stream using a given function.


        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        List<Integer> nameLengths = names.stream()
                                 .map(String::length)  // Convert each name to its length
                                 .collect(Collectors.toList());
        System.out.println(nameLengths);  // Output: [5, 3, 7]

        }
        {
            //Sorts the elements of the stream.


            List<String> names = Arrays.asList("Charlie", "Alice", "Bob");
            List<String> sortedNames = names.stream()
                                .sorted()  // Sort in natural order
                                .collect(Collectors.toList());
            System.out.println(sortedNames);  // Output: [Alice, Bob, Charlie]

        }
        
        {
            //Collects the result into a collection, such as a List, Set, or Map.

            List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
            Set<String> namesSet = names.stream()
                            .collect(Collectors.toSet());
            System.out.println(namesSet);  // Output: [Bob, Charlie, Alice] (unordered because it's a Set)

        }
        
        {
            //Performs an action for each element. Commonly used for printing or modifying elements.

            List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
            names.stream()
                    .forEach(System.out::println);  // Output: Alice Bob Charlie (each on a new line)

        }
        {
            //Combines elements of the stream into a single value using an associative accumulation function.
            List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
            int sum = numbers.stream()
                                .reduce(0, (a, b) -> a + b);  // Sum of all numbers
            System.out.println(sum);  // Output: 15


        }
        {
            //Removes duplicate elements.

            List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
            List<Integer> distinctNumbers = numbers.stream()
                                       .distinct()
                                       .collect(Collectors.toList());
            System.out.println(distinctNumbers);  // Output: [1, 2, 3, 4, 5]

        }
        
        {
            List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
            names.parallelStream()
                    .filter(name -> name.length() > 3)
                    .forEach(System.out::println);

        }
        
        {
            List<String> names = Arrays.asList("Charlie", "Bob", "Alice", "David");

            // Sorting using a lambda expression
            Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
            System.out.println("Sorted names: " + names);  // Output: [Alice, Bob, Charlie, David]

            // Using forEach with a lambda expression
            names.forEach(name -> System.out.println("Hello, " + name));
        }
        {
            
        }
    }
    
}
