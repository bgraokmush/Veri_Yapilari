package Hafta9_Graph.Ornek02;
/**
 *
 * @author bugra
 */
class Eleman{
    Eleman ileri;
    int icerik;

    public Eleman(int icerik) {
        this.icerik = icerik;
        ileri= null;
    }
}

class Liste{
    Eleman bas,son;

    public Liste() {
        bas = null;
        son = null;
    }
    
    public void listeEkle(int eleman){
        Eleman e = new Eleman(eleman);
        if(bas == null){
            bas = e;
            son = e;
        }else{
            son.ileri = e;
            son = e;
        }
    }
    
    public void listeGoster(){
        Eleman e = bas;
        while(e != null){
            System.out.print(e.icerik + " ");   
            e = e.ileri;
        }
    }
    
    public int elemanSayisi(){
        Eleman e = bas;
        int sayac = 0;
        
        while(e !=null){
            e = e.ileri;
            sayac++;
        }
        return sayac;
    }
}

public class ListeGraf {
    Liste [] kenar;
    int N;

    public ListeGraf(int N) {
        this.N = N;
        kenar = new Liste[N];

        for (int i = 0; i < N; i++) {
            kenar[i] = new Liste();
        }
    }
    
    public void kenarEkle(int baslangic, int bitis){
        kenar[baslangic].listeEkle(bitis);
    }
    
    public void kenarGoster(){
        for (int i = 0; i < N; i++) {
            System.out.print(i + " >> ");
            kenar[i].listeGoster();
            System.out.println("");
        }
    }
    
    public void maxDerece(){
        int maxDerece = 0, maxDugum = 0;
        
        for (int i = 0; i < N; i++) {
            if(kenar[i].elemanSayisi() > maxDerece){
                maxDerece = kenar[i].elemanSayisi();
                maxDugum = i;
            }
        }
        System.out.println("Max dereceli dugum: " + maxDugum + " >> " + maxDerece);
    }
    
    public boolean grafTamMi(){
        for (int i = 0; i < N; i++) {
            if(kenar[i].elemanSayisi() != (N-1)){
                return false;
            }
        }
        return true;
    }
   
    
    
    
}
