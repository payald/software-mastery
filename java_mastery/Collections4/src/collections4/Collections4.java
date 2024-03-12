/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collections4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author payal
 */
public class Collections4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Avoid ConcurrentModificationException for modification during iteration
        Room r1= new Room("Suite",1,1);
        Room r2= new Room("Basic",12,12);
        Room r3= new Room("Classic",13,13);
        Room r4= new Room("Luxury",14,14);
        r4.setIsPetFriendly(true);
        Collection<Room> rooms = new ArrayList<>(Arrays.asList(r1,r2,r3,r4));
        System.out.println(rooms);
        
        //Using iterator method
        Iterator<Room> itr=rooms.iterator();
        while(itr.hasNext()){
        Room room=itr.next();
        System.out.println(room.getType());
        if (room.isIsPetFriendly()){
        itr.remove();
        }
        }
        
        
        /*
        //one way is to create a list of removables
        Collection<Room> removeRooms = new ArrayList<>();
        for(Room room:rooms){
        if (room.isIsPetFriendly()){
        removeRooms.add(room);
        }
        }
        rooms.removeAll(removeRooms);
         */
        /*
        rooms.stream().filter(new Predicate<Room>(){
            @Override
            public boolean test(Room room) {
                return room.isIsPetFriendly();
            }
            
        }).forEach(new Consumer<Room>(){
            @Override
            public void accept(Room room) {
                System.out.println(room.getType());
            }
            
        });
*/
        System.out.println(rooms);
        //rooms.stream().filter(room->room.isIsPetFriendly()).forEach(room->System.out.println(room.getType()));
        r1.setIsPetFriendly(true);
        Collection<Room> petFriendly=rooms.stream().filter(Room::isIsPetFriendly).collect(Collectors.toList());
        petFriendly.stream().map(r->r.getType()).forEach(System.out::println);
        double sum=petFriendly.stream().mapToDouble(Room::getRate).sum();
        System.out.println(sum);
    }
    
}
