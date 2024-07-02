/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package transposegraph;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author payal
 */
public class TransposeGraph {

    private static int vertices = 5;
    
    private static List<Integer>[] adj=new ArrayList[vertices];
    
    private static List<Integer>[] tr=new ArrayList[vertices];
    
    private static void addEdge(int u, int v, boolean choice){
        if (choice){
            adj[u].add(v);
        }else{
            tr[u].add(v);
        }
    }
    
    private static void printGraph(boolean choice){
        for(int i=0;i<vertices;i++){
            List<Integer> edgeList=adj[i];
            List<Integer> trEdgeList=tr[i];
            System.out.print(i+" ---> ");
            int size=choice?edgeList.size():trEdgeList.size();
            for(int j=0;j<size;j++){
                int vertex=choice?edgeList.get(j):trEdgeList.get(j);
                System.out.print(vertex+" ");
            }
            System.out.println();
        }
    }
    private static void createTranspose(){
        for(int i=0;i<vertices;i++){
            List<Integer> edgeList=adj[i];
            for(int j=0;j<edgeList.size();j++){
                addEdge(edgeList.get(j), i, false);
            }
        }
    }
    private static void createGraph(){
        for(int i=0;i<vertices;i++){
            adj[i]=new ArrayList<>();
            tr[i]=new ArrayList<>();
        }
        addEdge(0, 1, true);
        addEdge(0, 4, true);
        addEdge(0, 3, true);
        addEdge(2, 0, true);
        addEdge(3, 2, true);
        addEdge(4, 1, true);
        addEdge(4, 3, true);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        createGraph();
        createTranspose();
        System.out.println("Adjacency matrix");
        printGraph(true);
        System.out.println("Transpose matrix");
        printGraph(false);
    }
    
}
