package day14_methodCreation;

import day07_ifstatements.C01_AndOperatörleri;
import day13_methodCreation.C04_methodCreation;

public class C01_methodCreation {

    public static void main(String[] args) {
        // input olatrak verilen 4 harfli bir stringi tersten yazdıran bir method oluşturalım



        terstenYazdır("okan");
        C04_methodCreation.topla(6,5);


    }

    public static void terstenYazdır(String input) {
        String tersInput = input.substring(3) +
                input.substring(2, 3) +
                input.substring(1, 2) +
                input.substring(0, 1);

        System.out.println("verilen kelimenin tersten yazılışı :" + tersInput);
    }
}
