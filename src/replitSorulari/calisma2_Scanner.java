package replitSorulari;

import java.util.Scanner;

public class calisma2_Scanner {

/*
    Girilen zamanı saniyeye çeviren bir program yazınız.

    Örnek Çıktı:

            1 saat 10 dakika 50 saniye ==>

            4250 saniye

 */
public static void main(String[] args) {

    Scanner scan=new Scanner(System.in);
    System.out.println("girin");
    int saat=scan.nextInt();
    int dk=scan.nextInt();
    int sn=scan.nextInt();
    int sonuc=sn+(dk*60)+(saat*60*60);
    System.out.println(saat+" saat "+dk+" dakika "+sn+" saniye==> "+sonuc+" saniye");

}

}
