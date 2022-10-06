package recap_02özetTekrar;

import java.util.Scanner;

public class Q08_StringManipulation {

    public static void main(String[] args) {

        //Kullanicidan ismini ve soyisimi girmesini isteyin, sonrasinda konsola tam ismini buyuk harfler ile yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("adını gir");

        String isim=scan.nextLine().toUpperCase();

        System.out.println("soyismini gir");

        String soyisim=scan.nextLine();

        System.out.println("adınız= "+isim);
        System.out.println("soyisminiz= "+soyisim);
    }
}
