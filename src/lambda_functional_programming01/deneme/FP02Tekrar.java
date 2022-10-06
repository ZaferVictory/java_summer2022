package lambda_functional_programming01.deneme;

import lambda_functional_programming01.Utils;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FP02Tekrar {

    public static void main(String[] args) {
        List<Integer> liste = new ArrayList<>();
        liste.add(8);
        liste.add(9);
        liste.add(131);
        liste.add(10);
        liste.add(9);
        liste.add(10);
        liste.add(2);
        liste.add(8);
        System.out.println(liste);
        listElemanlariniYazdirFunctional(liste);
        System.out.println();
        ciftElemanlariniYazdirFunctional(liste);
        System.out.println();
        tekElemanlariniYazdirFunctional(liste);
        System.out.println();
        tekrarsiztTekElemanlarinKupunuYazdir(liste);
        System.out.println();
        tekrarsizCiftElamlarınKareToplami(liste);
        System.out.println();
        tekrasizCiftElemanlarinKupununCarpimi(liste);
        System.out.println();
        enBuyukDegeriBul(liste);
        System.out.println();
        get7denBuyukenkucuk(liste);
        System.out.println();
        tekrarsiz5tenBuyukElamanYarisi(liste);
    }
    //1) Ardışık list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(functional ve Structured)

    public static void listElemanlariniYazdirFunctional(List<Integer>list){

        list.stream().forEach(FpUtilsTekrar::boslukBırakarakYazdir);


    }
    //2) çift sayi olan list elemanlarını aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(functional)

    public static void ciftElemanlariniYazdirFunctional(List<Integer>list){
        list.stream().filter(FpUtilsTekrar::ciftListElemanYazdir).forEach(FpUtilsTekrar::boslukBırakarakYazdir);

    }

    //3) Ardışık tek list elemanlarının karelerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)
    public static void tekElemanlariniYazdirFunctional (List<Integer>list){


        list.stream().filter(FpUtilsTekrar::tekListElemanYazdir).map(FpUtilsTekrar::karesinial).forEach(FpUtilsTekrar::boslukBırakarakYazdir);
    }
    //4) Ardışık tek list elemanlarının küplerini tekrarsız olarak aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.

    public static void tekrarsiztTekElemanlarinKupunuYazdir(List<Integer>list){

        list.stream().distinct().filter(FpUtilsTekrar::tekListElemanYazdir).map(FpUtilsTekrar::tekListkupleriYazdir).forEach(FpUtilsTekrar::boslukBırakarakYazdir);
    }
    /*5) Tekrarsız çift elemanların karelerinin toplamını hesaplayan bir method oluşturun.*/

        public static void tekrarsizCiftElamlarınKareToplami(List<Integer>list){

            Integer toplam=list.stream().distinct().filter(FpUtilsTekrar::ciftListElemanYazdir).map(FpUtilsTekrar::karesinial).reduce(0,(t,u)->t+u);
            System.out.println(toplam);

            System.out.println();

            Integer topla=list.stream().distinct().filter(FpUtilsTekrar::ciftListElemanYazdir).map(FpUtilsTekrar::karesinial).reduce(Math::addExact).get();
            System.out.println(topla);
        }
    //6) Tekrarsız çift elemanların küpünün çarpımını hesaplayan bir method oluşturun.

    public static void tekrasizCiftElemanlarinKupununCarpimi(List<Integer>list){

           Integer carpim= list.stream().distinct().filter(FpUtilsTekrar::ciftListElemanYazdir).map(FpUtilsTekrar::tekListkupleriYazdir).reduce(Math::multiplyExact).get();
        System.out.println(carpim);
    }
    //7) List elemanları arasından en büyük değeri bulan bir method oluşturun.

    public static  void enBuyukDegeriBul(List<Integer>list){

           Integer enbuyuk= list.stream().distinct().sorted(Comparator.reverseOrder()).findFirst().get();
        System.out.println(enbuyuk);

        System.out.println();
        Integer enbuyuk2=list.stream().distinct().reduce(Math::max).get();
        System.out.println(enbuyuk2);

    }
    //9) List elemanları arasından 7'den büyük, çift, en küçük değeri bulan bir method oluşturun.
    public static  void get7denBuyukenkucuk(List<Integer>list){

           Integer sayi= list.stream().distinct().filter(t->t>7).filter(FpUtilsTekrar::ciftListElemanYazdir).reduce(Math::min).get();

        System.out.println(sayi);

    }
    //10) Ters sıralama ile tekrarsız ve 5'ten büyük elemanların yarı değerlerini(elamanın ikiye bölüm sonucunu) bulan bir method oluşturun.

    public static void tekrarsiz5tenBuyukElamanYarisi(List<Integer>list){

             list.stream().distinct().filter(t->t>5).map(FpUtilsTekrar::yarisi).sorted(Comparator.reverseOrder()).forEach(FpUtilsTekrar::boslukBırakarakYazdir);

    }
}
