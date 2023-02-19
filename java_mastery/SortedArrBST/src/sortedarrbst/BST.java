/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sortedarrbst;

class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}

/**
 *
 * @author payal
 */
public class BST {
    
    void print(Node node){
        if (node==null){
            return;
        }
        print(node.left);
        System.out.print(node.data+" ");
        print(node.right);
        
    }
    
    Node sortedToBST(int[] arr, int low,int high){
        if (arr.length==0){
            return null;
        }
        if (low>high){
            return null;
        }
        int mid=low+(high-low)/2;
        
        Node node=new Node(arr[mid]);
        
        node.left=sortedToBST(arr,low,mid-1);
        
        node.right=sortedToBST(arr,mid+1,high);
        
        return node;
    }
}
