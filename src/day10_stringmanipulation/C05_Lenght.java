package day10_stringmanipulation;

public class C05_Lenght {

    public static void main(String[] args) {

        String str= "java ogren, isi kap";
        System.out.println(str.length());// str' ın karakter sayısını döndürür

        System.out.println(str.charAt(str.length()-1));// son karakteri yazdıralım

        System.out.println(str.charAt(str.length()-3));// sondan 3.karakteri yazdıralım

        /*

        java da null pointer ( isaretleyici) bir deger degıl,
        karsısına yazıldıgı varıables ın hıc bir deger almadıgıının isaretcısıdır.


         */



        String str2= ""; //  str ye bir değer atanmış mıdır.
                        // peki bu değer nedir: hiçlik


        System.out.println(str.length());//0




        String str3= null;// str 3 e bir değer atanmış mıdır. HAYIR.
        // null bu deger atamamamyı isaret etmektedir.

       System.out.println(str3.length());// bir değer atanmamış ki nasıl uzunluğu olsun
                                          // nullpointer exception  olarak hata verir.
        // bu null değer atama yapılamadığının işaretdir

        String str6="allah yardım etsin";
        System.out.println(str6.charAt(str6.length()-3));

    }
}
