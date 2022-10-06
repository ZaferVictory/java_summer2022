package day03_scanner;

public class C02_Swap {

    public static void main(String[] args) {
       /* 1- Verilen sayi1 ve sayi2 variable’larinin degerlerini degistiren (SWAP)
           bir program yaziniz
            Orn 	: sayi1=10 ve
                      sayi2=20;
            kod calistiktan sonra
                      sayi1=20 ve
                      sayi2=10

        */

        int sayi1=10;
        int sayi2=20;
        int sayi3=0;

        // sayi3 geçici kovamız
        // adım 1 = sayi2' yi boş kovaya koyalım
        sayi3=sayi2; // 10   20 20


        // adım 2- 1.sayıyı 2.sayıya atayacağız

        sayi2=sayi1; // 10   10 20

        // adım 3- boş kovadaki sayıyı sayi1' e atayalım

        sayi1=sayi3;  // 20   10   20


        System.out.println("swap işleminden sonra sayi1:"+sayi1);// sayi 20
        System.out.println("swap işleminden sonra sayi2:"+sayi2);// sayi 10
    }
}
