package Hafta5_Hashing.Ornek01;

import java.util.Scanner;

/**
 *
 * @author bugra
 */
public class Ornek01 {
    public static void main(String[] args) {
        //Klavye nesnesini oluşturuyoruz
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Hash tablo test\n\n");
        System.out.println("Uzunluğu girin...");
        
        //Maxsize parametresini klavyeden alıp nesnemizi oluşturuyoruz
        LineerProbing lp = new LineerProbing(scanner.nextInt());
        
        char ch;
        
        while (true) {            
            System.out.println(
                      "\nHash tablosu operasyonları: \n"
                    + "\t1. Ekle\n"
                    + "\t2. Cikar\n"
                    + "\t3. Getir\n"
                    + "\t4. Temizle\n"
                    + "\t5. Boyutu Ogren \n");
            //Seçimi alıp değerlendiriyoruz
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("Anahtar ve değer girin");
                    lp.insert(scanner.next(), scanner.next());
                    break;
                case 2:
                    System.out.println("Silinecek anahtarı girin: ");
                    lp.remove(scanner.next());
                    break;
                case 3:
                    System.out.println("Getirilecek değerin anahtarını girin: ");
                    lp.get(scanner.next());
                    break;
                case 4:
                    lp.makeEmpty();
                    System.out.println("Hash tablosu temizlendi...");
                    break;
                case 5:
                    System.out.println("Hash tablosunun uzunluğu" + lp.getSize());
                    break;
                default:
                    System.out.println("Yanlis tuslama yaptiniz...");
                    break;
            }
            
            //Her işlemden sonra tabloyu yazdırıyoruz
            lp.printHastTable();
            
            System.out.println("\n Devam etmek istiyor musun? (E veya H)");
           
            ch = scanner.next().charAt(0);
            
            if(ch == 'H' || ch =='h'){
                break; //Cikis yapmak için
            }
        }
    }
}
