package day10_stringmanipulation;

public class C06_indexOf {
    public static void main(String[] args) {

        String str="java ogrenmek cok guzel";
        System.out.println(str.indexOf("0"));//5
        System.out.println(str.indexOf('g'));//6
        System.out.println(str.indexOf("t"));// bana  integer döndürüyor
                                            // int yok diye bir değer bulunmuyor
                                            // 0 dersek J nin index idir.
                                            //-  bir değer dönerse biz aranan stringin str de olmadığını anlarız
                                            //java  -1 e döndürmeyi tercih etmiştir.

        String str5="kdfjhlaksdjf;ksdhflkjhplfldskf0dfjhldf";
         //str' de p harfi var mıdır'

        if (str5.indexOf("=")==-1){
            System.out.println("str5 te istenen karakter kullamılmamış");
        }

        String str1="abuzuttin uzun kavak altinda yatar uyumazoglu";
        System.out.println(str1.indexOf('g'));
        System.out.println(str1.indexOf("i"));
        System.out.println(str1.indexOf("t"));
        System.out.println(str1.indexOf("z"));
        System.out.println(str1.length()-3);
        System.out.println(str.length()-10);

        if (str1.indexOf("t")==6){
        } System.out.println("str 1 de istenen karakter kullanılmış");
    }

}
