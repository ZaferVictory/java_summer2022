package day03_scanner;

import java.util.Scanner;

public class C06_Scanner {

    public static void main(String[] args) {

        /*
        kullanıcıdan ismini soyismini ve yaşını alıp girilen bilgiler
        =zafer köşktepe  36 şeklinde yazdırın
         */

        Scanner scan= new Scanner(System.in);

        System.out.println("lütfen isminizi giriniz");

        String isim= scan.next();// eğer nextline( ) seçersek iki ismi varsa kullanıcının ikisini yazar örnek ahmet selim
                          // next()- bir kelime alır.
                          // nextline = satırın sonuna kadar ne yazarsak alır.
                           //not: eğer artarda birden fazla deger alacaksak nextline kullanmalıyız

        System.out.println("lütfen soyisminiz giriniz");

        String soyisim= scan.next();

        System.out.println("lütfen soyisminiz giriniz");

        int yas=scan.nextInt();

        //zafer köşktepe  36 şeklinde yazdırın

        System.out.println("girilen bilgiler="+isim+""+soyisim+""+yas);

    }
}
