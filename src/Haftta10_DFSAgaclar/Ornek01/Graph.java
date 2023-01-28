package Haftta10_DFSAgaclar.Ornek01;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author bugra
 */
public class Graph {
    private int V; //Köşe sayısı
    
    //Liste dizisi
    private LinkedList<Integer> adj[];
    
    //Constructor
   @SuppressWarnings("unchecked") Graph(int V){
       this.V = V;
       adj = new LinkedList[V];
       //Başlangıç için değerleri sıfır tutuyoruz
       for (int i = 0; i < V; i++) {
           adj[i] = new LinkedList();
       }
   }
   
   //Ayrıtları ekleyen metod
   void addEdge(int v, int w){
       // w sayısını adj dizisinin v. elemanının listesine ekledik
       adj[v].add(w); 
   }
   
   //DFS'nin kullanacağı metod
   void DFSUtil(int v, boolean visited[]){
       visited[v] = true;
       System.out.print(v + " ");
       
       Iterator<Integer> i = adj[v].listIterator();
       while(i.hasNext()){
           int n = i.next();
           
           if(!visited[n]){
               DFSUtil(n, visited);
           }
       }
   }
   
   void DFS(int v){
       boolean visited[] = new boolean[this.V];
       DFSUtil(v, visited);
   }
}
