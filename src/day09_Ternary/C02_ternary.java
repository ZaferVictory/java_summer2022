package day09_Ternary;

import java.util.Scanner;

public class C02_ternary {
    public static void main(String[] args) {
       /*
        kullanıcıdan bir sayı alın. sayi pozitifse " sayı pozitif" yazdırın,
        negatifse sayının karesini yazdırın
        */

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen bir sayı gir");
        int sayi=scan.nextInt();

        System.out.println(sayi>0?"sayi pozitif" : sayi*sayi);

    }

}
