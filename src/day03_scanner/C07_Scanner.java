package day03_scanner;

import java.util.Scanner;

public class C07_Scanner {

    public static void main(String[] args) {

        //bir önceki soruyu tek seferde kullanıcıdan tüm bilgileri alarak yapınız

        Scanner scan=new Scanner(System.in);

        System.out.println("lütfen isminizi soyisminizi ve yaşınızı giriniz \naralarda enter tuşuna basın");

         String İsim= scan.nextLine();
         String soyisim=scan.nextLine();
         int yas=scan.nextInt();

        //zafer köşktepe  36 şeklinde yazdırın

        System.out.println("girilen bilgiler="+İsim+" "+soyisim+" "+yas);
    }
}
