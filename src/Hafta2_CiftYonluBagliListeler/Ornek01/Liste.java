package Hafta2_CiftYonluBagliListeler.Ornek01;
/**
 *
 * @author bugra
 */
public class Liste {
    Eleman bas,son;
    
    public Liste(){
        bas = null;
        son = null;
    }
    
    public void basaEkle(Eleman yeni){
        if(son == null){
            son = yeni;
        }
        else{
            bas.geri = yeni;
            yeni.geri = bas;
            bas = yeni;
        }
    }
    
    public void sonaEkle(Eleman yeni){
        if(bas == null){
            bas = yeni;
        }else{
            son.ileri = yeni;
            yeni.geri = son;
            son = yeni;
        }
    }
    public void elemanEkle(Eleman yeni, Eleman once){
        yeni.ileri = once.ileri;
        yeni.geri = once;
        once.ileri.geri = yeni;
        once.ileri = yeni;
    }
    
    public void bastanSil(){
        bas = bas.ileri;
        if(bas == null){
            son = null;
        }else{
            bas.geri = null;
        }
    }
    public void sondanSil(){
        son = son.geri;
        if(son == null){
            bas =null;
        }else{
            son.ileri = null;
        }
    }
    
    public void elemanSil(Eleman silinecek){
        silinecek.ileri.geri = silinecek.geri;
        silinecek.geri.ileri = silinecek.ileri;
    }
}
