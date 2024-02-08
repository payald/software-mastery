/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorydp;

/**
 *
 * @author payal
 */
public class NotificationFactory {
    public Notification createNotification(NotificationType type){
        
        switch(type){
            case SMS -> {
                return new SMSNotification();
            }
            case PUSH -> {
                return new PushNotification();
            }
            case EMAIL -> {
                return new EmailNotification();
            }
            default -> throw new IllegalArgumentException("Unknown channel");
        }
        
    }
}
