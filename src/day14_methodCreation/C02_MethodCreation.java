package day14_methodCreation;

import day13_methodCreation.C04_methodCreation;

public class C02_MethodCreation {
    public static void main(String[] args) {

        // verilen üç basamaklı bir sayının rakamları toplamını yazdıran bir method  oluşturalım.

       int  input=423;

       rakamlariTopla(input);
        C04_methodCreation.topla(6,3);
        C01_methodCreation.terstenYazdır("zafer");

    }

    public static void rakamlariTopla(int input) {

        int birlerBasamagi=0;
        int rakamlarToplami=0;
        int temp=input;


        birlerBasamagi=input%10;
        rakamlarToplami+=birlerBasamagi;
        input/=10;

        birlerBasamagi=input%10;
        rakamlarToplami+=birlerBasamagi;
        input/=10;

        birlerBasamagi=input%10;
        rakamlarToplami+=birlerBasamagi;
        input/=10;

        System.out.println("girdiginiz "+temp+" sayisinin rakamlarToplami"+rakamlarToplami);


    }


}
