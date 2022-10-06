package day27_StatıcKeyword;

public class deneme {

    int sayi=15;
    static int rakam=10;

    public static void main(String[] args) {
        rakam-=2;
        deneme obj1=new deneme();

        obj1.sayi-=3;

        System.out.println(obj1.sayi);
        System.out.println(rakam);

        sayilarOlustur(obj1.sayi,rakam);


    }

    private static void sayilarOlustur(int sayi, int rakam) {

        sayi+=5;
        rakam=0;

        System.out.println(sayi+rakam);//17
    }
}
