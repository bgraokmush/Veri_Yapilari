package Hafta5_Hashing.Ornek01;
/**
 *
 * @author bugra
 */
public class LineerProbing {
   
    private int currentSize, maxSize;
    private String[] keys, vals;

    //yapıcı (consturctor) metod
    public LineerProbing(int maxSize) {
        currentSize = 0;
        this.maxSize = maxSize;
        keys = new String[maxSize];
        vals = new String[maxSize];
    }
    
    //hash tablosunu temizleyen metod
    public void makeEmpty(){
        currentSize = 0;
        keys = new String[maxSize];
        vals = new String[maxSize];
    }
    
    //hash tablosunun anlık uzunluğunu verir
    public int getSize(){
        return currentSize;
    }
    
    //hash tablosu dolu mu?
    public boolean isFull(){
        return currentSize == maxSize;
    }
    
    //hast tablosu boş mu?
    public boolean isEmpty(){
        return getSize() == 0;
    }
    
    //Hash tablosunda girilen key halihazırda bulunuyor mu?
    public boolean contains(String key){
        return get(key) != null;
    }
    
    //Hash key veren metod
    private int hash(String key){
        return key.hashCode() % maxSize;
    }
    
    //key - value durumuna göre ekleme
    public void insert(String key, String val){
        int tmp = hash(key);
        int i = tmp;
        
        do{
            if(keys[i] == null){
                keys[i] = key;
                vals[i] = val;
                currentSize++;
            }
            if(keys[i].equals(key)){
                vals[i] = val;
                return;
            }
            i = (i+1) % maxSize;
        }while (i != tmp);
    }
    
    //Anahyar değerini veren metod
    public String get(String key){
        int i = hash(key);
        while(keys[i] != null){
            if(keys[i].equals(key)){
                return vals[i];
            }
            i = (i+1) % maxSize;
        }
        return null;
    }
    
    // key ve value değerlerini silen metod
    public void remove(String key){
        if(!contains(key)){
            return;
        }
        int i = hash(key);
        
        //Silinecek indisi bulma
        while(!key.equals(keys[i])){
            i = (1+i) % maxSize;
        }
        keys[i] = vals[i] = null;
        
        //tüm anahtarları tekrar hashleme
        for(i  = (i+1) % maxSize ; keys[i] != null; i = (1+i) % maxSize){
            String tmp1 = keys[i], tmp2 = vals[i];
            keys[i] = vals[i] = null;
            currentSize--;
            insert(tmp1, tmp2);
        }
        currentSize--;
    }
    
    
    //Hash tablosunu yazdırma
    public void printHastTable(){
        System.out.println("\nHash Tablosu:");
        for (int i = 0; i < maxSize; i++) {
            if(keys[i] != null){
                System.out.println(keys[i] + "-> değer: " + vals[i]);
            }
        }
    }
    
    
    
}
