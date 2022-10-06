package day09_Ternary;

import java.util.Scanner;

public class C04_nestedternary {

    public static void main(String[] args) {

        // kullanıcıdan bir harf isteyin
        //küçük harf ise consola "küçük harf ",
        // büyük harfse consola "büyük harf"
        // yoksa "girdiğiniz karakter harf değil" yazdırın

      Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir harf girin");
        char harf= scan.next().charAt(0);
        System.out.println(harf>='a'? "küçük harf" : harf>='A'? "büyük harf": "girdiğiniz karakter değil");


   /*
        if (harf>='a' && harf<='z' ) {
            System.out.println("küçük harf");
        }else if (harf>='A'&& harf<='Z') {
            System.out.println("büyük harf");
        }else{
            System.out.println("girdiğiniz karakter harf değil");

    */
        // klasik yöntem ile yukarıdaki gibi yaparız.
        // nested ternary ile aşağıdaki gibi yaparız



    }
}
