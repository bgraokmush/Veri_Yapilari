package Hafta11_BFSAgac.Ornek01;
/**
 *
 * @author bugra
 */
public class Ornek01 {
    public static void main(String[] args) {
        Graph g = new Graph(4);
        
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        
        
        System.out.println("2 den baslayarak BFS gezinme yapiliyor ...");
        g.BFS(2);
        System.out.println("");
              
        
    }
}
