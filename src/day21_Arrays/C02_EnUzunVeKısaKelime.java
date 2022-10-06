package day21_Arrays;

public class C02_EnUzunVeKısaKelime {
    public static void main(String[] args) {
        //Soru 2- Verilen String bir array’de en uzun
        // ve en kisa String’leri yazdiran bir method olusturun

        String isimler[]={"erdal","onur","mehmet","hayrullah","mihrican"};

        enUzunVeKısayiYazdir(isimler);
    }

    public static void enUzunVeKısayiYazdir(String[] isimler) {

        String enUzunKelime=isimler[0];
        String enKisaKelime=isimler[0];

        for (int i = 1; i <isimler.length ; i++) {

            if (isimler[i].length()>enUzunKelime.length()){
                enUzunKelime=isimler[i];
            }
            if (isimler[i].length()<enKisaKelime.length()){
                enKisaKelime=isimler[i];
            }
        }
        System.out.println("Arraydeki en uzun kelime : " + enUzunKelime);
        System.out.println("Arraydeki en kisa kelime : " + enKisaKelime);
    }
}
