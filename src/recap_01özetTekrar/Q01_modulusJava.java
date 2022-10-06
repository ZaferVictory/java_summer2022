package recap_01özetTekrar;

import java.util.Scanner;

public class Q01_modulusJava {
    public static void main(String[] args) {

        /*
         *  Kullanicidan alacaginiz 5 basamakli sayinin ilk 2 ve son iki basamagindaki rakamlari toplamini bulunuz
         *
         *   Ex :
         *   input  : 12345
         *   output : 12
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen 5 basamaklı bir sayı giriniz");
        int sayi=scan.nextInt();

        int birlerBasamagıilk=0;
        int rakamlarToplamı=0;
        int ilkGirilenSayi=sayi;

        int birlerBasamagıikinci=0;
        int birlerBasamagıucuncu=0;
        int birlerBasamagıdorduncu=0;
        int birlerBasamagıbesinci=0;


        birlerBasamagıilk=sayi%10;
        rakamlarToplamı+=birlerBasamagıilk;
        sayi/=10;


        birlerBasamagıikinci=sayi%10;
        rakamlarToplamı+=birlerBasamagıikinci;
        sayi/=10;


        birlerBasamagıucuncu=sayi%10;
        rakamlarToplamı+=birlerBasamagıucuncu;
        sayi/=10;


        birlerBasamagıdorduncu=sayi%10;
        rakamlarToplamı+=birlerBasamagıdorduncu;
        sayi/=10;


        birlerBasamagıbesinci=sayi%10;
        rakamlarToplamı+=birlerBasamagıbesinci;
        sayi/=10;


        System.out.println(birlerBasamagıilk+birlerBasamagıikinci+birlerBasamagıdorduncu+birlerBasamagıbesinci);

        // hocanın yaptığı çözüm aşağıda


        Scanner scan1 =new Scanner(System.in);
        System.out.print("lutfen 5 basamakli sayi giriniz :");
                int num=scan.nextInt();

        int ilkIki= num/1000;//12
        int sonIki= num%100; //100 e bolumunden kalani verir 45

        int ilkIkiTop = (ilkIki/10) + (ilkIki%10);
        System.out.println("ilkIkiTop = " + ilkIkiTop);

        int sonIkiTop = (sonIki/10) + (sonIki%10);
        System.out.println("sonIkiTop = " + sonIkiTop);
        System.out.println("sayilarin toplami :" + (ilkIkiTop+ sonIkiTop));


    }
}
