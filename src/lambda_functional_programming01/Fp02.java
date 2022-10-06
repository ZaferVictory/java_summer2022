package lambda_functional_programming01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp02 {
   /*
1)  t-> "Logic" , (t, u)-> "Logic" ==> Bu yapıya "Lambda Expession"

2) Functional Programming kapsamında "Lambda Expession" kullanılabilir ama önerilmez.
   "Lambda Expession" yerine "Method Reference" tercih edilir.
3) "Method Reference" kullanımı "Class Name :: Method Name"

   Aynı zamanda kendi class'larınızı da kullanabilirsiniz.
   Örneğin bir Animal class'ınız var ve bu class "eat()" methoduna sahip ==> "Animal :: eat"
 */

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
        tekElemanlarinKareleriniYazdir(liste);
        System.out.println();
        tekrarsiztTekElemanlarinKupunuYazdir(liste);
        System.out.println();
        TekrarsızCiftElemanlarınKarelerininToplamı01(liste);
        System.out.println();
        TekrarsızCiftElemanlarınKarelerininToplamı02(liste);
        System.out.println();
        TekrarsızCiftElemanlarınKarelerininToplamı03(liste);
        System.out.println();
        TekrarsızCiftElemanlarınKüpününCarpimi(liste);
        System.out.println();
        minElemangetir(liste);
        System.out.println();
        getMaxEleman(liste);
        System.out.println();
        yedidenBuyukCiftMin(liste);
        System.out.println();
        tersSiralamaylaTekrarsizElemanlarinYarsi(liste);

    }
    //1) Ardışık list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(functional ve Structured)

    public static void listElemanlariniYazdirFunctional(List<Integer> list) {


        list.stream().forEach(Utils::ayniSatirdaBosluklaYazdir);
    }

    //2) çift sayi olan list elemanlarını aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(functional)
    public static void ciftElemanlariniYazdirFunctional(List<Integer> list) {

        list.stream().filter(Utils::ciftElemanlariSec).forEach(Utils::ayniSatirdaBosluklaYazdir);


    }

    //3) Ardışık tek list elemanlarının karelerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)
    public static void tekElemanlarinKareleriniYazdir(List<Integer> list) {
        list.stream().filter(Utils::tekElemanlariSec).map(Utils::karesiniAl).forEach(Utils::ayniSatirdaBosluklaYazdir);
    }
//4) Ardışık tek list elemanlarının küplerini tekrarsız olarak aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.

    public static void tekrarsiztTekElemanlarinKupunuYazdir(List<Integer> list) {

        list.stream().distinct().filter(Utils::tekElemanlariSec).map(Utils::kupunuAl).forEach(Utils::ayniSatirdaBosluklaYazdir);
    }

    /*5) Tekrarsız çift elemanların karelerinin toplamını hesaplayan bir method oluşturun.*/
//1.yol
    public static void TekrarsızCiftElemanlarınKarelerininToplamı01(List<Integer> list) {

        Integer toplam = list.stream().
                distinct().// tekrar edenleri kaldırdım bu metodla
                        filter(Utils::ciftElemanlariSec).
                map(Utils::karesiniAl).
                reduce(0, Math::addExact);// sıfır yazmayıp sonuna get metoduda ekleyebiliriz
        System.out.println(toplam);

    }

    //2.yol
    public static void TekrarsızCiftElemanlarınKarelerininToplamı02(List<Integer> list) {

        Integer toplam = list.stream().
                distinct().
                filter(Utils::ciftElemanlariSec).
                map(Utils::karesiniAl).
                reduce(Math::addExact).get();//   burada get ıle yaptım
        System.out.println(toplam);
    }

    //3.yol
    public static void TekrarsızCiftElemanlarınKarelerininToplamı03(List<Integer> list) {

        Integer toplam = list.stream().
                distinct().
                filter(Utils::ciftElemanlariSec).
                map(Utils::karesiniAl).
                reduce(0, Integer::sum);//
        System.out.println(toplam);
    }

    //6) Tekrarsız çift elemanların küpünün çarpımını hesaplayan bir method oluşturun.
    public static void TekrarsızCiftElemanlarınKüpününCarpimi(List<Integer> list) {

        Integer carpim = list.stream().
                distinct().
                filter(Utils::ciftElemanlariSec).
                map(Utils::kupunuAl).
                reduce(1, Math::multiplyExact);// carpim metodu
        System.out.println(carpim);
    }

    //7) List elemanları arasından en büyük değeri bulan bir method oluşturun.
    public static void getMaxEleman(List<Integer> list) {

        Integer max = list.stream().distinct().reduce(Math::max).get();
        System.out.println(max);

    }
    //Ödev
    //8)List elemanları arasından en küçük değeri bulan bir method oluşturun.(Method Reference)

    public static void minElemangetir(List<Integer>list){

        Integer enkucuk=list.stream().distinct().reduce(Math::min).get();
        System.out.println(enkucuk);

    }



//9) List elemanları arasından 7'den büyük, çift, en küçük değeri bulan bir method oluşturun.

    public static void yedidenBuyukCiftMin(List<Integer>list){

       Integer min= list.stream().distinct().filter(t->t>7).filter(Utils::ciftElemanlariSec).reduce(Math::min).get();

        System.out.println(min);

    }
    //10) Ters sıralama ile tekrarsız ve 5'ten büyük elemanların yarı değerlerini(elamanın ikiye bölüm sonucunu) bulan bir method oluşturun.

    public static void tersSiralamaylaTekrarsizElemanlarinYarsi(List<Integer>list){

       List<Double> sonuc= list.
                stream().// gerekli metodları kullanmamızı saglar
                distinct().// tekrarlı olanları almaz
                filter(t->t>5).// kosula gore filtreleme yapar
                map(Utils::yarisniAl).// her bir elemanın degerini degistirmeye yarar
                sorted(Comparator.reverseOrder()).// sıralama yapar
                collect(Collectors.toList());// elemanları collection a cevirir
        System.out.println(sonuc);

    }

}




