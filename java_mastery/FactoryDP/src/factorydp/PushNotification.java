/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorydp;

/**
 *
 * @author payal
 */
public class PushNotification implements Notification {

    @Override
    public void notifyUser(String message) {
        System.out.println("Push notification "+message);
    }
    
}
