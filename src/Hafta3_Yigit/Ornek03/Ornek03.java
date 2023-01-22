

package Hafta3_Yigit.Ornek03;

import java.util.Scanner;


/**
 *
 * @author bugra
 */
public class Ornek03 {
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("İşleminizi Girin: ");
        String input = scanner.next();
        
        if(parantezKontrol(input)){
            System.out.println("Parantez doğru-> \n \t" + input);
        }else{
            System.out.println("Eksik parantez var");
        }
    }
    
    
    public static boolean parantezKontrol(String expr){
        char [] chrExpr = expr.toCharArray();
        char chRead,chPopped;
        boolean isValid = true;
        Yigit ats = new Yigit(chrExpr.length);
        
        for (int i = 0; i < chrExpr.length; i++) {
            chRead  = chrExpr[i];
            
            //Sadece açılış parantezlerini ekliyoruz
            if(chRead == '[' || chRead == '(' || chRead=='{'){
                ats.ekle(new Eleman(chRead));
            }
            //KapanışParantezleri
            if(chRead == ']' || chRead == ')' || chRead=='}'){
             //Kapanış parantezi olduğu halde,
             //Yığıtta açılış parantezi kalmadıysa
                if(ats.bosMu() == true){
                    return false;
                }
                else{
                    /*Yığıttan aldığım açılış parantzi ile
                    okuduğum kapanış parantezi tutarlı mı?*/
                    chPopped = (char) ats.cikar().icerik;
                    //Yığıttan aldığım açılış
                    if(chPopped == '[' && chRead == ']'){
                        isValid = true;
                    }
                    else if(chPopped == '{' && chRead == '}'){
                        isValid = true;
                    }
                    else if(chPopped == '(' && chRead == ')'){
                        isValid = true;
                    }
                    else{
                        return false;
                    }
                }
            }
        }
        return isValid;
    }
}
