package day05_matematikselislemler;

import java.util.Scanner;

public class C03_RAKAMLARTOPLAMI {
    public static void main(String[] args) {

        // Kullanicidan 4 basamakli bir sayi alin ve rakamlar toplamini bulup yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen 4 basamakli pozitif bir tamsayi giriniz");
        int sayi= scan.nextInt();  // 5267

        int birlerBasamagi=0;
        int rakamlarToplami=0;
        int ilkGirilenSayi=sayi;

        // suanda sayi 5267 bb=0 rt=0

        birlerBasamagi=sayi % 10; // 7
        rakamlarToplami += birlerBasamagi;
        sayi /= 10;

        // suanda sayi 526 bb 7 rt 7

        birlerBasamagi = sayi % 10; // 6
        rakamlarToplami += birlerBasamagi; // 7+6=13
        sayi /=10;

        // suanda sayi 52 bb 6 rt 13

        birlerBasamagi = sayi % 10; // 2
        rakamlarToplami += birlerBasamagi; // 13+2=15
        sayi /=10; // 5

        // suanda sayi 5 bb 2 rt 15
        birlerBasamagi = sayi % 10 ; // 5
        rakamlarToplami += birlerBasamagi; // 15+5 =20
        sayi /= 10 ; // 0

        // suanda sayi 0 bb 5 rt 20

        System.out.println(ilkGirilenSayi + " sayisinin rakamlar toplami : " + rakamlarToplami);




        System.out.println("Lutfen 3 basamakli pozitif bir tamsayi giriniz");
        int sayi1= scan.nextInt();// 125

        int birlerBasamagı1=0;
        int rakamlarToplamı1=0;
        int ilkGirilenSyi1=sayi1;

        birlerBasamagı1=sayi1%10;//5
        rakamlarToplamı1+=birlerBasamagı1;
        sayi1/=10;


        //şu anda sayı 12 bb 5 rt 0


        birlerBasamagı1=sayi1%10;//2
        rakamlarToplamı1+=birlerBasamagı1;//5+2=7
        sayi1/=10;

        // şu anda sayi 12 bb 2 rt 7

        birlerBasamagı1=sayi1%10;//2
        rakamlarToplamı1+=birlerBasamagı1;//5+2+1=8
        sayi/=10;

        // şu anda saı 2 bb1 rt 8

        System.out.println(ilkGirilenSyi1+" sayisinin rakamlar toplami"+rakamlarToplamı1);

    }
}
