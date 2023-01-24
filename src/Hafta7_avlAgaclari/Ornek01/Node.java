package Hafta7_avlAgaclari.Ornek01;
/**
 *
 * @author bugra
 */
public class Node {
    int deger, yukseklik;
    Node sol,sag;

    public Node(int deger) {
        this.deger = deger;
    }
    
    Node ekle(Node tmp, Node yeni){
        if(tmp == null){
            return yeni;
        }else{
            if(tmp.deger>yeni.deger){
                tmp.sol = ekle(tmp.sol, yeni);
            }else{
                tmp.sag = ekle(tmp.sag, yeni);
            }
        }
        
        tmp.yukseklik = Math.max(yukseklik(tmp.sol), yukseklik(tmp.sag)) + 1;
    
        int fark = yukseklik(tmp.sol) - yukseklik(tmp.sag);
        
        if(fark > 1 && yeni.deger < tmp.sol.deger){
            return sagaKir(tmp);
        }
        if(fark > 1 && yeni.deger > tmp.sol.deger){
            tmp.sol = solaKir(tmp.sol);
            return sagaKir(tmp);
        }
        if(fark < -1 && yeni.deger > tmp.sag.deger){
            return solaKir(tmp);
        }
        if(fark < -1 && yeni.deger < tmp.sol.deger){
            tmp.sol = sagaKir(tmp.sag);
            return solaKir(tmp);
        }
        return tmp;
    }
    
    Node sagaKir(Node A){
        Node B = A.sol;
        Node T3 = B.sag;
        
        A.sol = T3;
        B.sag = A;
        
        A.yukseklik = Math.max(yukseklik(A.sol), yukseklik(A.sag)) + 1;
        B.yukseklik = Math.max(yukseklik(B.sol), yukseklik(B.sag)) + 1;
        
        return B;
    }
    
    Node solaKir(Node A){
        Node B = A.sag;
        Node T2 = B.sol;
        
        B.sol = A;
        A.sag = T2;
        
        A.yukseklik = Math.max(yukseklik(A.sol), yukseklik(A.sag)) + 1;
        B.yukseklik = Math.max(yukseklik(B.sol), yukseklik(B.sag)) + 1;
        
        return B;
    }
    
    int yukseklik(Node node){
        if(node == null){
            return 0;
        }else{
            int solDerinlik = yukseklik(node.sol);
            int sagDeringlik = yukseklik(node.sag);
        
            return solDerinlik > sagDeringlik ? solDerinlik+1 : sagDeringlik+1;
        }
    }
    
}
