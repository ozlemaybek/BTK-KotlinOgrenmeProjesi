# BTK-KotlinOgrenmeProjesi

## Kotlin İle Android Mobil Uygulama Geliştirme Eğitimi Temel Seviye (BTK AKADEMİ) Notlarım

>Değişkenler bazı değerleri kaydetmek için kullandığımız yapılardır. 

>Değişkeni; var kelimesi ile oluşturuyoruz. Bu variable’dan geliyor. 

>Değişkenleri var ile oluştururken sabitleri val ile oluşturuyoruz. Sabitler bir kez tanımlandıktan sonra değeri değiştirilemiyor. Yanlışlıkla sonradan değiştirilmesini istemediğimiz şeyleri sabit olarak tanımlarız. 

>Bir var ile bir val arasında işlem yapabiliriz.

>Eğer kod içinde sonradan değiştirmediğiz bir değişken değeri varsa bu bize onu val yani sabite çevirmemiz için öneri olarak çıkar. 

>Değişken tanımlarken iki farklı yazım şekli vardır:

- 1)camelCase: değişkenin ilk harfinin küçük sonraki kelimelerinin ilk harfinin büyük yazıldığı yazım şeklidir.

- 2)snake_case: değişkenin tüm harflerinin küçük olduğu ve kelimeler arasına alt tire koyarak ayrıldığı yazım şeklidir.

>kotlinlang.org Kotlin'İn kendi web sitesidir. Kotlin ile ilgili dokümantasyonları buradan görebiliriz.

### Kotlin Data Types (Kotlin Veri Tipleri)

>Veri tipi dediğimiz şey aslında bir sınıf ve bu sınıf içerisinde veri tipinin özellikleri yazılmış.  

### Numbers (Sayılar İçin Veri Tipleri)

#### Tamsayılar İçin Veri Tipleri

- Bu veri tipleri arasındaki fark depolama kapasiteleridir. Örneğin byte; 8 bit'e kadar veri depolama yapabilir ve byte'ın aldığı en düşük değer -128 iken aldığı en yüksek değer 127'dir.

- Bizim tanımladığımız bir numara otomatik olarak integer olarak tanımlandı. Çünkü çoğu numaranın bir integer depolama kapasitesine sahip olması yeterli olacağı yeterli olduğu düşünüldüğü için default olarak integer olarak tanımlanıyor. 

![image](https://user-images.githubusercontent.com/109730490/180463264-10572c0d-ece8-47ad-908a-b8154cb38f83.png)

- Int: Tam sayı veri tipine verdiğimiz isimdir.

- Kodda daha önce kullandığımız bir var değişkenini yazdığımızda bir öneri listesi çıkar ve değişkenin hangi veri tipinde olduğunu gösterir.

![image](https://user-images.githubusercontent.com/109730490/180463848-e83a07c5-b8af-456d-a4c5-0f4f0a9fb224.png)

#### Float & Double

>Bu iki veri tipi ondalıklı sayılar için kullanılır.

![image](https://user-images.githubusercontent.com/109730490/180547249-ca807459-ce6c-4444-9f47-cf113fc1a06a.png)

- Kesirli sayılarda default olarak tanımlanan veri tipi double'dır.

- Float virgülden sonra en fazla 6-7 rakam alırken double virgülden sonra en fazla 15-16 rakam alır.

- Double ve Float arasındaki tek fark depolama alanıdır.

>Bir değişkeni tanımladıktan sonra o değişkeni bir yerde yazıp nokta koyduğumuzda o değişkenle ilgili kullanabileceğimiz özellikler görünür:

![image](https://user-images.githubusercontent.com/109730490/180565102-eb506eea-e544-40e1-ab47-4f725b16cb69.png)

>NOT: Kotlin'de bir kez veri tipini belli ettikten sonra değişkene başka türden bir değer atanamaz. Python buna izin verir.

>Boolean veri tipi; true ya da false değerlerini alır. Kontrollerde ve koşullarda kullanılır.

- (<)   küçüktür
- (>)   büyüktür
- (>=)  büyük eşittir
- (<=)  küçük eşittir
- (==)  eşittir
- (!=)  eşit değildir
- (&&)  ve
- (||)  veya

### KOLEKSİYONLAR

>Koleksiyonlar; içinde birden fazla veri ve birden fazla tipinin tutulabildiği yapılardır.  

- 1)Array (Dizi)

>arrayOf metodu: Bir şeyin dizisini oluşturur. 

>booleanArrayOf metodu: Boolean'lar dizisi oluşturur.

>Diziler index mantığı ile çalışır böylece elemanlarına ulaşabiliriz. 

>NOT: Diziyi val olarak tanımlasak bile içindeki elemanları değiştirebiliriz çünkü diziyideğil içindeki elemanları değiştiriyoruz. 

- 2)ArrayList

>Diziler ve listeler arasındaki fark; listelerin biraz daha esnek olmasından kaynaklanır. 

>Daha sonradan ekleme yapmak istediğimizde listelerle daha kolay işlem yapabiliyoruz. 

>ArrayList oluşturmak için arrayListOf metodunu kullanıyoruz. 

>ArrayList oluştururken (<>) içinde ArrayList'i hangi veri tipinde oluşturacağımızı belirtmemiz gerekir. Bu bazı durumlarda zorunludur bazı durumlarda ise gerekli değildir.

![image](https://user-images.githubusercontent.com/109730490/180600169-4d01b565-d9cf-4672-893c-02c2e824a874.png)

>ArrayList'in Array'e göre esnek olduğu nokta; yeni bir eleman eklemenin daha kolay olmasıdır. Array'de set kullanabilirken ArrayList'te add metoduda vardır.

>ArrayList'te karışık veri tipleri tutmak için "Any" kelimesini kullanırız.

>arrayListOf metodu kotline özgü bir özellik.

### Kotlin'de Metin İçerisinde Kod Ekleme
![image](https://user-images.githubusercontent.com/109730490/180601407-304f3a41-1e1b-4d00-96dd-b911a54e9039.png)

- 3)Set

>Set'te diğer koleksiyon tipleri gibi içinde birden fazla veri tipi barındırabilen bir yapı ama aynı veriden sadece bir tane koyabiliyoruz. 

>Bir Set oluşturmak için setOf metodunu kullanırız.

>Set koleksiyonunda get metodu yoktur ve indexleri kullanarakta ulaşamayız. Bu yüzden For Each döngüsünü kullanacağız:

- 4)Map

>Map bazı programlama dillerinde sözlük diye geçer.

>Map'te değer ve anahtar kelime ve değer eşleşmeleri (key - value pairing) yapıyoruz.

>Diyelimki iki tane dizimiz var ve bu iki dizi içerisinde eşlenik değerlerimiz var. Bunları birleşmiş halde HashMap'te tutabiliriz.

>HashMap'te add metodu yoktur bunun yerine put metodu vardır.  

### Kaynaklar

- [kotlinlang.org](https://kotlinlang.org/docs/basic-types.html#numbers)
- [BTK AKADEMİ](https://www.btkakademi.gov.tr/portal/course/kotlin-ile-android-mobil-uygulama-gelistirme-egitimi-temel-seviye-10274)






