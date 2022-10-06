package day08_ıfstatements;

import java.util.Scanner;

public class C02_ıfElseIfStatements {

    // Soru 7) Kullanicidan 100 uzerinden notunu isteyin.
// Not'u harf sistemine cevirip yazdirin.
// 50’den kucukse "D",
// 50'ye eşitveya büyük -60 dan küçükse "C",
// 60' a eşit veya büyük -80'den küçük ise "B",
// 80’e eşit veya üzerinde ise "A"
 // geçersiz not girildiğinde uyarı verelim

    public static void main(String[] args) {


        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen 0'dan-100'e kadar bir not yazınız");
        double note=scan.nextDouble();

        if (note<0 || note>100){
            System.out.println("lütfen geçerli bir not giriniz");
        } else if (note<50) { // bu satıra geldiysek notumuz 0 ile 100 arasındadır.
            System.out.println("Notunuz:D");
        } else if (note<60) { //  bu satıra geldiysek notumuz 50 ile 100 arasındadır.
            System.out.println("Notunuz C");
        } else if (note<80) { //  bu satıra geldiysek notumuz 60 ile 100 arasındadır.
            System.out.println("notunuz B");
        } else {
            System.out.println("Notunuz:A");
        }


        Scanner scan1= new Scanner(System.in);
        System.out.println("lütfen geçerli bir not giriniz");
        double note1=scan.nextDouble();

        if (note1<0 || note1>100){
            System.out.println("lütfen geçerli bir not giriniz");
        } else if (note1<50) {
            System.out.println("Notunuz:D");
        } else if (note1<60) {
            System.out.println("Notunuz:C");
        } else if (note1<80) {
            System.out.println("Notunuz:B");
        } else {
            System.out.println("Notunuz:A");
        }


    }
}
