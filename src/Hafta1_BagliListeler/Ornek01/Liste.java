package Hafta1_BagliListeler.Ornek01;
/**
 *
 * @author bugra
 */
public class Liste {
    Eleman bas;
    Eleman son;
    
    public Liste(){
        bas = null;
        son = null;
    }
    
    public void basaEkle(Eleman yeni){
        if(son == null){
            son = yeni;
            bas = yeni;
        }
        else{
            yeni.ileri = bas;
            bas = yeni;
        }
    }
    
    public void sonaEkle(Eleman yeni){
        if(bas == null){
            bas = yeni;
            son = yeni;
        }
        else{
        son.ileri = yeni;
        son = yeni;
        }
    }
    
    public void ortayaEkle(Eleman yeni, Eleman once){
        yeni.ileri = once.ileri;
        once.ileri  = yeni;
    }
    
    public void bastanSil(){
       if(bas==null){
           son = null;
       }
       bas = bas.ileri;
    }
    
    public void sondanSil(){
        Eleman tmp = bas,once = null;
        
        while(tmp.ileri != null){
            once = tmp;
            tmp = tmp.ileri;
        }
        
        //Liste boştur
        if(once == null){
            bas = null;
        }
        else{
            once.ileri = null;
            son = once;
        }
    }
    
    public void elemanSil(Eleman silinecek){
        Eleman tmp=bas,once=null;
        while(tmp.icerik != silinecek.icerik){
            once = tmp;
            tmp = tmp.ileri;
        }
        once.ileri = tmp.ileri;
    }
    
    int elemanSayisi(){
        int counter = 0;
        Eleman tmp;
        tmp = bas;
        
        while(tmp != null){
            tmp = tmp.ileri;
            counter++;
        }
        
        return counter;
    }
    
    public Liste birlestir(Liste l1, Liste l2){
        Liste tmp;
        
        if(l1.bas == null){
            return l2;
        }
        if(l2.bas == null){
            return l1;
        }
        tmp = new Liste();
        tmp.bas = l1.bas;
        tmp.son = l2.son;
        
        l1.son.ileri = l2.bas;
        
        return tmp;
    }
    
    public void basaTasi(){
        //Eğer liste boş ise veya tek eleman var ise
        if(bas == null || bas.ileri == null){
            return;
        }
        Eleman once = null, tmp = bas;
        
        while(tmp != null){
            once = tmp;
            tmp = tmp.ileri;
        }
        once.ileri = null;
        
        tmp.ileri = bas;
        bas = tmp;
    }
    
    //Küçükten büyüğe sıralama
    public void siraliEkleme(Eleman yeni){
        Eleman tmp;
        //Liste boş veya tek eleman varsa
        if(bas == null || bas.icerik >= yeni.icerik){
            yeni.ileri = bas;
            bas = yeni;
        }
        else{
            tmp = bas;
            while(tmp.ileri != null && tmp.ileri.icerik < yeni.icerik){
                tmp = tmp.ileri;
            }
            yeni.ileri = tmp.ileri;
            tmp.ileri=yeni;
        }
    }
    
    public String yazdir(){
        Eleman tmp = bas;
        String sonuc = "";
        while(tmp != null){
            sonuc += tmp.icerik + "->";
            tmp = tmp.ileri;
        }
        
        
        return sonuc;
    }
}
