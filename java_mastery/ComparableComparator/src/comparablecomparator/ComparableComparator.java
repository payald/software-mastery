/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comparablecomparator;

/**
 *
 * @author payal
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person implements Comparable<Person> {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.age, other.age); // Sort by age
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}



class Lady {
    String name;
    int age;

    public Lady(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}


public class ComparableComparator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));

        // Sorting using Comparable
        Collections.sort(people);
        System.out.println("Sorted by age: " + people);
        }
        {
            List<Lady> people = new ArrayList<>();
        people.add(new Lady("Alice", 30));
        people.add(new Lady("Bobby", 25));
        people.add(new Lady("Charlie", 35));

        // Sorting by name using Comparator
        Collections.sort(people, new Comparator<Lady>() {
            @Override
            public int compare(Lady p1, Lady p2) {
                return p1.name.compareTo(p2.name); // Sort by name
            }
        });

        System.out.println("Sorted by name: " + people);
        
        // Sorting by age using a lambda expression
        Collections.sort(people, (p1, p2) -> Integer.compare(p1.age, p2.age)); // Sort by age
        System.out.println("Sorted by age: " + people);
        }
        
    }
    
}
