package day21_Arrays;

import java.util.Scanner;

public class C03_Contains {
    public static void main(String[] args) {
        //Soru 3- kullanıcıdan aldıgınız bir ismin, Verilen bir array de
        //olup olmadigini kontrol edip,
        //bize true veya false sonucu donen bir method olusturun.

        String[] isimler={"başak","nurullah","fatih","adem", "enes"};
        Scanner scan=new Scanner(System.in);
        System.out.println("aradiginiz ismi yaziniz");
        String arananKelime=scan.nextLine();

        boolean sonuc=contains(isimler,arananKelime);
        if (sonuc){
            System.out.println("girilen isimlistede var");
        }else{
            System.out.println("girilen isim listede yok");
        }

    }

    public static boolean contains(String[] isimler, String arananKelime) {

        boolean sonucMethod=false;

        for (int i = 0; i <isimler.length ; i++) {
            if (isimler[i].equalsIgnoreCase(arananKelime)){
                sonucMethod=true;
            }
        }

        return sonucMethod;
    }
}
