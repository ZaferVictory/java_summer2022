package replitSorulari;

import java.util.Scanner;

public class Calisma01_Scanner {




    public static void main(String[] args) {

/*

        Kullanıcıya Adı, Soyadı ve kredi kartı numaralarını sorarak verilen formata ceviren java kodunu yaziniz.

                Input :

        John White

        1234 2345 3456 1478

        Output : Name :

        J*** W****

        CCN : **** **** **** 1478

        Ilk Harfler Buyuk harf ile baslamalidir.


 */

        Scanner scan =new Scanner(System.in);
        String isim=scan.nextLine();
        String soyisim=scan.nextLine();
        String krediKarti=scan.nextLine();

        isim=isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w","*");
        soyisim=soyisim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w","*");
        krediKarti="**** **** **** 1478";

        System.out.println(isim+" "+soyisim);
        System.out.println(krediKarti);





    }




}
