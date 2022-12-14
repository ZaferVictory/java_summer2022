package practise_13interviewQuestions;

import java.util.Scanner;

public class Q01 {
    /*  soru1: Check if the integer is an Armstrong numbers to 4 digit
        numbers(4 digit-> exclusive)
            Armstrong sayi:herhangi bir 3 basamakli sayinin rakamlarinin kupleri
             toplami o sayiyi veriyorsa sayi  Armstrong sayidir
                (0, 1, 153, 370, 371, 407)
                153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
                370 = 3*3*3 + 7*7*7 + 0*0*0 = 370
                method create ediniz
                parametre olarak sayi alsin method
                sayilarin kup toplami  conteiner atamasi yap
                kullanıcıdan aldıgım bos konteynır conteiner
                if icinde kontrol ediniz
                % kullaniniz
               basamaktaki sayi bos variable olusur

              soru2: Birden baslayarak girilen sayıya kadar her bir tamsayının
              armstrong sayı olup olmadıgını
              gösteren program yazınız */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayi giriniz");

        int sayi=scan.nextInt();

        armstrong(sayi);
        girilenSayiyaKadarOlanArmstrongSayilar(sayi);






    }

    private static void girilenSayiyaKadarOlanArmstrongSayilar(int sayi) {
        /*
        soru2: Birden baslayarak girilen sayıya kadar her bir tamsayının
              armstrong sayı olup olmadıgını
              gösteren program yazınız 
         */
        for (int i = 1; i <=sayi ; i++) {
            armstrong(i);// armstrong metodunda zaten bu islemı yapmıstım o metodu çagırdım i yi metoda koyupp calıstırdım
        }
        
    }

    private static void armstrong(int sayi) {
        int sayininKuplerToplami = 0;
        int basamaktakiSayi = 0;
        int girilenSayi = sayi;//sayiyi sayinin kupler toplami ile kiyaslamak icin

        while (sayi > 0) {
            basamaktakiSayi = sayi % 10;//rakam rakam ayirdik sayiyi
            sayininKuplerToplami += (basamaktakiSayi * basamaktakiSayi * basamaktakiSayi);
            sayi = sayi / 10;

        }
        if (girilenSayi==sayininKuplerToplami){
            System.out.println("girilenSayi armstrong sayidir= " + girilenSayi);
        }else System.out.println("girilenSayi armstrong sayi degeldir= " + girilenSayi);

    }

}
