package Hafta2_CiftYonluBagliListeler.Ornek02;
/**
 *
 * @author bugra
 */
public class Eleman {
    int katsayi,ust;
    Eleman ileri;
    
    public Eleman(int katsayi, int ust){
        this.ust = ust;
        this.katsayi  = katsayi;
        ileri = null;
    }
}
