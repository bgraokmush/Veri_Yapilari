package Hafta11_BFSAgac.Ornek01;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author bugra
 */
public class Graph {
    private int V; //Köşe sayısı için sayaç
    private LinkedList<Integer> adj[]; //Komşuluk Liste dizisi
    
    public Graph(int V){
        this.V = V;
        adj = new LinkedList[V];
        //Başlangıç oluşturma ve değer sıfırlama
        for (int i = 0; i < V; i++) {
            adj[i] = new  LinkedList();
        }
    }
    
    //Ayrıt eklmek için kullanılacak metod
    void addEdge(int v, int w){
        //adj dizisinin v indisindeki listeye w elemanını ekledik
        adj[v].add(w); 
    }
    
    void BFS(int s){
        boolean visited[] = new boolean[V];
        
        LinkedList<Integer> queue = new LinkedList<Integer>();
        
        visited[s] = true;
        queue.add(s);
        
        while(queue.size() != 0){
            //Komşularını listeye atıp yazdırıyoruz
            s = queue.poll();
            System.out.print(s + " ");
            
            Iterator<Integer> i = adj[s].listIterator();
            while(i.hasNext()) {
                int n = i.next();
                
                if(!visited[n]){
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }
    
    
    
}
