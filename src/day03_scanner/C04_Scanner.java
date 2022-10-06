package day03_scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        // kullanıcıdan ismini isteyin
        // girilen ismi
        // isminiz : zafer    şeklinde yazdırın


        // insanların dünyasından kodlarımızın bulunduğu klasa değer almak için
        // Scannner kalsını kullanırız

        // 1- scanner objesi oluşturalım

        Scanner scan = new Scanner(System.in);

        // 2. kullanıcıya ne istediğimizi söyleyelim

        System.out.println("lütfen isminiz giriniz");
        // oluşturduğumuz scan objesi ile kullanıcının girdiği değeri alıp
        //oluşturacağımız uygun bir variables e atalaım

        String kullaniciİsmi = scan.next();

        System.out.println("isminiz:" + kullaniciİsmi);
    }
}
