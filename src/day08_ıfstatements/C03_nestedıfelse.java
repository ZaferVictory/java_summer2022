package day08_ıfstatements;

import java.util.Scanner;

public class C03_nestedıfelse {

    public static void main(String[] args) {
        /* emeklilik kontrolü yapan bir program yazınız
        cinsiyet olarak E ( ERKEK) K (KADIN) değişkenlerini kabul etsin
        farklı bir harf veya sembol girilirse hata mesajı verlsin

        emeklilik için kadınlarda yas sinri 60
        erkeklerde 65 olsun
        negatif yas veya 80' den büyük yas girilirse hata mesajı versin

         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen cinsiyetinizi yazınız"+
                "\n erkek için E kadın için K harfini giriniz");
        char cinsiyet= scan.next().toUpperCase().charAt(0);
        System.out.println("lütfen yaşınızı giriniz");
        double yas=scan.nextDouble();

        if (cinsiyet=='E') {
                if (yas<0 || yas>80) {
                    System.out.println("gecerli yas giriniz");
                }else if(yas<65) {
                    System.out.println("emekli olamazsın");
                } else {
                    System.out.println("emekli olabilirsin");
                }
        } else if (cinsiyet=='K') {
            if (yas < 0 || yas > 80) {
                System.out.println("gecerli yas giriniz");
            } else if (yas < 60) {
                System.out.println("emekli olamazsın");
            } else {
                System.out.println("emekli olabilirsin");
            }
        }else {
            System.out.println("geçerli bir tercih giriniz");
        }
    }

}
