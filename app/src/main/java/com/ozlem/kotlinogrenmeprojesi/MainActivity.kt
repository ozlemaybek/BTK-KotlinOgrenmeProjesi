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



    }

}