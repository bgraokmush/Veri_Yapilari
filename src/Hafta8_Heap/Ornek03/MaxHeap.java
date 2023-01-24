package Hafta8_Heap.Ornek03;
/**
 *
 * @author bugra
 */
public class MaxHeap {
    private int[] Heap;
    private int size, maxSize;
    
    public MaxHeap(int maxSize){
        this.maxSize  = maxSize;
        this.size = 0;
        Heap = new int[this.maxSize];
    }
    
    //kökün sıra numarasını döndürür
    public int parent(int pos){
        return (pos-1) / 2;
    }
    
   //sol çocuğun sıra numarasını döndürür
    public int leftChild(int pos){
        return (2 * pos) + 1;
    }
    
    //sağ çocuğun sıra numarasını döndürür
    public int rightChild(int pos){
        return (2 * pos) + 2;
    }
    
    // MaxHeap ekleme işlemi
    public void insert(int element){
        if(size >= maxSize){
            return;
        }
        
        Heap[size] = element;
        int current= size;
        
        while(Heap[current] > Heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
        size++;
    }
    
    //Yer değiştirme metodu
    public void swap(int fpos, int spos){
        int tmp;
        tmp = Heap[fpos];
        Heap[fpos] = Heap[spos];
        Heap[spos] = tmp;
    }
    
    //Kök düğümü siler
    public int MaxHeap() {
    int e = Heap[0];
    Heap[0]= Heap[size--];
    maxHeapify(0);
    return e;

    }
    
    public void maxHeapify(int pos){
        if(isLeaf(pos)){
            return;
        }
        if(Heap[pos] < Heap[leftChild(pos)] ||
           Heap[pos] < Heap[rightChild(pos)]) {
            
            if(Heap[leftChild(pos)] > Heap[rightChild(pos)]) {
                swap(pos, leftChild(pos));
                maxHeapify(leftChild(pos));
            }
            else{
                swap(pos, rightChild(pos));
                maxHeapify(rightChild(pos));
            }
        }
    }
    
   //Düğümün yaprak olup olmadığını döndürür
   public boolean isLeaf(int pos){
    if(pos >= ((size -1) / 2) && pos <= (size - 1)){
       return true;
    }else{
        return false;
    }
   }
   
   //k. maksimum elemanı getiren metod
   public int kMax(int k){
       for (int i = 0; i < k; i++) {
           extractMax();
       }
       return extractMax();
   }
   
   public int extractMax(){
       int e = Heap[0];
       Heap[0] = Heap[size--];
       maxHeapify(0);
       return e;
   }
   
   //En küçük elemanı bulma
   public int findMinimumElement(){
       int minimumElement = Heap[size/2];
       
       for (int i = (size/2)+1; i < size; i++) {
           if(Heap[i] < minimumElement){
               minimumElement = Heap[i];
           }
       }
       return minimumElement;
   }
  
}
