package day04_Datacasting;

public class C05_pre_post_ıncrement {

    public static void main(String[] args) {

        int sayi1=10;
        int sayi2= sayi1+1; // sayi--> 11

        /* pre ve ya post increment/decrement
        sadece ++ ve -- işlemi için geçerlidir.
        bu iki işlem sayıdan sonra veya önce yazılmasına göre farklı iki
        işleyiş gerçekleştirir.
         */

        int sayi3= sayi2++; // 1- sayi2 bir artırılacak
                            // 2- sayi2 değeri sayı3 e atanacak

        int sayi4=++sayi1;   //1- sayi1 bir artırılacak
                            // 2- sayi1 değeri sayı4 e atanacak
    }
}
