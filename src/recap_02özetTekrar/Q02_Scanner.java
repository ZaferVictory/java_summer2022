package recap_02özetTekrar;

import java.util.Scanner;

public class Q02_Scanner {

    public static void main(String[] args) {

         /*  Problem Tanımı
        Bir işçinin işi bitirme süresini ve toplam işçi sayısını alarak, işin bitme süresini
        hesaplayan kodu yazınız.
        Örneğin, Bir işçi bir işi 10 günde yapabilmektedir.
        Buna göre 2 işçi aynı işi kaç günde yapar?
        Örnek Ekran Çıktısı
         Bir işçi işi kaç günde bitirmektedir? 10
         Toplam kaç işçi çalışacak? 2
        İşin bitme süresi 5 gündür.
    */

        int birbitirmesuresi=10;
        int toplamisci=2;

        int isinBitmesuresi=birbitirmesuresi/toplamisci;
        System.out.println("İşin bitme süresi:"+isinBitmesuresi+" gündür");

// aşağıda scan ile yaptım.&&&& hocada böyle yaptı&&&&

        Scanner scan =new Scanner(System.in);
        System.out.println(" Bir işçinin işi bitirme süresini gir");
        int birbitirmesuresi1=scan.nextInt();// bunları double de yapabiliriz

        System.out.println("toplam işçi sayısını gir");
        int toplamisci1=scan.nextInt();// bunları double de yapabiliriz

        double isinBitmesuresi1=birbitirmesuresi1/toplamisci1;// burada data casting yaptım sonucu genişlettim.
        System.out.println("İşin bitme süresi:"+isinBitmesuresi1+" gündür");


    }
}
