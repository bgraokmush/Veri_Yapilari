package Hafta9_Graph.Ornek01;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author bugra
 */
public class Graph<T> {
    private Map<T, List<T>> map = new HashMap<>();
    
    //Kenar Ekleme
    public void addVertex(T s){
        map.put(s, new LinkedList<T>());
    }
    
    //Kenar ekleme
    public void addEdge(T source, T destination, boolean bidirectional){
        if(!map.containsKey(source)){
            addVertex(source);
        }
        if(!map.containsKey(destination)){
            addVertex(destination);
        }
        map.get(source).add(destination);
        if(bidirectional == true){
            map.get(destination).add(source);
        }
    }
    
    //Düğüm Sayısını yazdıran metod
     public void getVertexCount()
    {
        System.out.println("Bu graftaki dugum sayisi: " + map.keySet().size());
    }
     
    //Kenar Sayısını yazdıran metod
    public void getEdgesCount(boolean bidirection){
        int count = 0;
        for (T v : map.keySet()) {
            count += map.get(v).size();
        }
        if(bidirection == true){
            count /=2;
        }
        System.out.println("Grafin kenar sayisi: " + count);   
    }
    
    //Düğüm var mı?
    public void hasVertex(T s){
        if(map.containsKey(s)){
            System.out.println("Graf " + s + " düğümünü içerir");
        }else{
            System.out.println("Dugum grafta bulunmuyor.");
        }
    }
    
    //Kenar var mı?
    public void hasEdge(T s, T d){
        if(map.get(s).contains(d)){
            System.out.println("Bu iki dugum arasında kenar var: \n\t" + s +  "-->" + d);
        }else{
            System.out.println("Kenar Yok");
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        
        for (T v : map.keySet()) {
            builder.append(v.toString() + ": ");
            for (T w : map.get(v)) {
                builder.append(w.toString() + " ");
            }
            builder.append("\n");
        }
        
        return (builder.toString());
    }
    
    
}
