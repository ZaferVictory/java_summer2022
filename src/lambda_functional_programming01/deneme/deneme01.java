package lambda_functional_programming01.deneme;

import java.util.ArrayList;
import java.util.List;

public class deneme01 {

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
        listElemanlariniYazdir(liste);
        System.out.println();
        ciftElemanlariYazdirStructured(liste);
        System.out.println();
        ciftElemanlariYazdirFunctional(liste);
        System.out.println();
        tekElemanlarinKareleriniYazdir(liste);
        System.out.println();
        tekElemanlarinKareleriniYazdirfunctional(liste);
        System.out.println();
        tekrarsiztTekElemanlarinKupunuYazdir(liste);

    }
    //1) Ardışık list elementlerini aynı satırda  aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)

    public static void listElemanlariniYazdir(List<Integer>list){

        list.stream().forEach(t-> System.out.print(t+" "));


    }
    //2) çift sayi olan list elemanlarını aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Structured)

    public static void ciftElemanlariYazdirStructured(List<Integer>list){

        for (Integer w:list) {

            if (w%2==0){
                System.out.print(w+" ");
            }

        }

    }
    //2) çift sayi olan list elemanlarını aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)

    public static void ciftElemanlariYazdirFunctional(List<Integer>list){

        list.stream().filter(t->t%2==0).forEach(t-> System.out.print(t+" "));

    }
    //3) Ardışık(arka arkaya gelen) tek list elemanlarinin karelerini aynı satırda aralarında
    // boşluk bırakarak yazdıran bir method oluşturun.(Functional)

    public static void tekElemanlarinKareleriniYazdir(List<Integer>list){

        for (Integer w:list) {

            if (w%2!=0){
                System.out.print(w*w+" ");

            }
        }

    }

    //3) Ardışık(arka arkaya gelen) tek list elemanlarinin karelerini aynı satırda aralarında
    // boşluk bırakarak yazdıran bir method oluşturun.(Functional)

    public static void tekElemanlarinKareleriniYazdirfunctional(List<Integer>list){


        list.stream().filter(t->t%2!=0).map(t->t*t).forEach(t-> System.out.print(t+" "));


    }
    //4) Ardışık tek list elementlerinin küplerini tekrarsız olarak
    // aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.

    public static void tekrarsiztTekElemanlarinKupunuYazdir(List<Integer>list){

        list.stream().distinct().filter(t->t%2!=0).map(t->t*t*t).forEach(t-> System.out.print(t+" "));

    }

    //5) Tekrarsız çift elementlerin karelerinin toplamını hesaplayan bir method oluşturun.

}
