package day11_stringManupulation;

public class C01_indexOf {

    public static void main(String[] args) {
        String str= "Java ogrenmek cok guzel";
        /* Verilen bir String'de herhangi bir String veya char'in
           ilk kullanildigi index'i bize dondurur
         */
        System.out.println(str.indexOf('g')); // 6
        System.out.println(str.indexOf("r")); // 7
        System.out.println(str.indexOf("j")); // -1
        System.out.println(str.indexOf("mek")); // 10
        // eger istedigimiz index'den sonrasini kontrol etmek istersek
        // o zaman ayni method'u iki parametreli olarak kullanabiliriz
        System.out.println(str.indexOf("g",(6+1))); // yazilan index'den baslar

        // yukaridaki str'da 2. ve 3. e'nin indexlerini bulun


        // 2.ci e'yi bulabilmek icin 1.e'nin index'ine ihtiyacim var
        int ilke=str.indexOf("e");
        int ikincie= str.indexOf("e",ilke+1);
        // eger 2. e varsa 3.e'nin olup olmadigini
        // ve varsa index'ini yazdiralim
        if (ikincie==-1){
            System.out.println("verilen str'da 2.e yok");
        }else{
            int ucuncue=str.indexOf("e",ikincie+1);
            if (ucuncue==-1){
                System.out.println("verilen str'da 3. e yok");
            } else {
                System.out.println("verilen str'daki 3.e'nin index'i : " + ucuncue);
            }
        }


        String str2="bu is olacak insallah";
        System.out.println(str2.indexOf("cak"));
        System.out.println(str2.indexOf("c",(9+1)));// -1 girer çünkü ikinci c yok cumlede
        System.out.println(str2.indexOf("a",(8+1)));
        System.out.println(str2.indexOf("o"));
        System.out.println(str2.indexOf("o",(6+1)));// -1 çıkar cümlede başka o yok

        int ilki=str2.indexOf("i");
        int ikincii=str2.indexOf("i",ilki+1);

        if (ilki==-1){
            System.out.println("cümlede i yok kardeş");
        }else{
            if (ikincii==-1){
                System.out.println("str da 2.i de yok kardeş");
            }else {
                System.out.println("verilen str da 2.nin index'i :"+ikincii);
            }
        }
    }

}