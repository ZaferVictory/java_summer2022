package day11_stringManupulation;

public class C04_Contains {

    public static void main(String[] args) {
        /*
        Soru 2) Kullanicidan bir cumle isteyin.
        Cumle “buyuk” kelimesi iceriyorsa tum cumleyi buyuk harf olarak,
        “kucuk” kelimesi iceriyorsa tum cumleyi kucuk harf olarak yazdirin,
        iki kelimeyi de icermiyorsa “Cumle kucuk yada buyuk kelimesi icermiyor” yazdirin.

         */

        String cumle="Java buyuk dunya küçük";
        cumle=cumle.toLowerCase();
        // requirements de buyuk harf ve kuçuk harf hassasiyeti konusunda bir şey söylenmemiş
        // ıkıncı olarakda her ıkı kelimeyi de içerme durumu da açıklanmamış.
        // bu durumda görevi bize kim verdiyse ona sormak lazım


        // ek requerements: ikisinide içeriyorsa " karar ver buyuk mu yazdırayım, kucuk mu?"
        // case sensitive olmasın

        if (cumle.contains("kucuk") && cumle.contains("buyuk")){
            System.out.println("Karar ver buyuk mu yazdirayim, kucuk mu ?");
        } else if (cumle.contains("kucuk")){
            System.out.println(cumle.toLowerCase());
        } else if(cumle.contains("buyuk")){
            System.out.println(cumle.toUpperCase());
        } else{
            System.out.println("Cumle kucuk yada buyuk kelimesi icermiyor");
        }


    }
}
