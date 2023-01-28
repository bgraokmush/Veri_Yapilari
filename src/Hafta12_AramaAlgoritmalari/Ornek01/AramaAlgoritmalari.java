package Hafta12_AramaAlgoritmalari.Ornek01;

import Hafta1_BagliListeler.Ornek01.Eleman;

/**
 *
 * @author bugra
 */
public class AramaAlgoritmalari {
    
    
    //Diziler için Lineer - Ardışıl Arama
    public int lineerr(int[] array, int target){
        for (int i = 0; i < array.length; i++) {
            if(array[i] == target){
                return i;  //bulunan elemanın indis değeri
            }
        }
        // dizi indisleri içinde -1 vermek, dizide istenilen sonuç olmadığı anlamına gelir
        return -1; 
    }
    
   //Bağlı listeler için Lineer - Ardışıl Arama
    public Eleman arama(Eleman root, int target){
        //Listede dolaşmak için geçici eleman (node)
        Eleman tmp = root; 
        
        while(tmp != null){
            if(tmp.icerik == target){
                return tmp;
            }
        }
        /*Eğer tüm liste elemanları gezilir
        ve sonuç bulunamazsa null gönderir */
        return null;
    } 
    
    //Sıralı listeler için İkili Arama
    public int binarySearch(int array[], int target){
        int
        bottom = 0,
        top = array.length-1,
        mid;
        while(bottom <= top){
            mid = (bottom + top) /2;
            
            if(array[mid] == target){
                return mid; //aranan değerin indisi
            }else if(array[mid]<target){
                bottom = mid + 1;
            }else{
                top = mid-1;
            }
        }
        return -1;
    }
    
}
