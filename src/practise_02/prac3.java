package practise_02;

import java.util.Scanner;

public class prac3 {

    public static void main(String[] args) {
        /*
        galonu litreye ceviren bir java programi yaziniz
                 1 gallon = 3.785 litre
                litreyi galona ceviren bir java programi yaziniz
                1 litre = 1/3.785 gallon

                // Sıcaklığı Fahrenhayt'tan Santigrat derecesine çeviren bir Java programı yazın.
                // formül
                // c = (f-32)*5/9
                */
        int galon=1000;
        double litre=galon*3.785;
        String SONUC1= galon + "galon değeri" + litre+"litreye esittir";// BUNU DİREK SOUT ' UN İÇİNE DE YAZABİLİRDİK
        System.out.println(SONUC1);

        int L=1000;
        double G= L/3.785;
        System.out.println(L + " litre değeri "+ G +"  galona eşittir");

        // Sıcaklığı Fahrenhayt'tan Santigrat derecesine çeviren bir Java programı yazın.
        // formül
        // c = (f-32)*5/9

        Scanner scan=new Scanner(System.in);
        System.out.println("fahrenayt değerini giriniz:");
        double fh=scan.nextDouble();// int' da  olur.

        System.out.println("girdiğiniz fahrenayt değeri: " + (fh-32)*5/9);
    }
}
