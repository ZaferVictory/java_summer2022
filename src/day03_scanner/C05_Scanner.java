package day03_scanner;

import java.util.Scanner;

public class C05_Scanner {

    public static void main(String[] args) {

        /*
        kullanıcıdan iki sayı alıp
        bu sayıların çarpımını yazdırın
         */

        Scanner scan = new Scanner(System.in);

        // 2.adım bilgi istemek
        System.out.println("lütfen ilk sayiyi girin");

        //3.adım bilgi vermek
        double sayi1= scan.nextDouble();

        // 2. sayi için 2. ve 3. adımları tekrarlarız

        System.out.println("lütfen 2.sayıyı giriniz");

        double sayi2= scan.nextDouble();

        System.out.println("girilen sayıların çarpımı:"+sayi1*sayi2);

    }
}
