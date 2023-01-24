package Hafta8_Heap.Ornek02;
/**
 *
 * @author bugra
 * Bir dizi max heap mi?
 */
public class Ornek02 {
    
    
    public static void main(String[] args) {
        int arr[] = {90,15,10,7,12,2,7,3};
        
        if(isMaxHeap(arr, arr.length)){
            System.out.println("Evet");
        }else{
            System.out.println("Hayır");
        }
    }
    
    static boolean isMaxHeap(int arr[], int n){
        //Kök düğümden başlayıp son yaprağa kadar kontrol et
        for (int i = 0; i < (n - 2) / 2; i++) {
            //Eğer sol çocuk büyük ise false döndür
            if(arr[2 * i + 1] > arr[i]){
                return false;
            }
            //Eğer sağ çocuk büyük ise false döndür
            if(arr[2 * i + 2 ] > arr[i]){
                return false;
            }
        }
        return true;    
    }
}
