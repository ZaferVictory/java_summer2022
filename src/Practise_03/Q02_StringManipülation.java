package Practise_03;

public class Q02_StringManipülation {

    public static void main(String[] args) {
        // String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
        // String  str 1= "$13.99"
        // String str 2= "$10.55"
        // ipucu: Double parseDouble() methodunu kullanabilirsiniz.

  /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
1) \\d    ==> tum rakamlar
    \\D    ==> tum rakam disi character ler
2) \\w   ==> A->Z     a->z         0->9    _
    \\W  ==> A->Z    a->z         0->9    _ disindaki hersey
3) \\s   ==> space
    \\S   ==> space disindaki hersey  */

        String str1= "$13.99";   str1=str1.replaceAll("\\D","");
        String str2= "$10.55";   str2=str2.replaceAll("\\D","");

        System.out.println(str1);
        System.out.println(str2);

        double sayi1=Double.parseDouble(str1);// string olan str1 'i  doubleye dönüştürdük.
        double sayi2=Double.parseDouble(str2);

        double toplam=(sayi1+sayi2)/100;
        System.out.println("$"+toplam);



    }
}
