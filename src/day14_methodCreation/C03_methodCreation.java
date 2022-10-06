package day14_methodCreation;

public class C03_methodCreation {

    public static void main(String[] args) {
        //input olarak verilen isim ve soy ismi
        // ilk harfi büyük geriye kalan harfler ** olacak şekide
        //I**** K****** ŞEKLİNDE YAZDIRAN BİR METHOD OLUŞTURUN

        String isim="Enes";
        String soyisim="Bozkurt";

        ismiGizle(isim,soyisim);//E*** B***
        System.out.println(isim+" "+soyisim);//Enes Bozkurt

    }

    public static void ismiGizle(String isim, String soyisim) {

        isim=isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w","*");
        soyisim=soyisim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w","*");

        System.out.println(isim+" "+soyisim);

    }
}
