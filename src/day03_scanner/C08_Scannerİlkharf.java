package day03_scanner;

import java.util.Scanner;

public class C08_Scannerİlkharf {

    public static void main(String[] args) {
        // kullanıcıdan ismini alip, ilk harfini büyük olarak yazıdırın

         Scanner scan= new Scanner(System.in);

        System.out.println("lütfen isminizi giriniz");
        /*
        java scanner klasında next char() metodu yoktur
        bunun yerıne strıng olarak ilk kelimeyi alıp onunda ilk harfini alabiliriz
         */

        char ilkHarf=scan.next().toUpperCase().charAt(0);
        System.out.println("ismin ilk harfi:"+ ilkHarf);
    }
}
