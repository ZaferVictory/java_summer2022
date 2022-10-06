package day09_Ternary;

import java.util.Scanner;

public class C06_SwichCase {

    public static void main(String[] args) {
        // hafta içi bir gün yazdığında"hafta içi" diye mesaj verecek
        //hafta sonu bir gün yazdığında"hafta sonu" diye mesaj verecek

        Scanner scan=new Scanner(System.in);
        System.out.println("gun ismı yaz");
        String gun=scan.next().toLowerCase();

        switch (gun){
            case "pazartesi":

            case"sali":

            case"carsamba":

            case"persembe":

            case"cuma":
                System.out.println("hafta içi");
                break;
            case"cumartesi":

            case"pazar":
                System.out.println("hafta sonu");
                break;
            default:
                System.out.println("gridigin gun yok");
        }
    }
}
