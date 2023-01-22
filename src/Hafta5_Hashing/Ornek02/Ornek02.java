package Hafta5_Hashing.Ornek02;
/**
 *
 * @author bugra
 */
public class Ornek02 {
    
    //Diziyi yazdıran metod (Bunun yerine Arrays.toString(arr) kullanılabilir)
    static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
    static void hashing(int table[], int tSize, int arr[], int N){
        
            //Diziyi dolaşma
            for (int i = 0; i < N; i++) {
                int hv = arr[i] % tSize;
                
                if(table[hv] == -1){
                    table[hv] = arr[i];
                }
                else{
                    for (int j = 0; j < tSize; j++) {
                        int t = (hv+j*j) % tSize;
                        if(table[t] == -1){
                            table[t] = arr[i];
                            break;
                        }
                    }
                }
            }
        printArray(table);
    }
    
    public static void main(String[] args) {
        int arr[] = {50,700,76,85,92,73,101};
        int N = 7;
        
        int L = 7;
        int hash_table[] = new int[L];
        
        for (int i = 0; i < L; i++) {
            hash_table[i] = -1;
        }
        
        hashing(hash_table, L, arr, N);
    }
}
