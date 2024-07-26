/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package friendoffriends;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * X is the friend and Y is his friend but Y is not my friend so Y is friend of friend
 * @author payal
 */
public class FriendOfFriends {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      Map<Character,List<Character>> friends=Map.of(
      'a', Arrays.asList('b', 'c'),
      'b', Arrays.asList('d', 'g'),
      'd', Arrays.asList('p', 'q'),
      'l', Arrays.asList('x', 'y')
    );
        System.err.println("Friends of friends of a");
        for(Character friend:getFriendOfFriends(friends,'a')){
            System.err.println(friend+" ");
        }
    }
    
    private static List<Character> getFriendOfFriends(Map<Character,List<Character>> friends, Character friend){
        List<Character> directFriends=friends.get(friend);
        List<Character> friendOfFriends=new ArrayList<>();
        
        for(Character eachfriend:directFriends){
            for(Character myFriend:friends.getOrDefault(eachfriend,Arrays.asList())){
                if (!directFriends.contains(myFriend)){
                    friendOfFriends.add(myFriend);
                }
            }
        }
        return friendOfFriends;
    }
    
}
