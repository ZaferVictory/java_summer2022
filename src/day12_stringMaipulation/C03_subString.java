package day12_stringMaipulation;

public class C03_subString {

    public static void main(String[] args) {
        String isim="Zafer";
        String soyisim="Köşktepe";
        String kartno="1234 6547 7589 7859";

        System.out.println(isim.substring(3)); // er
        System.out.println(soyisim.substring(soyisim.length()-3)); // epe

        System.out.println(isim.substring(2,4)); // fe



        // isim ve soyismin ilk harfi buyuk harf, geriye kalan *
        // kredi kartinin ilk 4 rakami gorunsun geriye kalan *

        String isimIlkHarf= isim.substring(0,1).toUpperCase();
        String isimGeriyeKalanlar= isim.substring(1).replaceAll("\\w","*");

        String soyisimIlkHarf=soyisim.substring(0,1).toUpperCase();
        String soyisimGeriyeKalanlar= soyisim.substring(1).replaceAll("\\w","*");

        String kkIlk4=kartno.substring(0,4);
        String kkGeriyeKalanlar= "**** **** ****";

        System.out.println(isimIlkHarf+isimGeriyeKalanlar+" "+
                soyisimIlkHarf+soyisimGeriyeKalanlar+ "\n" +
                kkIlk4+kkGeriyeKalanlar );

        // aşağısı benim yaptığım

        String isim1="Esra";
        String soyisim1="köşktepe";
        String Kredik="1256 4789 5879 4587";


      String isimİlkharf=isim1.substring(0,1).toUpperCase();
      String isimgeri=isim1.substring(1).replaceAll("\\w","*");
      String soyİsimİlkİki=soyisim1.substring(0,1).toUpperCase();
      String soyİsimGeri=soyisim1.substring(1).replaceAll("\\w","*");

      String kreilk=Kredik.substring(0,4);
      String Kreson=Kredik.substring(4).replaceAll("\\d","*");

        System.out.println(isimİlkharf+isimgeri+" "+
                soyİsimİlkİki+soyİsimGeri+"\n"+
                kreilk+Kreson);






    }
}
