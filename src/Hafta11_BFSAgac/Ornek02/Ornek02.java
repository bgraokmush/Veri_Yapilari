package Hafta11_BFSAgac.Ornek02;
/**
 *
 * @author bugra
 */
public class Ornek02 {
    public static void main(String[] args) {
        Kuyruk k = new Kuyruk();
        
        k.cikar();
        
        k.ekle(5);
        k.ekle(10);
        k.listele();
        System.out.println("---------" + k.cikar());
        k.listele();
        
        
        BFS bfs = new BFS();
        bfs.BFSGez(0);
    }
}
