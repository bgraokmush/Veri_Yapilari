package Hafta3_Yigit.Ornek01;
/**
 *
 * @author bugra
 */
public class Yigit {
    Eleman dizi [];
    int ust;
    int N;
    
    public Yigit(int N){
        dizi = new Eleman[N];
        this.N = N;
        ust =-1;
    }
    
    public Eleman ust(){
        return dizi[ust];
    }
    
    public boolean doluMu(){
        return ust==N-1;
    }
    public boolean bosMu(){
        return ust==-1;
    }
    
    public void ekle(Eleman yeni){
        if(!doluMu()){
            ust++;
            dizi[ust] = yeni;
        }
    }
    
    public Eleman cikar(){
        if(!bosMu()){
            ust--;
            return dizi[++ust];
        }
        
        return null;
    }
    
}
