package recap_02özetTekrar;

import java.util.Scanner;

public class Q07_NestedIfandTernary {

    public static void main(String[] args) {
         /*
    0 ~ 9 arasındaki sayilari cevirebilen bir java programi yazin
   kelimelere, sayı 9'dan buyuk veya sifirdan kucukse,
   cikis "Gecersiz" olmalidir
   NestedIf ve Ternary kullanarak 2 yolla da cozunuz
 */

        int sayi=5;
        String sonuc="";

        if (sayi>=0 && sayi<=9){
            if (sayi==9){sonuc="dokuz";}
            else if (sayi==8){sonuc="sekiz";}
            else if (sayi==7){sonuc="yedi";}
            else if (sayi==6){sonuc="alti";}
            else if (sayi==5){sonuc="bes";}
            else if (sayi==4){sonuc="dört";}
            else if (sayi==3){sonuc="uc";}
            else if (sayi==2){sonuc="iki";}
            else if (sayi==1){sonuc="bir";}
            else  sonuc="sifir";
        }else sonuc="gecersiz";
        System.out.println(sonuc);



        int n=7;
        String result= n==9?"dokuz":n==8?"sekiz":n==7?"yedi":n==6?"altı":n==5?"bes":n==4?"dört":n==3?"uc"
                :n==2?"iki":n==1?"bir":n==0?"sıfır":"gecersiz";

        System.out.println("result = " + result);


     /*

     bu aşagıdakini ben yaptım.
     alt alta kelimelerin yerine rakam ismlerini yazabilirixz

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen 0 ile 9 arasında bir rakam giriniz");

       int sayi=scan.nextInt();

        if (sayi<0 || sayi>9){
            System.out.println("lütfen belirtilen aralılarlarda bir rakam girin");
        } else if (sayi==0) {
            System.out.println("bugun");
        } else if (sayi==1) {
            System.out.println("soruların");
        } else if (sayi==2) {
            System.out.println("bircogunu");
        } else if (sayi==3) {
            System.out.println("cozdugum");
        } else if (sayi==4) {
            System.out.println("icin");
        } else if (sayi==5) {
            System.out.println("cok");
        } else if (sayi==6) {
            System.out.println("mutluyum");
        } else if (sayi==7) {
            System.out.println("umarım böyle");
        } else if (sayi==8) {
            System.out.println("devam");
        } else if (sayi==9) {
            System.out.println("eder");

        }

      */


    }
}
