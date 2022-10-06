package practise_04;

import java.util.Scanner;

public class Q02_MethodCreation {

    public static void main(String[] args) {
         /*
     cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz
      */
        Scanner scan=new Scanner(System.in);
        System.out.println("metre ve km ye donusturmek ıstediginiz cm degerini giriniz");

        double santimetrevalue=scan.nextDouble();

        convertSM(santimetrevalue);
    }

    public static void convertSM(double santimetrevalue) {

        double metre=santimetrevalue/100;
        double kmetre=santimetrevalue/10000;
        System.out.println("girdiginiz cm degeri: "+santimetrevalue+" dir. metre olarak "+metre+" metredir. kilpmetre olarak da "+ kmetre+" kilometredir");
    }
}
