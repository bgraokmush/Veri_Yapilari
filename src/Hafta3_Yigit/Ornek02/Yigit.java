package Hafta3_Yigit.Ornek02;
/**
 *
 * @author bugra
 */
public class Yigit {
    Eleman ust;
    
    public Yigit(){
        ust = null;
    }
    
    boolean bosMu(){
        return ust == null;
    }
    
    void ekle(Eleman yeni){
        yeni.ileri = ust;
        ust = yeni;
    }
    Eleman cikar(){
        Eleman e = ust;
        if(!bosMu()){
            ust = ust.ileri;
        }
        return e;
    }

}

