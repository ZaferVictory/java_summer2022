package day35_inharıtancedeConstructerKullanimi;

public class GToyota {
    GToyota(){

        System.out.println("GToyota parametresiz cons");
    }

    GToyota(String isim){
        // super(isim);  extends olmadigi icin super constructor call'u java kabul etmez
        System.out.println("GToyota parametreli cons");
    }




}
