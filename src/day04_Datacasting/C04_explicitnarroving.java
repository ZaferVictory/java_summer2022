package day04_Datacasting;

public class C04_explicitnarroving {

    public static void main(String[] args) {

        int sayi1=50;
        byte sayi2= (byte) sayi1;

        System.out.println(sayi2);// 50 değerini görürüm çünkü 50 değeri byte sığar.
                                   //çünkü byte 128' kadar gider'

        /* geniş data türünde ki değeri, dar data türündeki değere atamak isterseniz
        java sizin geniş data türündeki degerin , dar data türünün sinirlarına uyup uymayacağını
        çalıştırana kadar bilemez ama java risk almaz

       bu durumda riski sıfıra indirmek için burada bir sorun olursa sorumluluğu kabul
       etmenizi bekler bunun içinde değerin önüne parantez içinde istediğimix data türünü yazmamız yeterlidir.

      <-128____________0______________127_> = 127 ve üstü yazdın mı -128 e döner

      diyelim ki 130 yazdın byte ın karşısına karşısında -128 den geriye 3 sayarsın ve karşısına -126 yazar.
      peki -132 yazsak ne olur. bu defa da tersi olur eksi 128 e kadar bitirince artıya döner ve 124 çıkar

       Bu riski ustlendigimizde, 3 durum olusabilir
         1- bizim degerimiz, dar kalip degerlerine uygun olursa hic bir kayip olmadan cast olur
         2- double bir sayiyi int'a cast etmek gibi durumlarda data kaybi yasayabilirsiniz
         3- genis kaliptan degeri dar kaliba koydugunuzda, sinirlari asan durumlarda
            veri baskalasabilir

         */

     double myDouble=9.78;
     int myİnt=(int) myDouble; // bana bunu integer olarak ver dediğim için kusuratı attı sadece 9 kaldı
        System.out.println(myİnt);
    }
}
