package day05_matematikselislemler;

public class C04_wrapperClass {

    public static void main(String[] args) {
        String str="Java Cok guzel";
        str.toUpperCase();

        int sayi=10;// int primitive data türüdür.
        // primitive data turlerinin yaninda method'lar olmaz
        // java bazi method'lari kullanabilmemiz icin
        // her bir primitive data turu icin bir wrapper class olusturmustur.

        Integer sayi2=10;// bu ise non-primetive data türüdür. yukarıdaki de int buda int gibi duruyor hangisi olduğunu
                        //  nerden anlayacağız burada büyük harfle başladı ordan anlayacağız.
                        // sayi2 den sonra nokta koydun mu hazır methodlar olur. primetive de bu yok


        sayi2.byteValue();

        System.out.println(sayi2+sayi);

    }
}
