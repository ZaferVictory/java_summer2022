package grup_03calisma;

import java.util.Scanner;

public class constructerİismDegisRunner {

    public static void main(String[] args) {

        String isim="zafer";
        String soyisim="kosktepe";
        String ogrenciNo="1234";
        int yas=36;

        isimDegistir(isim,soyisim,ogrenciNo,yas);
        soyisimdegistir(soyisim);

    }



    public static void isimDegistir(String isim, String soyisim, String ogrenciNo, int yas) {


        constructerİsimDegistirme dgs=new constructerİsimDegistirme("ekrem","kosktepe","1258",12);

        System.out.println(dgs);



    }

    public static void soyisimdegistir(String soyisim) {

        Scanner scan=new Scanner(soyisim);
        System.out.println("lütfen yeni bir soyisim giriniz");
        String yeniSoyİsim=scan.nextLine();










    }

}
