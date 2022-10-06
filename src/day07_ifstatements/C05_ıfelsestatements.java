package day07_ifstatements;

import java.util.Scanner;

public class C05_ıfelsestatements {

    public static void main(String[] args) {
       // Kullanicidan bir karakter girmesini isteyin ve girilen
        // karakterin harf olup olmadigini yazdirin


        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen bir karakter giriniz");
        char harf=scan.next().charAt(0);

        if ((harf>='a'&& harf<='z' || harf>='A'&& harf<='Z' ) ){
            System.out.println("girdiğiniz sayi harftir");
        }else {
            System.out.println("harf değil karakter girdin");
        }


    }
}
