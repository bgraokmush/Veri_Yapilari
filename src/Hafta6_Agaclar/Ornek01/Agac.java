package Hafta6_Agaclar.Ornek01;
/**
 *
 * @author bugra
 */
public class Agac {
    Dugum kok;
    public Agac(){
        kok = null;
    }
    
    //Ağaçta arama yapma
    Dugum ara(int eleman){
        Dugum d = kok;
        while(d != null){
            if(d.icerik == eleman){
                return d;
            }
            if(d.icerik > eleman){
                d = d.sol;
            }else{
                d = d.sag;
            }
        }
    //Eğer aranan bulunmuyorsa null dönderir
    return null;
    }
    
    //En küçük değeri getirme
    Dugum enKucuk(Dugum kok){
        while(kok.sol != null){
            kok = kok.sol;
        }
        return kok;
    }
    
    //En büyük değeri getirme
    Dugum enBuyuk(Dugum kok){
        while(kok.sag != null){
            kok = kok.sag;
        }
        return kok;
    }
    
    //İkili ağaca değer eklenmesi
    void ekle(Dugum yeni){
        Dugum once = null;
        Dugum tmp = kok;
        
        while(tmp != null){
            once = tmp;
            if(yeni.icerik < tmp.icerik){
                tmp  = tmp.sol;
            }
            else{
                tmp = tmp.sag;
            }
        }
        if(once == null){
            kok = yeni;
        }else if(yeni.icerik < once.icerik){
            once.sol = yeni;
        }else{
            once.sag = yeni;
        }
    }
    
    void silme(int eleman){
        kok = sil(kok, eleman);
    }
    Dugum sil(Dugum kok, int eleman){
        if(kok == null){
            return null;
        }
        if(eleman<kok.icerik){
            kok.sol = sil(kok.sol,eleman);
        }
        else if(eleman>kok.icerik){
            kok.sag = sil(kok.sag,eleman);
        }else{
            if(kok.sol != null && kok.sag != null){
                Dugum maxSol = enBuyuk(kok.sol);
                kok.icerik = maxSol.icerik;
                kok.sol = sil(kok.sol, maxSol.icerik);
            }
            else if(kok.sol !=null){
                kok = kok.sol;
            }
            else if(kok.sag !=null){
                kok = kok.sag;
            }
            else{
                kok = null;
            }
        }
        return kok;
    }
    
    void guncelleme(int eskiDeger, int yeniDeger){
        silme(eskiDeger);
        ekle(new Dugum(yeniDeger));
    }
    
    //preOrder gezinti kok - sol - sag
    void preOrder(Dugum kok){
        System.out.print(kok.icerik + " ");
        if(kok.sol != null){
            preOrder(kok.sol);
        }
        if(kok.sag != null){
            preOrder(kok.sag);
        }
    }
    
    //Inorder gezinti sol - kok - sag
    void inOrder(Dugum kok){
        if(kok.sol != null){
            inOrder(kok.sol);
        }
        System.out.print(kok.icerik + " ");
        if(kok.sag != null){
            inOrder(kok.sag);
        }
    }
    
    //postOrder gezinti sol - sag - kok
    void postOrder(Dugum kok){
        if(kok.sol != null){
            postOrder(kok.sol);
        }
        if(kok.sag != null){
            postOrder(kok.sag);
        }
        System.out.print(kok.icerik + " ");
    }
}
