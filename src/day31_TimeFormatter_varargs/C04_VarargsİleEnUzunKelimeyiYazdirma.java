package day31_TimeFormatter_varargs;

public class C04_VarargsİleEnUzunKelimeyiYazdirma {

    public static void main(String[] args) {


        EnUzunKelimeyiYazdir("Ali","Ayse","İsmail","Ahmet");
    }

    public static void EnUzunKelimeyiYazdir(String... kelime) {

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
