package day04_Datacasting;

public class C02_Datacasting {

    public static void main(String[] args) {
        int sayi1= 23;
        int sayi2= 5;

        System.out.println(sayi1/sayi2); // 4.6 degil 4 olarak yazdırır--> ikisi de int oldugundan sonucu
        // int olarak kabul edip yazdirir


        System.out.println(25*7/3); // 58.6666.. -->58


        double sayi3=5;
        System.out.println(sayi1/sayi3); // 4.6 iki variable'in data turu degisik oldugunda
        // daha kapsamli olani data turu olarak kabul eder.double integer dan daha kapsamlıdır.

        double sayi4=20;
        System.out.println(sayi1*sayi2/sayi4);
    }
}
