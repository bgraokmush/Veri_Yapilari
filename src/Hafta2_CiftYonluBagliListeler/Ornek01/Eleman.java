package Hafta2_CiftYonluBagliListeler.Ornek01;
/**
 *
 * @author bugra
 */
public class Eleman {
    int icerik;
    Eleman ileri,geri;
    
    public Eleman(int icerik){
        this.icerik = icerik;
        ileri = null;
        geri = null;
    }
}
