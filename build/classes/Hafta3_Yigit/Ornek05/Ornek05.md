Polish notasyonu Bilgisayar Bilimleri alanındaki önemli konulardan bir tanesidir.
Operatörleri, operandlardan önce veya sonra gösterme metodu olarak tanımlanabilir.
Infix, bildiğimiz klasik gösterimdir. Postfix, operatörlerin operandlardan sonra yazıldığı gösterimdir.
Postfix formda parantez kullanımına gerek yoktur. Infix formdan Postfix forma çevrilen bir ifadede
operandların bağlı olduğu operator’leri (+,-,*,/) görmek zorlaşır (3 4 5 * + ifadesinin
sonucunun 23’e, 3 4 + 5 * ifadesinin sonucunun 35’e karşılık geldiğini bulmak Infix gösterime alışık
olduğumuz için zor gibi görünür). Fakat parantez kullanmadan tek anlama gelen bir hale dönüşür.
İşlemleri, hesaplamaları yapmak kolaylaşır. Birçok derleyici 3*2+5*6 gibi bir Infix ifadenin değerini
hesaplayacağı zaman Postfix forma dönüştürdükten (belirsizliği ortadan kaldırdıktan sonra)
sonucu hesaplar : “3 2 * 5 6 * +” - Hem Infix-Postfix dönüşümünde hem de Postfix hesaplamasında
yığıt kullanılabilir. Aşağıdaki kod ile infix bir ifadenin postfix gösterimine dönüşmesini sağlamaktadır.