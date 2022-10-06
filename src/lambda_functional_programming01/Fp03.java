package lambda_functional_programming01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Fp03 {
    public static void main(String[] args) {
        List<String> liste = new ArrayList<>();
        liste.add("Ali");
        liste.add("Ali");
        liste.add("Mark");
        liste.add("Amanda");
        liste.add("Christopher");
        liste.add("Jackson");
        liste.add("Mariano");
        liste.add("Alberto");
        liste.add("Tucker");
        liste.add("Benjamin");
        System.out.println(liste);

        buyukHarfleYazdir01(liste);

        //buyukHarfleYazdir02(liste);
        System.out.println(liste);
        uzunlugaGöreYazdir(liste);
        System.out.println(liste);
        uzunlugaGöreTersYazdir(liste);
        System.out.println(liste);
        sonKaraktereGoreTekrarsizYazdir(liste);
        System.out.println(liste);
        uzunlukVeİlkHarfeGoreSiralaYazdir(liste);
        System.out.println(liste);
       /// bestenBuyukleriSil(liste);
       //System.out.println(liste);
       ////baslangiciAyadaSonuNolaniSil01(liste);
       //System.out.println(liste);
       //baslangiciAyadaSonuNolaniSil01(liste);
       // System.out.println(liste);
      //  uzunlugu8ile10arasiveOIleBiteniSil(liste);
        System.out.println("uzunlugu12 den az mı ="+uzunlugu12DenAzMı(liste));

        System.out.println("x ile baslamıyormu ="+ xıleBaslamıyorMu(liste));;

        System.out.println("r ile biten varmı ="+ rIleBıtenVarmı(liste));;

        }




    //1) Tüm elemanları büyük harf ile yazdıran bir method oluşturun.

    //1.yol
    public static void buyukHarfleYazdir01(List<String> list) {

        list.stream().map(String::toUpperCase).forEach(Utils::ayniSatirdaBosluklaYazdir);

    }
  //public static void buyukHarfleYazdir02(List<String>list){
  //    list.replaceAll(String::toUpperCase);
  //    System.out.println(list);
  //} //2.yol


    //2) Elemanları uzunluklarına göre sıralayıp yazdıran bir method oluşturun.

    public static void uzunlugaGöreYazdir(List<String>list){
        list.stream().sorted(Comparator.comparing(String::length)).forEach(Utils::ayniSatirdaBosluklaYazdir);// comperator comparing sıralama kosulu için kullanılır.

        System.out.println();
    }
    //3) Elemanları uzunluklarına göre ters sıralayıp yazdıran bir method oluşturun.
    public static void uzunlugaGöreTersYazdir(List<String>list) {
        list.
                stream().
                sorted(Comparator.comparing(String::length).reversed()).
                forEach(Utils::ayniSatirdaBosluklaYazdir);


    }
//4) Elemanları son karakterlerine göre sıralayıp tekrarsız yazdıran bir method oluşturun.

    public static void sonKaraktereGoreTekrarsizYazdir(List<String>list){

        list.stream().distinct().sorted(Comparator.comparing(Utils::sonkarakteriAl)).forEach(Utils::ayniSatirdaBosluklaYazdir);
    }
    //5) Elemanları önce uzunluklarına göre ve sonra ilk karakterine göre sıralayıp yazdıran bir method oluşturun.

    public static void uzunlukVeİlkHarfeGoreSiralaYazdir(List<String>list){

        list.stream().sorted(Comparator.comparing(String::length).thenComparing(Utils::ilkKarakteriAl)).forEach(Utils::ayniSatirdaBosluklaYazdir);

    }

   // 6) Uzunluğu 5'ten büyük olan elemanları silen bir method oluşturun.
 //public static void bestenBuyukleriSil(List<String> list){

  //  list.removeIf(t->t.length()>5);           ==> list, mutable olduğu için elemanları işlem sonrası kalıcı değiştiğinden comment-out yapıyorum.
  //  System.out.println(list);


    //7) ‘A’, ‘a’ ile başlayan yada ‘N’, ‘n’ ile biten elemanları silen bir method oluşturun.

    //1.yol
   // public static void baslangiciAyadaSonuNolaniSil01(List<String> list){
//
   //     list.removeIf(t->t.charAt(0)=='A'//ilkkarakteri buyuk a ise sil
   //             ||t.charAt(0)=='a'//ilk karakter kucuk a ise sil
   //             ||t.charAt(t.length()-1)=='N'//son karakter buyuk N ise sil
   //             ||t.charAt(t.length()-1)=='n');// son karakter kucuk n ise sil
   //     System.out.println(list);
//
   // }
//
    //2.yol

  //public static void baslangiciAyadaSonuNolaniSil01(List<String> list){

  //    list.removeIf(t->t.startsWith("A")||t.startsWith("a")||t.endsWith("N")||t.endsWith("n"));
  //    System.out.println(list);

  //}

    //8) Uzunluğu 8 ile 10 arası olan yada 'o' ile biten elemanları silen bir method oluşturun.
   public static void uzunlugu8ile10arasiveOIleBiteniSil(List<String > list){

       // list.removeIf(t->(t.length()>7 && t.length()<11 ) || t.endsWith("o"));
      // System.out.println(list);
   }
    //9) Tüm elemanların uzunluklarının 12'den az olup olmadığını kontrol eden bir method oluşturun.

    public static boolean uzunlugu12DenAzMı (List<String>list){


        return list.stream().allMatch(t->t.length()<12);


    }

        //10) Hiçbir elemanın 'X' ile başlamadığını kontrol eden bir method oluşturun.

    public static boolean xıleBaslamıyorMu(List<String>list){


        return list.stream().noneMatch(t->t.startsWith("X"));

    }
    //11) Herhangi bir elemanın 'r' ile bitip bitmediğini kontrol eden bir method oluşturun.

        public static boolean rIleBıtenVarmı(List<String>list){


        return list.stream().anyMatch(t->t.endsWith("r"));
        }

}






