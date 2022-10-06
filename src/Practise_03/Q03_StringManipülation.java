package Practise_03;

import java.util.Scanner;

public class Q03_StringManipülation {

    public static void main(String[] args) {
        /*
         * Kullanicidan 4 kelime isteyin ve cumle olarak yazdirip sonuna . koyun
         *
         * Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
         *         Output : Cesaret insana sinirlarini ogretir.
         *
         */


        Scanner scan=new Scanner(System.in);
        System.out.println("ilk kelime");
         String input1=scan.nextLine().toLowerCase();

        System.out.println("ikinci");
        String input2=scan.nextLine().toLowerCase();

        System.out.println("üçüncü");
        String input3=scan.nextLine().toLowerCase();

        System.out.println("üçüncü");
        String input4=scan.nextLine().toLowerCase();



        System.out.println(input1.substring(0,1).toUpperCase()+input1.substring(1)+" "+input2+" "
                +input3+" "+input4);



    }
}
