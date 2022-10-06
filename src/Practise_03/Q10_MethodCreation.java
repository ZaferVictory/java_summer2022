package Practise_03;

import java.util.Scanner;

public class Q10_MethodCreation {
    public static void main(String[] args) {
        /*
      Problem Tanımı :
      Basit 4 islem yapan bir hesap makinesi kodlayiniz....
      Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayalinız.
      Kullanicidan iki sayi girmesini isteyiniz.
      Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.
    */
        Scanner scan=new Scanner(System.in);
        System.out.println("yapacaginiz dort islemi* + - / olarak seciniz");

        char islem=scan.next().charAt(0);// kullanıcının sectigi ilk karakteri al diye böyle yazıldı

        System.out.println("birinci sayi :");
        double num1=scan.nextDouble();
        System.out.println("ikinci sayi");
        double num2=scan.nextDouble();

        hesapmakinesi(islem,num1,num2);

        }

    public static void hesapmakinesi(char islem, double num1, double num2) {

        if (islem=='+' || islem=='-' || islem=='*' || islem=='/'){

            switch (islem) {
                case '+':
                    System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
                    break;
                case '-':
                    System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
                    break;
                case '/':
                    System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
                    break;
                case '*':
                    System.out.println(num1 + "*" + num2 + "=" + (num1 + num2));
                    break;

                //default:
                //    System.out.println("hatali işlem girişi");// burada default kullamaya gerek yok
                // yukarıda zaten if de ksıtlıyorum bunu else de ayırıca belirtiyorum
                }
            }else System.out.println("hatali giris");


}
}
