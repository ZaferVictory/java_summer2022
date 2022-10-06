package day32_StringBuilder;

public class C03_reverse {
    public static void main(String[] args) {
        // verilen bir ınputu tersine cevirip bize döndüren bir method olusturun

        String input="hey gidi foor loop gunleri";

        String tersInput=tersineCevir(input);
        System.out.println(tersInput);

    }

    public static String tersineCevir(String input) {


    StringBuilder sb=new StringBuilder(input);
    //sb.reverse();// direk bunu gönderirisen kabul etmez çünkü ben sana string gönderdim sen baana
        // string builder gönderiyorsun diyor

        return sb.reverse().toString();




    }
}
