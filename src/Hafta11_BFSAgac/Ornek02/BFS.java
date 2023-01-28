package Hafta11_BFSAgac.Ornek02;
/**
 *
 * @author bugra
 */
public class BFS {
    int [][] komsuluk = new int[6][6];
    int [] ziyaret = new int[6];
    Kuyruk k = new Kuyruk();

    public BFS() {
        komsuluk[0][1] = 1; // A->B
        komsuluk[0][2] = 1; // A->C
        komsuluk[0][3] = 1; // A->D
        komsuluk[2][4] = 1; // C->E
        komsuluk[3][5] = 1; // D->F
        komsuluk[2][5] = 1; // C->F
    }

    
    void BFSGez(int dugum){
        int v = dugum;
        System.out.println(v);
        ziyaret[v] = 1;
        k.ekle(v);
        
        while (!k.bosMu()) {            
            //Komşu bul
            for (int i = 0; i < ziyaret.length; i++) {
                if(komsuluk[v][i] == 1 && ziyaret[i] == 0){
                    k.ekle(i);
                    ziyaret[i] = 1;
                    System.out.print(i +" ");
                }
            }
            v = k.cikar();
        }
    }
    
    
}
