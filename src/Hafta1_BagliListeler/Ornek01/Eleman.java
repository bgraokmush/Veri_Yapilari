package Hafta1_BagliListeler.Ornek01;
/**
 *
 * @author bugra
 */
public class Eleman {
    int icerik;
    Eleman ileri;
    
    public Eleman(int icerik){
        this.icerik = icerik;
        ileri = null;
    }
}
