package day12_stringMaipulation;

public class C02_replaceAll {

    public static void main(String[] args) {
        String str= "1Bu2gu3n Ja*va- cok g3uz/el";

        // str'i Bugun Java cok guzel haline getirin
        // replaceAll() deki all'un amaci ayni ozellikteki tum karakterleri kapsamasidir
        // butun sayilari sil
        // butun ozel karakterleri sil

        // tum ozel karakterleri silelim dedigimizde space'ler de siliniyor
        // space'leri korumak icin en basta onlarin yerine cumlede bulunmayacak
        // bir string koyalim
        // "qazwsx"
        str=str.replace(" ","qazwsx");
        System.out.println(str);
        str=str.replaceAll("\\W","");
        System.out.println(str); // 1Bu2gu3nJavacokg3uzel

        str=str.replaceAll("\\d","");

        // istenmeyen ozel karakter ve sayilardan kurtulduk
        // simdi space'leri geri getirelim

        str=str.replace("qazwsx"," ");

        System.out.println(str);
        System.out.println(str.replaceAll("\\w","*"));// tum harfleri yok etmek istiyorum böyle yaptım


        // burdan aşağısını çalışma olarak ben yaptım

        String str1="1bug*un8 ak*hisar? co&k gu*zel";

        str1=str1.replaceAll(" ","gvr");

        str1=str1.replaceAll("\\W","");
        str1=str1.replaceAll("\\d","");

        str1=str1.replaceAll("gvr"," ");

        System.out.println(str1);

        // 2.örneğim

        String str2="1ja9va**yi ogre**nmeli\\yim";

        str2=str2.replace(" ","bosluk");

        System.out.println(str2);//"1ja9va**yıboslukogre**nboslukmeli\yim" böyle yazdırır.

        str2=str2.replaceAll("\\W","");

        System.out.println(str2);//1ja9vayboslukogrenboslukmeliyim

        str2=str2.replaceAll("\\d","");
        System.out.println(str2);
        str2=str2.replaceAll("bosluk"," ");
        System.out.println(str2);


    }
}
