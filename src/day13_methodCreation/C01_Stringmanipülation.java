package day13_methodCreation;

public class C01_Stringmanipülation {

    public static void main(String[] args) {
        // String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
        // String  str 1= "$13.99"
        // String str 2= "$10.55"
        // ipucu: Double parseDouble() methodunu kullanabilirsiniz.

/*
        String str1= "$13,99";
        String str2= "$10,55";

         str1=str1.replaceAll("\\D","");// str 1 de dolar işaretinden ve virgülden kurtuldum
         double sayi1=Double.parseDouble(str1);//str1 String olduğu için toplama yapamıyorum önce onu double çevirdim.
        str2=str2.replaceAll("\\D","");
        double sayi2=Double.parseDouble(str2);


        System.out.println("$"+(sayi1+sayi2)/100);//24.54 virgüllü sayi cıkması için 100 e böldük

 *//*

        String str1= "$13,99";
        String str2= "$10,55";

        str1=str1.replaceAll("\\D","");
        double sayi=Double.parseDouble(str1);
        str2=str2.replaceAll("\\D","");
        double sayi1=Double.parseDouble(str2);

        System.out.println("$"+(sayi+sayi1)/100);
        */

        int y=2;
        int z=0;
        int a=z>=0?++y:z--;
        System.out.println(y+","+z+","+a);








    }
}
