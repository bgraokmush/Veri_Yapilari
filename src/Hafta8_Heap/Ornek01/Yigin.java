package Hafta8_Heap.Ornek01;
/**
 *
 * @author bugra
 */
public class Yigin {
    Nokta dizi[];
    int tane;

    public Yigin(int N) {
        dizi = new Nokta[N];
        tane = 0;
    }
    
    boolean bosMu(){
        return tane == 0;
    }
    
    void asagiIn(int no){
        int altSol,altSag;
        altSol = 2 * no + 1;
        altSag = 2 * no + 2;
        
        while((altSol < tane) && (dizi[no].icerik < dizi[altSol].icerik) || 
              (altSag < tane) && (dizi[no].icerik < dizi[altSag].icerik)){
            
            if(altSag >= tane || dizi[altSol].icerik > dizi[altSag].icerik){
                yerDegis(no, altSol);
                no = altSol;
            }
            else{
                yerDegis(no, altSag);
                no = altSag;
            }
            altSol = 2 * no + 1;
            altSag = 2 * no + 2;
        }
    }
    
    Nokta azamiDondur(){
        Nokta tmp = dizi[0];
        dizi[0] = dizi[tane-1];
        asagiIn(0);
        tane--;
        return tmp;
    }
    
    void yiginEkle(Nokta yeni){
        tane++;
        dizi[tane-1] = yeni;
        yukariCik(tane - 1);
    }
    
    void yukariCik(int no){
        int ustAl = (no - 1) / 2;
        
        while(ustAl >= 0 && dizi[ustAl].icerik < dizi[no].icerik){
            yerDegis( ustAl, no);
            no = ustAl;
            ustAl = (no - 1) / 2;
        }
    }
    
    int yiginArama(int ad){
        int i;
        
        for (i = 0; i < tane; i++) {
            if(dizi[i].ad == ad){
                return i;
            }
        }
        return -1;
    }
    
    void yerDegis(int k, int yeni){
        int eski = dizi[k].icerik;
        dizi[k].icerik = yeni;
        
        if(eski > yeni){
            asagiIn(k);
        }else{
            yukariCik(k);
        }
    }
}
