package Hafta7_SplayAgaclari.Ornek01;
/**
 *
 * @author bugra
 */
public class Node {
    int key;
    Node left,right;
    
    Node rightRotate(Node x){
        Node y = x.left;
        x.left = y.right;
        y.right = x;
        
        return y;
    }
    
    Node leftRotate(Node x){
        Node y = x.right;
        x.right = y.left;
        return y;
    }
    
    Node splay(Node root, int key){
        /*
            root boş ise veya
            root'un anahatarı parametre gelen abahtara eşit ise
            root return edilir
        */
        if(root == null || root.key == key){
            return root;
        }
        //Anahtar sol alt ağaçtadır
       if(root.key > key){
           
           //Anahtar ağaçta yoksa geri dön
           if(root.left == null){
               return root;
           }
           // sol - sol 
           if(root.left.key > key){
               root.left.left = splay(root.left.left, key);
               root = rightRotate(root);
           }
           //sol - sag
           else if(root.left.key < key){
               root.left.right = splay(root.left.right, key);
               
               if(root.left.right != null){
                   root.left = leftRotate(root.left);
               }
           }
           // root için ikinci dönüşü yap
           return (root.left == null) ? root : rightRotate(root);
        }
       //Anahtar sağ alt ağaçtadır
       else{
           //Anahtar ağaçta yoksa geri dön
           if(root.right == null){
               return null;
           }
           // sag - sol
           if(root.right.key > key){
               root.right.left = splay(root.right.left, key);
               
               if(root.right.left != null){
                   root.right =rightRotate(root.right);
               }
           }
           // sag - sag
           else if(root.right.key < key){
               root.right.right = splay(root.right.right, key);
               root = leftRotate(root);
           }
           return (root.right == null) ? root : leftRotate(root);
       }
    }
}
