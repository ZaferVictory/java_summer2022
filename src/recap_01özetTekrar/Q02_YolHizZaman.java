package recap_01özetTekrar;

import java.util.Scanner;

public class Q02_YolHizZaman {

    public static void main(String[] args) {
         /*  Problem Tanımı
        Mesafeyi ve hızı alıp süreyi hesaplayan bir kod yazınız.
        Örneğin:İstanbul ile Ankara arası 400km olarak ölçülmektedir. Bu yolu ortalama
        120 km/saat hızla giden bir araç ne kadar sürede hedefe varır?
        Örnek Ekran Çıktısı
        Mesafeyi giriniz: 400
        Hızı giriniz: 100
        Süre 4 saattir.
     */

        Scanner scan=new Scanner(System.in);
        System.out.println("ankara-istanbul arası mesafeyi gir bakam");
        double km=scan.nextDouble();

        Scanner scan1=new Scanner(System.in);
        System.out.println("hızı da söyle bakam");

        double hız=scan.nextDouble();


        System.out.println("süre="+km/hız+" saatir");

        // aşağıdaki hocanın çözümü

        Scanner scan2=new Scanner(System.in);
        System.out.println("gideceğiniz yol mesafesi(km):");
                double km1=scan.nextDouble();

        System.out.println("ortalama hızınız");
                double hız1=scan.nextDouble();

        double varisSuresi=km1/hız1;

        System.out.println("varis süreniz:"+ varisSuresi);



    }
}
