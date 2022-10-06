package day09_Ternary;

import java.util.Scanner;

public class C05_SwitchCase {
    public static void main(String[] args) {
       /* pazartesi
       salı
        çarşamba
         perşembe
        cuma
        cumartesi
        pazar
        */
        Scanner scan=new Scanner(System.in);
        System.out.println("kaçııcı gün olduğunu girin");
        int rakam= scan.nextInt();


        switch (rakam){
            case 1:
                System.out.println("pazartesi");
                break;
            case 2:
                System.out.println("sali");
                break;
            case 3:
                System.out.println("çarşamba");
                break;
            case 4:
                System.out.println("persembe");
                break;
            case 5:
                System.out.println("cuma");
                break;
            case 6:
                System.out.println("cumartesi");
                break;
            case 7:
                System.out.println("pazar");
                break;
            default:
                System.out.println("Hatalı giriş");
        }

        /*
		TASK :
		Girilen not değerini aşağıdaki tabloya göre karşılığını print eden code create ediniz.
		1. 0(dahil) ile 50 arasi - D
		2. 50(dahil) ile 60 arası - C
		3. 60(dahil) ile 80 arası - B
		4. 80(dahil) ustu- A
		Yanlis not girilirse ekrana "Gecerli not giriniz" yazdirin

		AHAN DA  TRICK :) switch() de long kullanilmaz, float kullanilmaz, double kullanilmaz, boolean kullanilmaz.
		switch() de int, byte, short, char, String kullanilir.

		 */


        int not=scan.nextInt();






    }
}
