package day06_concatenation;

import java.util.Scanner;

public class C01_wrapperClasses {

    public static void main(String[] args) {
        /* wrapper clas javanın hazır metodları kullanabilmemiz için premetive data türlerinin
        her bir için açtığı class lardır

        int>> wrapper class' ı Integer'dır
        char>> wrapper class'ı Charecter'dir
        diğerleri primetive ile aynı sadece baş harfi büyük
         */

        String str = " Java ile hayat ne güzel";
        System.out.println(str.toUpperCase());// JAVA İLE HAYAT NE GÜZEL- String non-primetive data türü olduğundan
        // str. dan sonra hazır metod olan toUpperCase() kullanabildik

        boolean guzelMi = true;
        // güzel mi boolean primetive olduğundan hazır metodu bulunmuyor

        Boolean buGüzelMi = true;// non-primetive data türü olduğundan  bir alt
        // bir alt satırda hazır metodlar geldi.
        buGüzelMi.toString();

        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);


        String ogrenciNo = "123456";
        // kullanıcıdan bir şifre isteyin
        // eğer şifre sadece rakamlardan oluşuyorsa kabul etmeyelim
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen 5 basamaklı bir şifre giriniz");

        String sifre = scan.nextLine();

        Integer sifreSayi = Integer.parseInt(sifre);

        System.out.println("girilen şifre:" + sifre);
        System.out.println("Integer sifre:" + sifreSayi);

        System.out.println("girilen şifre:" + (sifre + 3));
        System.out.println("Integer sifre:" + (sifreSayi + 3));

        /* wrapper classlar ileride kullanabileceğimiz pekçok hazır metod içerir

         */

    }
}
