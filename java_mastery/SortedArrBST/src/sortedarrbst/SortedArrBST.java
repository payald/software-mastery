/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sortedarrbst;

/**
 *
 * @author payal
 */
public class SortedArrBST {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr=new int[]{1,2,3,4,5,6,7,8,9};
        BST bst=new BST();
        Node root=bst.sortedToBST(arr, 0,arr.length-1);
        bst.print(root);
    }
    
}
