package Hafta12_SiralamaAlgoritmalari.Ornek01;

import java.util.Arrays;

/**
 *
 * @author bugra
 * En büyük elemanı baloncuk gibi sona getirir.
 */
public class BubbleSort {
    
    int[] bubbleSort(int arr[]){
        int n = arr.length;
        int tmp;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if(arr[j] > arr[j+1]){
                    tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                    System.out.println(Arrays.toString(arr));
                }
            }
        }
        System.out.println("\n");
        return arr;
    }
    
    public static void main(String[] args) {
        int arr[] = {5,1,4,2,8};
        BubbleSort bs = new BubbleSort();
        
        System.out.println("Normal array -> ");
        System.out.print(Arrays.toString(arr) + "\n\n");
        
        int result[] = bs.bubbleSort(arr);
        System.out.println("Sorted array -> ");
        System.out.print(Arrays.toString(result) + "\n");
    }
}
