package recap_02özetTekrar;

import java.util.Scanner;

public class Q03_ScannerIFElse {

    public static void main(String[] args) {
        /*
		Problem tanimi :
		Kullanicidan  yasini ve kilosunu alaliniz
		18 yasindan kucuk ise kan bagisi yapamaz
		18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		18 yasindan buyuk ve 50 ve 50 kilodan agir ise kan bagisi yapabilir.



        hocanın yaptığı buu desrte

        Scanner scan = new Scanner(System.in);
        System.out.println("yasinizi giriniz :");
        int yas = scan.nextInt();

        System.out.println("kilonuzu giriniz :");
        int kilo = scan.nextInt();

        if(yas>0 && yas<18){
            System.out.println("yasi 18 den kucuk olanlar kan bagisi yapamaz");
        }else if(yas>=18){
            if(kilo>0 && kilo<50){
                System.out.println("kilonuz 50 den kucuk oldugu icin kan bagisi yapamazsiniz");
            }else{
                System.out.println("kan bagisi yapabilirsiniz");
            }















     // Scanner scan = new Scanner(System.in);
     // System.out.println("yaşınızı yazınız");
//
     //  int yas = scan.nextInt();
//
     //  System.out.println("kilonuzu giriniz");
     //  int kilo = scan.nextInt();
//
     //  if (yas> && yas < 18) {
     //      System.out.println("kan bağışı yapamazsınız");
     //  } else if (yas > 18 && kilo < 50) {
     //      System.out.println("kan bagisi yapamazsınız");
     //  } else if (yas > 18 && kilo >= 50) {
     //      System.out.println("kan bagisi yapabilirsiniz");
     //  }



        // yukarıda normal if ile çözdüm aşağıda nested turnury ile çözümü var

        Scanner scan = new Scanner(System.in);
        System.out.println("yaşınızı yazınız");

        int yas1 = scan.nextInt();

        System.out.println("kilonuzu giriniz");
        int kilo1 = scan.nextInt();


        String kanbagisi=yas1 < 18?"kan bağışı yapamazsınız":yas1 > 18 && kilo1< 50?"kan bagisi yapamazsınız"
                :yas1 > 18 && kilo1 > 50?"kan bagisi yapabilirsiniz:":"hatalı giriş";
        System.out.println("kanbagisi = " + kanbagisi);








         */


                
        
            }

        }


