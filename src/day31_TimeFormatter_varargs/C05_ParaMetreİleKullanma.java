package day31_TimeFormatter_varargs;

public class C05_ParaMetreİleKullanma {
    public static void main(String[] args) {


        EnUzunKelimeyiYazdir("can",4,"Ali","Ayse","İsmail","Ahmet");
        /*
Varargs teroik olarak sonsuz sayıda element alabilir.
Bir methodda parametre olarak varargs varsa
varargsın sınırlarını bilebilmesi için
parametrelerin sonuncusu olmalıdır.
Öncesinde farklı parametreler olabilir ama
varargstan sonra parametre olamaz.

Bu kuraldan ötürü bir methodda sadece 1 tane varargs olabilir.
 */
    }

    public static void EnUzunKelimeyiYazdir(String kel,int kelimeSayisi,String... kelime) {

        String enUzunKelime=kelime[0];


        for (String each:kelime
        ) {
            if (each.length()>enUzunKelime.length()){
                enUzunKelime=each;
            }
        }
        System.out.println(enUzunKelime);


    }
}
