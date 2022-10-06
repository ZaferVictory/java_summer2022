package day32_StringBuilder;

public class C01_OlusturmaYöntemleri {
    public static void main(String[] args) {


        StringBuilder sb1=new StringBuilder();// bos olusutrursan kapasitesitesi 16 karakterinde bırakırım  diyor
        StringBuilder sb2=new StringBuilder("Java Candir");
        StringBuilder sb3=new StringBuilder(10);// kapasiteyi baştan belirtirsen o uzunlukta olusturur

        System.out.println(sb1.length());//0
        System.out.println(sb1.capacity());//16

        System.out.println(sb2.length());//11
        System.out.println(sb2.capacity());//27

        System.out.println(sb3.length());//0
        System.out.println(sb3.capacity());//10

        sb1.append("java");
        System.out.println(sb1.length());//4
        System.out.println(sb1.capacity());//16

        sb1.append(" Candir");
        System.out.println(sb1.length());//11
        System.out.println(sb1.capacity());//16

        sb1.append(", bilen bilir.");
        System.out.println(sb1.length());//25
        System.out.println(sb1.capacity());//34  16*2+2

        StringBuilder sb4=new StringBuilder();
        sb4.append("java candir");

        System.out.println(sb4.length());//11
        System.out.println(sb4.capacity());//16
    }
}
