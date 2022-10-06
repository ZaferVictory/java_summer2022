package day09_Ternary;

import java.util.Scanner;

public class C03_ternary {

    public static void main(String[] args) {

        // kullanıcıdan bir sayı isteyin sayı pozitifse
        // sayıyı yazdırın
        // sayı sıfır veya negatifse bir sayı daha isteyin ve ikinin çarpımını yazdırın

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        double sayi= scan.nextDouble();

        if (sayi>0){
            System.out.println("girilen sayı :"+sayi);
        }else{
            System.out.println("Lütfen bir sayı giriniz");
            double sayi1 = scan.nextDouble();
            System.out.println(sayi*sayi1);
        }
        /*
        eger if else içerisinde yeni kodlar varsa ternary ile yapmamız
        mümkün olmaz
         */
    }
}
