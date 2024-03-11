/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collections3;

import java.util.Collection;

/**
 *
 * @author payal
 */
public class Collections3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Room[] rooms = new Room[]{new Room("Suite",1,1),new Room("Suite",2,2)};
        RoomService service = new RoomService();
        service.createRooms(rooms);
        
        Collection<Room> allRooms = service.getInventory();
        for(Room room:allRooms){
            System.out.println(room);
                    
        }
        
    }
    
}
