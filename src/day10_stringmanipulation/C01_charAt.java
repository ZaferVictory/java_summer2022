package day10_stringmanipulation;

public class C01_charAt {

    public static void main(String[] args) {

        String str="java öğrenmek ne güzel";
        System.out.println(str.charAt(0));// bize ilk harfi yazdırır. J

        System.out.println(str.toUpperCase().charAt(7));// R yazdırır
        System.out.println(str.charAt(21));// L yazdırır

        //System.out.println(str.charAt(22));
        // son harfi bulmak için str ın uzunluğunun bir eksiğini indeks olarak gireriz.
       // eğerindex olarak uzunluğu veya beya bir sayıyı girerse  java exception verir

        // charAt() kullandığımızda sonuç char olacağı için artık manüpülasyon yapamayız
        //string methodlarrından kullanmammız gereken bir metod varsa
        // charAt() once kullanmalıyız


    }
}
