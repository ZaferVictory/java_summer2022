package recap_02özetTekrar;

import java.util.Scanner;

public class Q11_StringManipulation {

    public static void main(String[] args) {

        /*
         * Kulanicidan bir kelime isteyin eger kelime 3 ve daha fazla harfden olusuyorsa son
         * iki harfini 3 kere yan yana yazdirin. degil ise girilen kelimeyi yazdirin
         *
         * ornek
         * input = Ali
         * output = lilili
         *
         * input = el
         * output = el
         */


        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen adınızı giriniz");
        String isim = scan.nextLine();


       if (isim.length() >= 3) {
           System.out.print(isim.substring(isim.length()-2));
           System.out.print(isim.substring(isim.length()-2));
           System.out.print(isim.substring(isim.length()-2));
       } else  {
           System.out.println(isim);
       }


             // System.out.print(isim.substring(isim.length()-2)+isim.substring(isim.length()-2)
             // +isim.substring(isim.length()-2)); yukarı if in altına bunu da gecebilirsin



    }


}

