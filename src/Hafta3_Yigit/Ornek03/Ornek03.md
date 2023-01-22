
Yığıt ile bir metin içerindeki parantezlerin kontrolü yapılabilir.
İç içe parantezler içeren bir ifadede parantezlerin geçerli olması için açılan ve kapanan toplam parantez sayısı eşit olmalıdır.
Aç “(“ ve kapa “)” parantezlerin eşitliğine bakılır. Kapanan her parantezden önce bir parantez açılmış olmalıdır. Her “)” için bir “(“ olup olmadığına bakılır. 
Karşılaşılan parantezleri tutmak üzere yığıt kullanılabilir. Bir parantezle karşılaşıldığında yığıta eklenir. İlgili parantezlerin karşılığı ile
karşılaşıldığında ise yığıta bakılır. Yığıt boş değilse yığıttan bir eleman çıkarılarak doğru karşılık olup olmadığı kontrol edilir. Doğruysa işlem sürdürülür.
Değilse ifade geçersizdir. Yığıt sonuna ulaşıldığında yığıt boş olmalıdır. Aksi halde açılmış ama kapanmamış parantez olabilir. Parantezleri geçerli bir ifadede
şu şartlar olmalıdır. İfadenin sonunda parantez sayısı 0 olmalıdır. İfadede ya hiç parantez yoktur veya açılan parantezlerin sayısı ile kapanan parantezlerin
sayısı eşittir. İfadenin hiçbir noktasında parantez sayısı negatif olmamalıdır. Bu, parantez açılmadan bir parantezin kapanmadığını gösterir.