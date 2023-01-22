package Hafta1_BagliListeler.Ornek03;
/**
 *
 * @author bugra
 */
public class DaireselListe {
    Dugum son;
    
    public DaireselListe(){
        son = null;
    }
    
    public void ekle(int eleman){
        Dugum tmp = new Dugum(eleman);
        if(son == null){
            tmp.next = tmp;
            son = tmp;
        }else{
            tmp.next = son.next;
            son.next = tmp;
            son = tmp;
        }
    }
    
    void listele(){
        Dugum tmp = son.next.next;
        System.out.println(son.next.deger);
        
        while(tmp != son.next){
            System.out.print(tmp.deger + "->");
            tmp = tmp.next;
        }
    }
    
    Dugum ara(int eleman){
        Dugum tmp = son.next.next;
        
        if(son.next.deger == eleman){
            if(tmp.deger == eleman){
                return tmp;
            }
        }
        return null;
    }
    
    void sil(int eleman){
        Dugum tmp = son.next.next;
        Dugum birOnceki = son.next;
        
        if(son.next.deger == eleman){
            son.next = son.next.next;
        }else{
            while(tmp != son.next){
                if(tmp.deger == eleman){
                    birOnceki.next = tmp.next;
                    if(tmp == son){
                        son = birOnceki;
                    }
                }
                birOnceki = tmp;
                tmp = tmp.next;
            }
        }
    }
}
