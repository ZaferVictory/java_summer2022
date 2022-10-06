package day10_stringmanipulation;

public class C03_Equelsmetodu {

    public static void main(String[] args) {
        String str1 = "Ali Can";
        String str2 = "Ali CAN";
        String str3 = "Ali Can"+"";
        String str4 = "Ali Can";
        String str5 = new String("Ali Can");

        System.out.println(str1==str2);//false

        System.out.println(str1==str3);//true
        System.out.println(str1.equals(str3));//True
        System.out.println(str1==str5);//false
        System.out.println(str1.equals(str5));

        System.out.println(str1.equals(str4));

        System.out.println(str3.equals(str5));

        System.out.println(str3==str5);//false

        /*
        String'lerde ayni String olsa bile ==(double equsayn)  her zaman çalışmaz
        emin olmak isterseniz equals () kullanmalısınız

        equels () kuallandığımızda kesin sonuç alırız.
        yani stringlerde bunu kullanalım
         */
    }
}
