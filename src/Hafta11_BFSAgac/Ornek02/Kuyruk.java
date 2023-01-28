package Hafta11_BFSAgac.Ornek02;
/**
 *
 * @author bugra
 */
public class Kuyruk {
    Node root;

    public Kuyruk() {
        root = null;
    }
    
    void ekle(int eleman){
        if(root == null){
            //root boş ise ilk elemanı roota koyduk
            root = new Node(eleman);
        }else{
            //Kuyruk eklemesi yaptık
            Node tmp = root;
            while(tmp.next != null){
                tmp = tmp.next;
            }
            tmp.next = new Node(eleman);
        }
    }
    
    int cikar(){
        if(root == null){
            System.out.println("Kuyruk bos");
            return -1;
        }else{
            int eleman = root.deger;
            root = root.next;
            return eleman;
        }
    }
    
    boolean bosMu(){
        return root == null;
    }
    
    void listele(){
        Node tmp = root;
        while (tmp != null) {            
            System.out.println(tmp.deger);
            tmp = tmp.next;
        }
    }
            
    
    
}
