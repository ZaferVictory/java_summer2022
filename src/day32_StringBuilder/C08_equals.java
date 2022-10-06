package day32_StringBuilder;

public class C08_equals {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("java");
        StringBuilder sb2=new StringBuilder("java");
        String str="java";

        System.out.println(sb.equals(sb2));//false(bu string degil )

        System.out.println(sb.equals(sb));//true

        //StringBuilder da equals  metodu ancak ayni obje true döner
        // string deki gibi düsünmemek lazım

        System.out.println(sb.equals(str));//false

        System.out.println(sb.compareTo(sb2));//0

        StringBuilder sb3=new StringBuilder("jave");

        System.out.println(sb.compareTo(sb3));//-4 neden -4 geldi açıklaması asagıda



        /*
 compareTo() iki stringBuilder'i bastan baslayarak
 harf harf karsilastirir
 ilk harfler ayni ise, ikincilere gecer
 ikinciler ayni ise 3.lere gecer ve
 ilk farkli olan harfe kadar gider
 farkli olan iki harfin ascii kodlari arasindaki farki verir

 eger hic farkli harf yoksa
 sonuc olarak 0 dondurur
 */




    }
}
