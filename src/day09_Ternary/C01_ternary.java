package day09_Ternary;

import java.util.Scanner;

public class C01_ternary {
    public static void main(String[] args) {
        // kullanıcıdan bir sayı alın ve sayının mutlak değerini yazdırın.


        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");
        double sayi=scan.nextDouble();
        System.out.println(sayi>=0?sayi:sayi*-1);



        }
    }
