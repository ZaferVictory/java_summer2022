package day10_stringmanipulation;

import java.util.Locale;

public class C02_ToLowercase_touppercase {

    public static void main(String[] args) {

        String str="Benı psıkopata baglamayın";

        System.out.println(str.toUpperCase());//
        System.out.println(str.toUpperCase(Locale.forLanguageTag("Tr")));
        /*
        eğer buyuk kuuk harf donusumunde  local bir dili esas almak isterseniz
        bu method kullanılabilir
         */
    }
}
