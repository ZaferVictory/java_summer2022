package recap_01özetTekrar;

import java.util.Scanner;

public class Q08_BMI {

    public static void main(String[] args) {
        /*
		 Kullanicidan kilosunu ve boyunu alip
		 Vucut kitle indeksini hesaplayan bir program yaziniz.
		 Ipucu : Vucut
		 Kitle Indeksi (VKI) = Vucut Agirligi(kg.) / Boy uzunlugunun karesi (m.)
		 ORNEK:
		 INPUT      : Kilo: 71
		              Boy: 1,72
		 OUTPUT  : Vucut Kitle Indeksiniz : 23
		 	 */

        Scanner scan=new Scanner(System.in);
        System.out.println("boyunuzu giriniz");
        double boy=scan.nextDouble();

        System.out.println("kilonuzu giriniz");
        double kilo=scan.nextDouble();

        //boy=boy/100;
        boy/=100;// cm olarak girilen boyu metre ye çevirmek için böldük

        double VKI=kilo/(boy*boy);

        System.out.println(VKI);

    }
}
