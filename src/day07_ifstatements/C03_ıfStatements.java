package day07_ifstatements;

public class C03_ıfStatements {

    public static void main(String[] args) {
       /*
        Bir if statement'da { kullanilmazsa
        Java ilk satiri sart ile baglar, sonraki satirlar bagimsiz olur

       eger birden fazla satır aynı ıf şartına baplanmış ise mutlaka { kullanmalıyız

         */

        int sayi = -23;

        if (sayi > 0)

            System.out.println("sayi pozitif");
            System.out.println("pozitif kalacaktir");



        if (sayi % 2 == 0)
            System.out.println("sayi cift");
            System.out.println("sayi çift kalacaktır");




        if (sayi % 5 == 0)
            System.out.println("Sayi 5'in tam kati");


    }
}
