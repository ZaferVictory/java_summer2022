package recap_01özetTekrar;

import java.util.Scanner;

public class Q3_IfStatement01 {

    public static void main(String[] args) {

        /*
         * KullanicidanY/N ikilisinden birisini girdiginde girdigi degeri
         * ekrana yazdiran java kodunu yaziniz.
         * INPUT : Y ,  N
         * OUTPUT : YES ; NO
         */


        Scanner scan=new Scanner(System.in);
        System.out.print("lütfen Y/N ikilisinden birisini gir:");
        char karakter=scan.next().charAt(0);

        if (karakter=='Y'|| karakter=='y'){
            System.out.println("YES");
        } else if (karakter=='N'|| karakter=='n') {
            System.out.println("NO");
        }else System.out.println("SENİN VAR YA ADAM AKILLI HARF GİR LAN");


    }
}
