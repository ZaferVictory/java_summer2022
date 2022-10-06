package practise_01;

import java.util.Scanner;

public class Q05_ornekSorular {
    public static void main(String[] args) {


        int sayi1=10;
        int sayi2=20;

        System.out.println("yeni sayi1 değeri= "+(sayi1+30)/2);
        System.out.println("yeni say2 değeri= "+(sayi2+10)/3);

        Scanner scan=new Scanner(System.in);
        System.out.println("bir tam sayi girin");
        int sayi=scan.nextInt();

        System.out.println("ikinci bir tam sayi girin");
        int sayi3=scan.nextInt();

        System.out.println("çarpımları= "+sayi*sayi3);
        System.out.println("farkları= "+(sayi-sayi3));
        System.out.println("toplamları= "+(sayi+sayi3));

    }

}
