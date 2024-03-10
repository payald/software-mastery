/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collections1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author payal
 */
public class Collections1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Room room1=new Room(10,1,"Basic");
        Room room2=new Room(1000,5,"Suite");
        Room room3=new Room(100,3,"Family");
        Collection<Room> rooms=new ArrayList<>(List.of(room1,room2,room3));
        System.out.println(getTotalRevenue(rooms));
        
    }
    private static double getTotalRevenue(Collection<Room> rooms){
        return rooms.stream().mapToDouble(r->r.getRate()).sum();
    }
    
}
