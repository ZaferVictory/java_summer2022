package Practise_03;

import java.util.Scanner;

public class Q07_StringManiplation {

    public static void main(String[] args) {
        // Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.

        Scanner scan =new Scanner(System.in);
        System.out.println("lütfen ismini ve soyisminizi giriniz :\nisim");
        String isim=scan.next();
        System.out.println("soyisim");
        String soyisim=scan.next();

        if (isim.length()>soyisim.length()){
            System.out.println("isminiz soyisminizden uzundur");
        }else if (isim.length()==soyisim.length()){
            System.out.println("isminiz soyisminizle eşit uzunlukta");
        }else System.out.println("soy isminiz uzun ");
    }
}
