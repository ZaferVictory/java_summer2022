package day03_scanner;

public class C01_asciitable {

    public static void main(String[] args) {
        // bir tamsayı bir de char değişken oluşturun ve bunların toplamını yazdırın

        int sayi=10;
        char harf='a';
        String str="banana";

        System.out.println(sayi+harf);// beklediğimiz şey şu 10a ancak 107 oldu
        System.out.println(sayi*harf);
        System.out.println(str+harf);// banana
        System.out.println(harf+2); //
        System.out.println(str+sayi+harf);

        //char yeniHarf= harf+2;

        /*
        1-char data türü işleme girdiği değişkenin türüne göre farklı davranabilir
          eğer matematiksel bir işleme girdiği variable sayısal bir değerse
          sayı gibi davranır
          sayi+harf  sayi variables'i int olduğundan harf variables'i ascii
          tablosundan 97 değerini kullanır

          char yeniHarf= harf+2;  java önce sağdaki işlemi yapar, sağda int+char görünce
          asci değerini alır ve sonucu 99 bulur sonra atama işlemi yapmaya çalışır.
          o zaman durum şöyle olur
          char yeniHarf=99
          bu atama java açısından kabul edilebilir değildir.
        2- (str+harf);// banana  string variable çok güçlüdür.hangi data türü ile işleme girerse diğer data
                      türünü kendine benzetir

         */

            // peki... konsolda variables leri kullanarak 10a görmek istersek nasıl yazdırmalıyız
        System.out.println(""+sayi+harf);

        // tabi ki şu şekid de yazdırabiliriz
        System.out.println("10a");


        char deger='1';
        System.out.println(deger+harf);// '1' + 'a'  >> 49+97  =146 ascii de ki degerleri aldı



    }
}
