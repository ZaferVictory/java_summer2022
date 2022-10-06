package day07_ifstatements;

import java.util.Scanner;

public class C06_ıfElsestatements {
    public static void main(String[] args) {
      /*
        Kullaniciya yasini sorun, eger yas 65’den kucuk ise
    “emekli olamazsin, calismalisin”, 65’e esit veya buyukse “Emekli olabilirsin” yazdirin

       */

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen yaşınızı giriniz");
        int yas=scan.nextInt();

        if (yas<65){
            System.out.println("emekli olamazsın, çalışmalısın");
        } else if (yas>=65) {
            System.out.println("emekli olabilirsin");

        }

    }
}
