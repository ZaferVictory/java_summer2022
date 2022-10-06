package day32_StringBuilder;

public class C02_Append {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder("Java Daha Ne Yapsin");
        sb.append(" ?");
        System.out.println(sb);

        // append istediğimiz Stringi en sona ekler.

        sb.append("Java",2,4);
        System.out.println(sb);


        sb.insert(4,"her seyi dusunmus");// 4. index ten sonrasına bu kelimeyi yapıstır
        System.out.println(sb);//Javaher seyi dusunmus Daha Ne Yapsin ?

        //araya ekleme yapmak için append degıl insert kullanmalıyız

        sb.insert(21," valla valla ",5,11);
        System.out.println(sb);//Javaher seyi dusunmus  vallaDaha Ne Yapsin ?




    }
}
