package Hafta4_Kuyruk.Ornek01;
/**
 *
 * @author bugra
 */
public class Kuyruk {
    Eleman bas,son;

    public Kuyruk() {
        bas = null;
        son = null;
    }
    
    boolean bosMu(){
        return bas == null;
    }
    
    //bağlı listenin sonuna ekliyoruz
    void ekle(Eleman yeni){
        if(!bosMu()){
            son.ileri = yeni;
            son = yeni;
        }else{
            bas = yeni;
            son = yeni;
        }
    }
    
    //bağlı listenin başından çıkarıyoruz
    Eleman kuyrukSil(){
        Eleman sonuc = bas;
        
        if(!bosMu()){
            bas = bas.ileri;
            if(bas == null){
                son = null;
            }
        }
        return sonuc;
    }
    
}
