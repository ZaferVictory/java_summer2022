package Practise_03;

import java.util.Scanner;

public class Q09_StringManipulation {

    public static void main(String[] args) {
        // Kullanicidan 4 harfli bir kelime isteyin
        // ve girilen kelimeyi tersten yazdirin

        Scanner scan = new Scanner(System.in); //mesaj vermeden de konsol da girdi girilir

        String kelime=scan.nextLine();
        System.out.println(kelime.length());

        if (kelime.length()<=4){
            char bir=kelime.charAt(0);
            char iki=kelime.charAt(1);
            char uc=kelime.charAt(2);
            char dort=kelime.charAt(3);

            System.out.println("tersten= "+dort+uc+iki+bir);
        }else{
            System.out.println("girdiğiniz kelime uzunluğu dört karakterden fazla");
        }
    }
}
