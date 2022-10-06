package lambda_functional_programming01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp01 {
    public static void main(String[] args) {

        /*
        1)lambda (functional programming)  java 8 ile kullanılmaya baslanmistir
        2)functional programming' de ne yapılacak (what to do) uzerine yogunlasilir.
        structured programming "nasıl yapilacak" uzerine yogunlasılır.
        3) functional programming arrays ve collection ıle kullanılır
        4) entryset() metodu ile map, set' e donusturulerek  functional programming de kullanılabilir.
         */

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

        ListElemanlariniYazdirStructured(liste);
        System.out.println();// alt alta yazdırsın diye böyle yazdım
        ListElemanlariniYazdirFunctional(liste);
        System.out.println();
        ciftElemanlariYazdirStructured(liste);
        System.out.println();
        ciftElemanlariYazdirFunctional(liste);
        System.out.println();
        tekElemanlarinKareleriniYazdir(liste);
        System.out.println();
        tekrarsiztTekElemanlarinKupunuYazdir(liste);
        System.out.println();
        tekrarsiztCiftElemanlarinKareToplamiYazdir(liste);
        System.out.println();
        tekrarsizCiftElemanlarinKupununCarpimi(liste);
        System.out.println();
        getMaxEleman01(liste);
        System.out.println();
        getMaxEleman02(liste);
        System.out.println();
        getYedidenBuyukMin(liste);
        System.out.println();
        getYedidenBuyukCiftMin2(liste);
        System.out.println();
        getYedidenBuyukCiftMin3(liste);
        System.out.println();
        getTersSiralamaylaTekrarsizElemanlarinYarisi(liste);


    }
    //1) Ardışık list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Structured)

    public static void ListElemanlariniYazdirStructured(List<Integer> list) {
        for (Integer w : list) {

            System.out.print(w + " ");

        }

    }

    public static void ListElemanlariniYazdirFunctional(List<Integer> list) {

        list.stream().forEach(t -> System.out.print(t + " "));// t dadece sembol w olur u olur degısır o.t bir variable
        //normal bildiğimiz for each olarak calsıyor.
        // stream metodu collection dan elementleri akışa dahil etmek için
        // ve metodlara ulaşmak için kullanılır

    }

    //2) çift sayi olan list elemanlarını aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Structured)


    public static void ciftElemanlariYazdirStructured(List<Integer>list){

        for (Integer w:list) {
            if (w%2==0){
                System.out.print(w+" ");
            }

        }

    }
    //çift sayi olan list elemanlarını aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Structured)
    public static void ciftElemanlariYazdirFunctional(List<Integer>list){

        list.stream().filter(t->t%2==0).forEach(t-> System.out.print(t+" "));

    }

    //3) Ardışık(arka arkaya gelen) tek list elemanlarinin karelerini aynı satırda aralarında
    // boşluk bırakarak yazdıran bir method oluşturun.(Functional)

    public static void tekElemanlarinKareleriniYazdir(List<Integer>list){

        list.stream().filter(t->t%2!=0).map(t->t*t).forEach(t-> System.out.print(t+" "));
                // elemanlarin degerleri degısecekse   map() metodu kullanılır. yani kendisi ile carptım.
        // elemanların degeri degıstı. yani map 9' u 81 'e donusturmek ıle gorevlidir.


    }
    //4) Ardışık tek list elementlerinin küplerini tekrarsız olarak
    // aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.
    public static void tekrarsiztTekElemanlarinKupunuYazdir(List<Integer>list){

        list.stream().distinct().filter(t->t%2!=0).map(t->t*t*t).forEach(t-> System.out.print(t+" "));// distinct tekrarsız elamamları yazdırır.
                                                                                                        // yani tekrar eden sayiları siler
    }

    //5) Tekrarsız çift elementlerin karelerinin toplamını hesaplayan bir method oluşturun.
    public static void tekrarsiztCiftElemanlarinKareToplamiYazdir(List<Integer>list){

       Integer toplam= list.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(0,(t,u)->t+u);

        System.out.println(toplam);

    }
//6) Tekrarsız çift elemanların küpünün çarpımını hesaplayan bir method oluşturun.

    public static void tekrarsizCiftElemanlarinKupununCarpimi(List<Integer>list){
       Integer carpim= list.stream().distinct().filter(t->t%2==0).map(t->t*t*t).reduce(1,(t,u)->t*u);

        System.out.println(carpim);


    }

    //7) List elemanları arasından en büyük değeri bulan bir method oluşturun.
    //1.yol
    public static void getMaxEleman01(List<Integer>list){
        Integer max=list.stream().distinct().reduce(Integer.MIN_VALUE,(t,u)-> t>u ? t : u );

        System.out.println(max);

    }
    //2.yol
    public static void getMaxEleman02(List<Integer>list){
        Integer max=list.stream().distinct().sorted().reduce(Integer.MIN_VALUE,(t,u)->u);

        System.out.println(max);

    }
    //Ödev
    //    //8)List elemanları arasından en küçük değeri bulan bir method oluşturun.(2 Yol ile)

    /*9) List elemanları arasından 7'den büyük, çift, en küçük değeri bulan bir method oluşturun.*/

   // 1.yol
    public  static void getYedidenBuyukMin(List<Integer>list){

        Integer min = list.
                stream().
                distinct().
                filter(t->t%2==0).
                filter(t->t>7).
                reduce(Integer.MAX_VALUE,(t,u)->t<u ? t:u);
        System.out.println(min);
    }
    //2.yol
    public  static void getYedidenBuyukCiftMin2(List<Integer>list){

        Integer min=list.
                stream().
                filter(t->t%2==0).
                filter(t->t>7).
                sorted(Comparator.reverseOrder()).
                reduce(Integer.MAX_VALUE,(t,u)->u);
        System.out.println(min);
    }
    //3.yol
    public  static void getYedidenBuyukCiftMin3(List<Integer>list){

        Integer min=list.
                stream().
                filter(t->t%2==0).
                filter(t->t>7).
                sorted().
                findFirst().
                get();
        System.out.println(min);
    }

    //10) Ters sıralama ile tekrarsız ve 5'ten büyük elemanların yarı değerlerini(elamanın ikiye bölüm sonucunu) bulan bir method oluşturun.

    public  static void getTersSiralamaylaTekrarsizElemanlarinYarisi(List<Integer>list){
         List<Double> sonuc=list.stream().
                 distinct().
                 filter(t-> t>5).
                 map(t->t/2.0).
                 sorted(Comparator.reverseOrder()).
                 collect(Collectors.toList());

        System.out.println(sonuc);
    }

}
