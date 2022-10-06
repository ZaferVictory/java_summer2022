package day17_nestedForLoop;

public class C01_Forlop {

    public static void main(String[] args) {

        // verilen String'deki kullanilan harfleri
        // tekrarsiz olarak yazdirip
        // kelimede kullanilan farkli harf sayisini veren bir method yaziniz

        String input="Java her zaman güzel";

        tekrarsızyap(input);

    }

    public static void tekrarsızyap(String input) {
        String benzersizinput="";

        String islenecekKelime=input.replaceAll("\\W","");// javaherzamangüzel
        System.out.print(islenecekKelime.substring(0,1));//J
        benzersizinput+=islenecekKelime.substring(0,1);//J

        for (int i = 1; i <islenecekKelime.length() ; i++) {
            if (!benzersizinput.contains(islenecekKelime.substring(i,i+1))){
                System.out.print(", "+islenecekKelime.substring(i,i+1));
                benzersizinput+=islenecekKelime.substring(i,i+1);
            }

        }

        System.out.println("");
        System.out.println("inpt: "+ input);
        System.out.println("benzersiz input: "+benzersizinput.length());
    }
}
