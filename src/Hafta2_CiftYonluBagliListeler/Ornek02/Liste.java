package Hafta2_CiftYonluBagliListeler.Ornek02;
/**
 *
 * @author bugra
 */
public class Liste {
    Eleman bas,son;
    
    void ekle(Eleman yeni){
        Eleman tmp;
        //Liste boş veya tek eleman varsa
        if(bas == null || bas.ust < yeni.ust){
            yeni.ileri = bas;
            bas = yeni;
        }
        else{
            tmp = bas;
            while(tmp.ileri != null || tmp.ust < yeni.ust){
                tmp = tmp.ileri;
            }
            yeni.ileri = tmp.ileri;
            tmp.ileri = yeni;
        }
    }
    
    public String yazdir(){
        Eleman tmp = bas;
        String sonuc  = "";
        
        while(tmp != null){
            if(tmp.katsayi>0){
                sonuc += "+" + tmp.katsayi + "x^" + tmp.ust;
            }
            else if(tmp.katsayi<0){
                sonuc += "-" + tmp.katsayi + "x^" + tmp.ust;
            }
            
            tmp = tmp.ileri;
        }
    
      return sonuc;
    }
    
    public int hesapla(int deger){
        Eleman tmp = bas;
        int sonuc = 0;
        
        while(tmp != null){
            sonuc+= tmp.katsayi * Math.pow(deger, tmp.ust);
            tmp = tmp.ileri;
        }
        return sonuc;
    }
}
