package day12_stringMaipulation;

public class C01_replace {
    public static void main(String[] args) {
        ;

        String str= " Bu gun ha va cok guz el ";
        System.out.println(str.replace(" ",""));

        // hava kelimesini java yapalim

        System.out.println(str.replace("h","J").replace(" ",""));

        // guz el yerine harika yazalim
        System.out.println(str.replace("guz el","harika"));

        // Cumleyi replace kullanarak Bugun Java cok guzel yapalim

        str= str.replace(" Bu gun","Bugun")
                .replace("ha va","Java")
                .replace("guz el","guzel");

        System.out.println(str);
// aşağısı benim alıştırma için yaptığım yerler

        String str1="bu gün  novada ya    gi de lim";

        System.out.println(str1.replace(" ",""));
        System.out.println(str1.replace("gi de lim","gitmeyelim").replace("  ",""));
        System.out.println(str1.replace("bu gün", "dün"));
        System.out.println(str1.replace("novada ya","dombaklıya"));
        System.out.println(str1.replace("gi de lim","gidelim"));

        str1=str1.replace("bu gün", "dün")
                .replace("novada ya","dombaklıya")
                .replace("gi de lim","gidelim");

        System.out.println(str1);


    }
}
