package day04_Datacasting;

public class c01_datacasting {

    public static void main(String[] args) {
        char harf = 'a';
        //char yeniHarf=harf+1; // kod bu durumda önce sağdaki işlemi yapar
        // char  yeniHarf=97+1--->98
        // char bir variable 98 olamayacağı için java hata verir.

        //peki ben yukarıdaki örneği topla ama bana char yap desem kabul eder mi deneyelim

        char yeniHarf =(char) (harf + 1);// yani burada 98 char olarak düşün dedim.
        System.out.println(yeniHarf);
           /*
           bazen bir variable'a oluşturulduğu data türü dışında değer atanabilir
           bunlardan bazısını  java ototmatik olarak kabul eder

          java eger bu deger atamasında sorun oluşacağını görürse( data kayıplarının olabileceği veya
          datanın baskalasabilecegini)
          görürse bu durumda otomatik olarak bu atamayı kabul etmez.
          sizden eğer bu atamayı istiyorsanız sorumluluğu almanızı ister
            */

        // int sayi1=7.3 bakın bunu kabul etmez etmir bazen böyle oluyor. ancak aşağıdaki gibi yazdığımda kabul eder

        int sayi1 = (int) 7.3; //bakın bunu kabul etti yukarıdaki uzun açıklamanın örneği, ancak yazdırdığı zaman aşağıda ki gibi yazdırır.

        System.out.println("sayi1:" + sayi1);//  7  olarak yazdırır. bu şekilde yazdırıdığı zamanda , den sonrasını kusuratı direk atar


        double sayi2 = 10;
        System.out.println("sayi2:" + sayi2); // 10.0 olarak yazdırır çünkü sayıyı double olarak algıladı o yüzden 10.0 yazdırdı

        int sayi3 = 'c';
        System.out.println("sayi3:" + sayi3); // 99 yazdırır. çünlkü bize c nin ascii tablosundaki değerini getirir.

        char harf2 = 98;
        System.out.println("harf2:" + harf2);// b olarak yazdırır. bize 98 in asci tablosunda ki değerini getirir o da b dir.



        /*
        a=erol
b=2
c=5
d=yeni

output=erol25yeni

         */

        String a="erol";
        int b=5;
        int c=5;
        String d="yeni";

        System.out.println(a+b*c+d);




    }
}
