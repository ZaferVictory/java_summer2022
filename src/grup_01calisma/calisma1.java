package grup_01calisma;

import java.util.Scanner;

public class calisma1 {
    /*
    Bir palindrom, madam veya racecar veya 10801 sayısı gibi ileriye doğru geriye doğru okuyan bir kelime, sayı, kelime öbeği veya diğer karakter dizisidir.
    Girilecek kelimenin palindrom olup olmadığını doğrulayacak bir Java Kodu yazın.
    Test Data:
    madam
    Beklenen Çıktı:
    True

     */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("bir kelime ve ya sayi giriniz");
        String girilensey=scan.nextLine();

       String cevirme="";

        for (int i=girilensey.length()-1; i >=0; i--) {

            cevirme=cevirme+girilensey.charAt(i);
            System.out.println(cevirme);
        }

        if (girilensey.equals(cevirme)){
            System.out.println("true");

        }else{
            System.out.println("false");
        }


            }
        }

