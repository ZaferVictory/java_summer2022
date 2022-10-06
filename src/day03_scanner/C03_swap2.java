package day03_scanner;

public class C03_swap2 {
    public static void main(String[] args) {
        //  bir önceki swap sorusunu bos kova kullanmadan yapın

        int sayi1=15;
        int sayi2=25;

        sayi1=sayi1+sayi2;
        sayi2=sayi1-sayi2;
        sayi1=sayi1-sayi2;
        System.out.println("swap işleminden sonra sayi1:"+sayi1);
        System.out.println("swap işleminden sonra sayi2:"+sayi2);

    }
}
