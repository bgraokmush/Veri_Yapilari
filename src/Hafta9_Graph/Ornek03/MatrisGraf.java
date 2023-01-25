package Hafta9_Graph.Ornek03;
/**
 *
 * @author bugra
 */
public class MatrisGraf {
    int [][] kenar;
    int N;
    public MatrisGraf(int N){
        this.N = N;
        kenar = new int[N][N];
    
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                kenar[i][j]  = 0;
            }
        }
    }
    
    public void kenarEkle(int baslangic, int bitis){
        kenar[baslangic][bitis] = 1;
    }
    
    public void kenarGoster(int [][] kenar){
        for (int i = 0; i < N; i++) {
            System.out.print(i + " >> ");
            for (int j = 0; j < N; j++) {
                if(kenar[i][j] == 1){
                    System.out.print(j + " ");
                }
            }
            System.out.println("");
        }
    }
    
    public void tersGraf(){
        int tersMatris [][] = new int[N][N];
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(kenar[i][j] == 1){
                    tersMatris[j][i] = 1;
                }
            }
        }
        kenarGoster(tersMatris);
    }
    
    public void dugumDerece(int n){
        int derece = 0;
        for (int i = 0; i < kenar.length; i++) {
            if(kenar[n][i] == 1){
                derece++;
            }
        }
        System.out.println(n + " numaralı dugumun derecesi: " + derece);
    }
}
