package replitSorulari;

import java.util.Scanner;

public class calisma04_Scanner {
/*
    Kullanıcıdan dakika girmesini isteyin, Dakikaları birkaç yıl ve gün sayısına dönüştürmek için bir Java programı yazın.
            INPUT:
    Dakika sayısı: 3456789
    OUTPUT :
            3456789 dakika yaklaşık 6 yıl 210 gündür

 */
public static void main(String[] args) {

   Scanner scan=new Scanner(System.in);
   System.out.println("dakika giriniz");
   double dakika=scan.nextInt();
   double yil=365;
   double gün=24;
   double sonucyil=(dakika/24)*yil;
   System.out.println(sonucyil);

}

}
