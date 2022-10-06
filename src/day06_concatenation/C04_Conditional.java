package day06_concatenation;

public class C04_Conditional {
    public static void main(String[] args) {
        //ŞART OPERATÖRLERİ

            //> büyüktür, >= büyük veya eşittir
            //< küçüktür, <=küçük ve ya eşittir


        System.out.println(3*5>7);

        //baoleon variables veya sonucun başına ! koyarsak tersini alır.

        System.out.println(!(3*5>7));// eğer parantez olmadan yazarsak ! işaretini yanlış bir ifade olur.istersen dene
                                    // burada sorduğu soruda "15 , 7'den büyük değildir değil mi" diye soruyor.
                                    // burada sonuç tabiki yanlış olarak çıkar.

        // && AND (ve) işareti
        // && işareti ile birleştirilen tüm ifadeler doğru ise sonuç true olur.
        // diğer tüm durumklarda false'a döner.( && operatörü mükemmeliyetçidir.)
        // iki şartında geçerli olmasını  istiyorsan bu && işaret kullanılır.


            boolean sayi=(5+2==7)&&(4+3!=5);// sonuç değeri true olur.tecümesi şu" 5+2, 7'ye eşittir değil mi
                                                                                 //ve 4+3, 5'e eşit değildir değil mi

           System.out.println((5*2!=15)&&(5>7));// sonuç değeri false olur. tercümesi şu "


          // II     OR (veya) işareti


    }
}
