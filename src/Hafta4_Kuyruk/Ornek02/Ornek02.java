package Hafta4_Kuyruk.Ornek02;
import java.util.Comparator;
import java.util.PriorityQueue;
/**
 *
 * @author bugra
 */
public class Ornek02 {
    public static void main(String[] args) {
        PriorityQueue<String> pqueue1 = new PriorityQueue<String>();
        PriorityQueue<String> pqueue2 = new PriorityQueue<String>(
                10, 
                new Comparator<String>(){
                    public int compare(String a, String b){
                    return b.compareTo(a);
                }
        });
        
        String[] eleman = {"A","G","B","L","C","Z","K","J","E","D"};
        
        for(String e: eleman){
            pqueue1.add(e);
            pqueue2.add(e);
        }
        
        System.out.println("Artan oncelikli Kuyruk: ");
        while(pqueue1.size() != 0){
            System.out.print(pqueue1.poll() + " ");
        }
        System.out.println("\nAzalan Oncelikli Kuyruk: ");
        
        while(pqueue2.size() != 0){
            System.out.print(pqueue2.poll() + " ");
        }
    }
}
