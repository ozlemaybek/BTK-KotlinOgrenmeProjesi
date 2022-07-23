package com.ozlem.kotlinogrenmeprojesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("Hello Kotlin!!!")

        // DEĞİŞKENLER & SABİTLER

            // Integer:

            var a = 5
            var b = 10

            println(a*b)

            var yas = 50
            println(yas/5*8)
            yas = 60

            val x = 10
            // x=5 dersem hata verir çünkü sabitlerin değerini değiştiremeyiz.

            // Bir var ile bir val arasında işlem yapabiliriz:
            println(yas*x)

            // camelCase kullanımı:
            val yasSonucu = yas * x
            println(yasSonucu)

            // Define (Tanımlamak):
            // benimIntegerim diye bir değişken tanımlıyorum ve bunun veri tipi integer olacak demek:
            val benimIntegerim : Int

            // Initialize (Başlatmak):
            benimIntegerim = 5

            var yeniInteger : Int = 20
            var d = 20

            // int/int=int olur.
            println(5/2) //sonuç: 2

            // Long:

            var benimLong : Long = 100
            benimLong = 3000000000
            println(benimLong)

            // Double & Float

            // Double:
            val pi = 3.14

            // Bir şeyi Float olarak tanımlamak istiyorsak sonuna f koymalıyız:
            val piFloat : Float = 3.14f

            // String:

            val benimString : String = "Benim yeni metnim"
            println(benimString.length) //stringin uzunluğunu verir

            val isim = "Özlem"
            val soyisim = "Aybek"
            val tamisim = isim + " " + soyisim
            println(tamisim) // output: Özlem Aybek

            val yeniBirString : String
            yeniBirString = "10"
            val baskaBirString : String
            baskaBirString = "20"
            println(yeniBirString+baskaBirString) // output: 1020

            // Boolean:

            var benimBoolean : Boolean
            benimBoolean = true
            benimBoolean = false

            println(3<5) // output: true

        //Veri Tipi Dönüştürme

            val benimInt = 10
            val benimLongaCevrilenInt = benimInt.toLong()
            println(benimLongaCevrilenInt) // Long'a çevrildi

        // KOLEKSİYONLAR:

            // Array (Dizi):

            // Bir dizi oluşturdum ve dizinin içerisinde 5 tane eleman var:
            val benimDizim = arrayOf("Ayşe" , "Kerem" , "Sıla" , "Osman" , "Zeynep")

            // Bu şekilde de kullanabiliriz:
            val stringOrnegi = "Atıl"
            val yeniDizi = arrayOf(stringOrnegi , "Kerem" , "Sıla" , "Osman" , "Zeynep")

            // index:
            // Aşağıdaki iki satır aynı anlama geliyor:
            println(benimDizim[0]) // output : Ayşe
            println(benimDizim.get(0)) // output : Ayşe

            // Dizi elemanlarının değerini değiştirebiliriz:
            benimDizim[1] = "Mahmut"
            println(benimDizim[1]) // output : Mahmut

            // set metodu:
            // dizi elemanlarının değerlerini değiştirmek için kullanılır
            // Bu metod ilk parametre olarak indexi ikinci parametre olarak ise yeni değeri alır:
            benimDizim.set(3,"Mehmet")
            println(benimDizim[3]) // output : Mehmet

            val numaraDizisi = doubleArrayOf(1.0 , 2.0 , 3.5)
            println(numaraDizisi.get(2)) // output : 3.5

            // Kotlin'de karışık diziler oluşturabiliriz:
            val karisikDizi = arrayOf("Atıl" , 24 , 16.5 , true , false)
            println(karisikDizi.get(3)) // output : true


            // ArrayList:

            // Bu şekilde tanımlamasını yapıp bırakabiliriz:
            val isimListesi = arrayListOf<String>()

            // Ama bu şekilde bırakırsak hata alırız:
            // val isimListesi2 = arrayListOf()
            // Yani ya içerisine veri girmeliyiz ya da hangi veri tipinin girileceğini belirtmeliyiz.

            val nameList = arrayListOf("Atıl" , "Zeynep" , "Osman")
            println(nameList[0]) // output : Atıl
            println(nameList.get(0)) // output : Atıl

            // ArrayList'in Array'e göre esnek olduğu nokta:
            nameList.add("Atlas")
            println(nameList.get(3)) // output : Atlas

            // Karışık ArrayList:
            // "Any" herhangi bir sınıftan veri tipini ArrayList'te tutmak için kullanılır:
            val karisikArrayList = arrayListOf<Any>()
            karisikArrayList.add("Atıl")
            karisikArrayList.add(4)
            karisikArrayList.add(true)

            //Java'daki alışkanlıklarla ArrayList tanımlamak:
            val intArrayList = ArrayList<Int>()
            intArrayList.add(5)
            intArrayList.add(20)
            println(intArrayList.get(1)) // output : 20


            //Metin içerisinde kod ekleme:
            val ornekDizi = arrayOf(7 , 8 , 9 , 9 , 9 , 8 , 10)
            println("index 2 : ${ornekDizi[2]}")

            // Set:

            val benimSet = setOf<Int>(7 , 8 , 9 , 9 , 9 , 8 , 10)
            println(benimSet.size) // output : 4

            //Set koleksiyonunda get metodu yoktur ve indexleri kullanarakta ulaşamayız.
            //Bu yüzden For Each döngüsü kullanacağız.

            //For Each Döngüsü
            benimSet.forEach{
                //it : iterator (yineleyici)
                //iterator benimSet içindeki her bir elemana tek tek sırayla eşitlenir bu sayede tüm elemanları bastırabiliriz.
                println(it) // output : 7 8 9 10
            }

            // HashSet:
            val digerSet = HashSet<String>()
            digerSet.add("Özlem")
            digerSet.add("Özlem")
            digerSet.add("Aybek")

            digerSet.forEach{
                println(it) // output : Özlem Aybek
            }

            // Map:
            // Map bazı programlama dillerinde sözlük diye geçer.
            // Map'te değer ve anahtar kelime ve değer eşleşmeleri (key - value pairing)yapıyoruz.

            val yemekDizisi = arrayOf("elma" , "et" , "tavuk")
            val kaloriDizisi = arrayOf(100 , 300 , 200)
            println("${yemekDizisi[0]}'nın kalorisi : ${kaloriDizisi[0]}") // output : elma'nın kalorisi : 100

            /*Bu şekilde yaparken çok fazla veri olduğunda veri eşleşmelerinde bir hata olabilir.
            * Bu yüzden böyle durumalarda HashMap kullanıyoruz: */

            val yemekKaloriMap = hashMapOf<String,Int>()
            // HashMap'te add metodu yoktur bunun yerine put metodu var.
            // Bu metod bir key bir value parametresi alır:
            yemekKaloriMap.put("Elma" , 100)
            yemekKaloriMap.put("Et" , 300)
            yemekKaloriMap.put("Tavuk" , 200)
            // get metodu bu kez key paramatresi isteyecek:
            println(yemekKaloriMap.get("Elma")) // output : 100

            // Farklı veri türleri ile yapabiliriz:
            val benimMapim = hashMapOf<String,String>()
            //HashMap'te add metodu yoktur bunun yerine put metodu var.
            //Bu metod bir key bir value parametresi alır:
            benimMapim.put("Örnek" , "Değer")

            // Başka bir tanımlama şekli:
            val yeniMap = hashMapOf<String,Int>("Atıl" to 40 , "Örnek" to 50)

        // MATEMATİKSEL İŞLEMLER:

            var sayi = 8
            println(sayi) // output : 8
            sayi = sayi + 1
            println(sayi) // output : 9
            sayi++
            println(sayi) // output : 10
            sayi--
            println(sayi) // output : 9

            var digerSayi = 10

            println(digerSayi > sayi) // output : true

            // && -> VE
            // || -> VEYA

            println(digerSayi > sayi && 2 > 3) // output : false
            println(digerSayi > sayi || 2 > 3) // output : true

            println(8+7)
            println(10-4)
            println(20*5)
            println(10/2)

            // Remainder - Kalanı Bulmak
            println(11%3) // output : 2

            // If Kontrolleri
            println("----------If Statements (Eğer Kontrolleri)---------")

            val skor = 80

            if (skor < 10) {
                println("Oyunu kaybettin!")
            } else if (skor >= 10 && skor < 20) {
                println("Skorun 10 ve 20 arasında, çok iyi skor aldın")
            } else if (skor >= 20 && skor < 30) {
                println("Skorun 20 ve 30 arasında, rekorlar kırıyorsun")
            } else {
                println("Skorun 30'un üstünde, efsane oynadın")
            }

            // When - Switch:
            // When bazı programlama dillerinde switch olarak geçiyor.
            // if-else'lerin sayısı arttığında when kullanmak bizim için daha faydalı olabilir.
            println("----------When---------")

            var notRakami = 2
            var notStringi = ""

            // when parantezi içine hangi değeri kontrol edeceğimizi yazıyoruz:
            // 5 yerine else'de yazabiliriz:
            when(notRakami) {
                0 -> notStringi = "Geçersiz Not"
                1 -> notStringi = "Zayıf"
                2 -> notStringi = "Kötü"
                3 -> notStringi = "Orta"
                4 -> notStringi = "İyi"
                else -> notStringi = "Pek İyi"
            }

            println(notStringi)

            /*
            if (notRakami == 0) {
                notStringi = "Geçersiz Not"
            } else if (notRakami == 1) {
                notStringi = "Zayıf"
            } else if (notRakami == 2) {
                notStringi = "Kötü"
            } else if (notRakami == 3) {
                notStringi = "Orta"
            } else if (notRakami == 4) {
                notStringi = "İyi"
            } else {
                notStringi = "Pek İyi"
            }
    */

        // Döngüler
            println("----------For Döngüsü---------")

            val baskaBirDizi = arrayOf(5,10,15,20,25,30)
            val q = baskaBirDizi[0] / 5 + 3
            println(q)


            println("döngü başladı")
            // num değişkeni direkt for döngüsü içinde tanımlandı:
            for (num in baskaBirDizi) {
                //num değişkeni baskaBirDizi dizisinin içindeki elemanlara tek tek eşitlenecek.
                //Tüm elemanlar dolaşıldığında for döngüsü bitecek ve döngüden çıkılacak
                println(num / 5 + 3)
            }
            println("döngü bitti")

            //indices index'in çoğuludur ve bana indexleri ver anlamına gelir:
            for (indeks in baskaBirDizi.indices ) {
                println(baskaBirDizi[indeks] / 5 + 3) // output : 0 1 2 3 4 5
            }

            //Range: 0'dan 9'a kadar:
            for (b in 0..9) {
                //0'dan 9'a kadar tüm rakamlar basılacak:
                println(b)
            }

            val benimDigerStringDizim = ArrayList<String>()
            benimDigerStringDizim.add("Atıl")
            benimDigerStringDizim.add("Samancıoğlu")

            for (str in benimDigerStringDizim) {
                println(str)
            }

            benimDigerStringDizim.forEach {
                println(it)
            }

            //While
            println("----------While Döngüsü---------")

            var j = 0

            while (j <= 10) {
                println(j)
                j = j + 1
            }

    }

}