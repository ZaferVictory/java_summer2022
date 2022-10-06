package day07_ifstatements;

public class C01_AndOperatörleri {

    public static void main(String[] args) {
        int a=10;
        int b=15;
        int c=20;

        System.out.println(a>0 && b<20 && c>=b);// True




        System.out.println(a<0 && b<20 && c>=b);// false

        /* java and operatörü konusunda bize iki seçenek sunar


         && kullanırsak ilk false bulduunda artık sonucun false olacağını blir ve geriye kalan şartları
        incelemez

        ama & tek kullanırsak tüm şartları kontroledersonra sonucu belirler
        bu çalışma usulünden dolayı & operatörü, && operatörüne göre daha yavaş olabilir.
         */


        System.out.println(a<0 & b<20 & c>=b);

        int a1=25;
        int b1=30;
        int c1=35;

        System.out.println(a1>0 && b1>20 && c1<=40);

        System.out.println(a1<=1 && b1>20 && c1>=30);

    }
}
