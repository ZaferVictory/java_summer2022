package day13_methodCreation;

public class C04_methodCreation {





    public static void main(String[] args) {

                // ınput olarak verilen iki ınteger ı toplayıp sonucunu yazdıran bir method oluşturun

                int input1=10;
                int  input2=20;
              // method dort adımda olusturulur
        //1. adım medhod call
        // 2.adım argument eklenmesi gerekiyorsa ekleyelim
        // eğer methodun return ytpe' ı void den farklı olacaksa
        // bir variables oluşturup, method call'ı assıgn edelim


        topla(input1,input2);

    }

    public static void topla(int input1, int input2) {

        //3.adım method deklarasyonıunda değiştirilmesi gereken
        // bölümleri değişir (access modifier, return type vb..)
        //4.eger return type void dısında bir seyse
        //  return keyword u ve donecek değeri hesaplamalıyız

        System.out.println("girilen iki sayının sayının toplami :"+(input1+input2));


    }


}
