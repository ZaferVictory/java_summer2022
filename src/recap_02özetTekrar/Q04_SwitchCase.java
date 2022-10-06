package recap_02özetTekrar;

import java.util.Scanner;

public class Q04_SwitchCase {

    public static void main(String[] args) {

         /*
    gunleri gösterebilen bir program yazın
    gun Pazartesi veya Sali ise:
    Java dersi gunleri
    gun Persembe veya Cuma ise:
    Selenyum dersi gunleri
    gun carsamba veya cumartesi ise:
    SQL dersi gunleri
    aksi halde: izin gunu
    (if deyimini KULLANMAYIN)
*/

        String gun="pazartesi";
        switch (gun){
            case"pazartesi":
            case"sali":
                System.out.println("java dersi");
                break;
            case"carsamba":
            case"cumartesi":
                System.out.println("sql dersi");
                break;
            case"persembe":
            case"cuma":
                System.out.println("selenyum dersi");
                break;
            default:
                System.out.println("izin gunu");
















        /*
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir gun adi giriniz");
        String gun=scan.next().toLowerCase();

       switch (gun) {
           case "pazartesi || sali":
               System.out.println("Java dersi gunleri");
               break;
           case " perşembe || cuma":
               System.out.println("Selenyum dersi gunleri");
               break;
           case "çarşamba || cumartesi":
               System.out.println("SQL dersi gunleri");
               break;
           default:
               System.out.println("izin gunu");
               break;

         */


        // yukarıda nerede hata var bul
        // aşağıda uzun yöntem ile yapıyorum

/*
        switch (gun){
            case "pazartesi":
                System.out.println("Java dersi gunleri");
                break;
            case"sali":
                System.out.println("Java dersi gunleri");
                break;
            case"carsamba":
                System.out.println("SQL dersi gunleri");
                break;
            case"persembe":
                 System.out.println("Selenyum dersi gunleri");
                 break;
            case"cuma":
                System.out.println("Selenyum dersi gunleri");
                break;
            case "cumartesi":
                System.out.println("SQL dersi gunleri");
                break;
            default:
                System.out.println("izin gunu");
                break;

 */
        }
    }
}
