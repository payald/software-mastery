/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sortedlinkedlist;

class Node{
    String data;
    Node next;
    Node(String data){
        this.data=data;
        next=null;
    }
}
/**
 *
 * @author payal
 */
public class SortedLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Create two linked lists
        Node head1=new Node("a");
        head1.next=new Node("v");
        head1.next.next=new Node("x");
        head1.next.next.next=new Node("z");
        
        
        Node head2=new Node("b");
        head2.next=new Node("c");
        head2.next.next=new Node("t");
        head2.next.next.next=new Node("y");
        
        SortedLinkedList list = new SortedLinkedList();
        list.print(head1);
        list.print(head2);
        Node sortedList=list.getSortedList(head1, head2);
        list.print(sortedList);
    }
    
    void print(Node node){
        Node temp=node;
        System.out.println();
        while(temp!=null){
            System.out.print(temp.data+ " ");
            temp=temp.next;
        }
    }
    
    Node getSortedList(Node head1,Node head2){
        if (head1==null){
            return head2;
        }
        if (head2==null){
            return head1;
        }
        
        if (head1.data.compareTo(head2.data)<0){
            
            head1.next=getSortedList(head1.next, head2);
            return head1;
        }else{
            
            head2.next=getSortedList(head1, head2.next);
            return head2;
        }
        
    }
    
}
