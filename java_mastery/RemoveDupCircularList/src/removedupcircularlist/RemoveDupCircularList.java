/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package removedupcircularlist;

class Node{
    String data;
    Node next;
    Node(String data){
        this.data=data;
        next=null;
    }
}

class CLL{
    private Node tail;
    void add(String data){
        Node newNode=new Node(data);
        if (tail==null){
            tail=newNode;
            tail.next=tail;
        }else{
            newNode.next=tail.next;
            tail.next=newNode;
            tail=newNode;
        }
    }
    void print(){
        System.out.println();
        Node temp=tail.next;
        if (temp==temp.next){
            System.out.print(temp.data+" ");
            
        }else{
            while(temp!=tail){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.print(temp.data+" ");
        }
    }
    void removeDuplicates(){
        if (tail!=tail.next){
            Node temp=tail;
            while(temp.next!=tail){
                Node next=temp.next;
                if (temp.data.compareTo(next.data)==0){
                    temp.next=next.next;
                    temp=next.next;
                }else{
                    temp=temp.next;
                }
            }
            if (temp.next.data.compareTo(temp.next.next.data)==0){
                temp.next=temp.next.next;
                tail=temp;
            }
        }
    }
    
}

/**
 *
 * @author payal
 */
public class RemoveDupCircularList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CLL cll=new CLL();
        cll.add("abc");
        cll.add("abc");
        cll.add("bc");
        cll.add("c");
        cll.add("c");
        cll.add("c");
        cll.add("cc");
        cll.add("abc");
        cll.print();
        cll.removeDuplicates();
        cll.print();
    }
    
}
