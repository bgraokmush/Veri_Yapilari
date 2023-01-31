package Hafta12_SiralamaAlgoritmalari.Ornek01;

import java.util.Arrays;

/**
 *
 * @author bugra
 * 
 * Listenin en küçük elemanını en başa getirir.
 * En baştaki hariç en küçük elemanı alır ve kendi başına getirir.
 * Böylelikle dizinin yarısı sıralı olur.
 */
public class SelectionSort {
    
    public int[] selectionSort(int arr[])
    {
        int n = arr.length;
 
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
 
            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
            System.out.println(Arrays.toString(arr));
        }
        System.out.println("\n");
        return arr;
    }
    
    public static void main(String[] args) {
        SelectionSort ss = new SelectionSort();
        int arr[] = {46,25,12,22,11};
        
        System.out.println("Normal Array -> ");
        System.out.print(Arrays.toString(arr) + "\n\n");
        
        int result[] = ss.selectionSort(arr);
        System.out.println("Sorted Array -> ");
        System.out.print(Arrays.toString(result));
    }
}
