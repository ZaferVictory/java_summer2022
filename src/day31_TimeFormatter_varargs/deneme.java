package day31_TimeFormatter_varargs;

import day04_Datacasting.C02_Datacasting;

import static day31_TimeFormatter_varargs.C03_VarargsİleToplama.toplaYazdir;

public class deneme {

    public static void main(String[] args) {


        int rakam1=20;
        int rakam2=25;
        int rakam3=30;
        int rakam4=35;
        int rakam5=35;
        int rakam6=35;

        toplaYazdirr(rakam1,rakam6);
        toplaYazdirr(rakam1,rakam6,rakam2);
        toplaYazdirr(rakam1,rakam6,rakam5,rakam3);
        toplaYazdirr(rakam1);
        toplaYazdirr(rakam1,rakam6,rakam2,rakam3,rakam4,rakam5);
        toplaYazdirr(rakam1,rakam6);
        toplaYazdirr(rakam1,rakam6,rakam3);
        toplaYazdirr(rakam1,rakam6,rakam4);
    

    }

    public static void toplaYazdirr(int... sayi) {

    int sayiAdedi=sayi.length;
    int sayac=0;
        for (int each:sayi
             ) {
            sayac++;
        }
        System.out.println(sayac+" methodda ki sayi adedi=" +sayiAdedi*sayiAdedi+" dir");
    }
}
