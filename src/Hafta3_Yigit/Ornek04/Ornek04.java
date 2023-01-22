package Hafta3_Yigit.Ornek04;

import Hafta3_Yigit.Ornek03.Eleman;
import java.util.Arrays;
import Hafta3_Yigit.Ornek03.Yigit;

/**
 *
 * @author bugra
 */
public class Ornek04 {
    
    public static void main(String[] args) {
        Yigit y = new Yigit(100);
        String input = "ORNEKMETINYAZISI";
        char [] str = input.toCharArray();
       
        System.out.println(Arrays.toString(str));
    
        for (int i = 0; i < str.length; i++) {
            y.ekle(new Eleman(str[i]));
        }
        
        while(!y.bosMu()){
            System.out.print(y.cikar().icerik);
        }
    }
}
