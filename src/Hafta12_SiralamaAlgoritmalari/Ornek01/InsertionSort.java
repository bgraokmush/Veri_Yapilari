
package Hafta12_SiralamaAlgoritmalari.Ornek01;

import java.util.Arrays;

/**
 *
 * @author bugra
 * Dizi sıralı ve sırasız olarak ikiye ayrılır ve ilk baş
 * eleman sıralı dizinin ilk elemanı kabul edilir
 * sıralı dizi gerekli şekilde manipüle edilir
 */
public class InsertionSort {
    
   public int[] insertionSort(int arr[]){
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            
            }
            
            arr[j + 1] = key;
            System.out.println(Arrays.toString(arr));
            
        }
        System.out.println("\n");
        return arr;
   }
   
   
    public static void main(String[] args) {
        int arr[] = {12,11,13,5,6};
        InsertionSort is = new InsertionSort();
        
        System.out.println("Normal Array ->");
        System.out.println(Arrays.toString(arr)+ "\n\n");
        
        int result[] = is.insertionSort(arr);
        System.out.println("Sorted Array ->");
        System.out.println(Arrays.toString(arr));
    }
    
}
