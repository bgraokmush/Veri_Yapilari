package Hafta12_SiralamaAlgoritmalari.Ornek01;

import java.util.Arrays;

/**
 *
 * @author bugra
 */
public class QuickSort {
   static void swap(int[] arr, int i, int j){
       int tmp = arr[i];
       arr[i] = arr[j];
       arr[j] = tmp;
       System.out.println(Arrays.toString(arr));
   }
   
      static int partition(int[] arr, int low, int high)
    {
 
        // pivot
        int pivot = arr[high];
 
        // Index of smaller element and
        // indicates the right position
        // of pivot found so far
        int i = (low - 1);
 
        for (int j = low; j <= high - 1; j++) {
 
            // If current element is smaller
            // than the pivot
            if (arr[j] < pivot) {
 
                // Increment index of
                // smaller element
                i++;
                swap(arr, i, j);
            }
            
        }
        swap(arr, i + 1, high);
        
        return (i + 1);
    }
   
   static void quickSort(int[] arr, int low, int high)
    {
        if (low < high) {
 
            // pi is partitioning index, arr[p]
            // is now at right place
            int pi = partition(arr, low, high);
 
            // Separately sort elements before
            // partition and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
 
   
   
    public static void main(String[] args) {
        int[] arr = {10,7,8,9,1,5};
        int n = arr.length;
        
        System.out.println("Normal Array->");
        System.out.println(Arrays.toString(arr) + "\n");
        quickSort(arr, 0, n-1);
        
        System.out.println("\nSorted Array ->");
        System.out.println(Arrays.toString(arr));
        
        
    }
}
