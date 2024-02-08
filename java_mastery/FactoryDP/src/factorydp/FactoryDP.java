/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorydp;

/**
 *
 * @author payal
 */
public class FactoryDP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NotificationFactory factory=new NotificationFactory();
        Notification notification=factory.createNotification(NotificationType.SMS);
        notification.notifyUser("Hello here important");
    }
    
}
