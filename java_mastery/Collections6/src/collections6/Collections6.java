/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collections6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author payal
 */
public class Collections6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Set<Room> rooms = new HashSet<>();
        //Set does not allow duplicates
        //HashSet does not guarantee order but linkedHashSet guarantees order
        //TreeSet - elements are in sorted order using BST
        Room r1=new Room("Suite",1,1);
        Room r2=new Room("Classic",2,2);
        Room r3=new Room("Suite",3,3);
        Room r4=new Room("Suite",3,3);
        
        rooms.add(r1);
        rooms.add(r2);
        rooms.add(r3);
        rooms.add(r4);
        
        rooms.stream().map(r->r.getType()).forEach(System.out::println);
        
        Set<Room> otherRooms=Set.of(r1,r2);
        //otherRooms.add(r4); not allowed as immutable collection
        
        Set<Room> moreRooms=Set.copyOf(rooms);
        //moreRooms.add(r4); not allowed as immutable collection
        
        List<Integer> list = new ArrayList<>(Arrays.asList(100,1000,200,500));
        NavigableSet<Integer> tree=new TreeSet<>(list);
        tree.descendingSet().stream().forEach(System.out::println);
        tree.headSet(500).stream().forEach(System.out::println);
    }
    
}
