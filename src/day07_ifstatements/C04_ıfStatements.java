package day07_ifstatements;

import java.util.Scanner;

public class C04_ıfStatements {

    public static void main(String[] args) {
    /*
        Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        Ornek:  gun=Pazar output = “Hafta sonu”
        gun=Sali output = “Hafta ici”
 *** String icin equals method’unu kullanin

     */
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir gün ismi giriniz");
        String gun=scan.nextLine();

        switch (gun){
            case "pazartesi":
                System.out.println("hafta ici");
                break;
            case "sali":
                System.out.println("hafta ici");
                break;
            case "carsamba":
                System.out.println("hafta ici");
                break;
            case "persembe":
                System.out.println("hafta ici");
                break;
            case "cuma":
                System.out.println("hafta ici");
                break;
            case "cumartesi":
                System.out.println("hafta sonu");
                break;
            case "pazar":
                System.out.println("hafta sonu");
                break;

        }



    }
}
