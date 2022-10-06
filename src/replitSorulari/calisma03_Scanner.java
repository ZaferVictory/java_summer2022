package replitSorulari;

public class calisma03_Scanner {

    /*
    1. İki String ifadeyi parametre olarak alan bir metot tanımlayınız.
2. Metodumuz bir cümle ve bu cümleden çıkarmak istediğimiz kelimeyi  parametre olarak alsın.
            3. Sonuç olarak metodumuz cümle içinden istediğimiz kelimeyi çıkararak bize döndürsün.
    Örneğin;
("bugün hava çok güzel", "çok") ➞ "Bugün hava güzel"
        ("merhaba dünya", "dünya") ➞ "merhaba"


     */
    public static void main(String[] args) {


        String cumle="bugün hava cok güzel";
        String cumle1="merhaba dünya";
        String cıkarılacak="cok";
        String cıkarılacakcumle1="dunya";

        cıkarılacak(cumle,cumle1,cıkarılacak,cıkarılacakcumle1);


    }

    private static void cıkarılacak(String cumle, String cumle1, String cıkarılacak, String cıkarılacakcumle1) {


        cıkarılacak=cumle.replace(cıkarılacak,"");
        cıkarılacakcumle1=cumle1.replace(cıkarılacakcumle1,"");

        System.out.println(cıkarılacak);
        System.out.println(cıkarılacakcumle1);
    }
}
