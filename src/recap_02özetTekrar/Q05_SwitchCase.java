package recap_02özetTekrar;

import java.util.Scanner;

public class Q05_SwitchCase {

    public static void main(String[] args) {

         /*
		 * Kullanicidan ilk 3 buyuk harfden biri secildiginde cumle yazdiran kod yaziniz (switch case kullanin)
		 * ornek
		 *  Kullanici  : A , B , C harflerinden birini secsin
			 A'yi secmis ise, ==> Java is easy
			 B'yi secmis ise, ==> Java is fun
			 C'yi secmis ise, ==> I need to study :)
		 */

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen A,B,C harflerinden birini giriniz");
        String harf=scan.next().toUpperCase();

        switch (harf){
            case "A":
                System.out.println("Java is easy");
                break;
            case"B":
                System.out.println("Java is fun");
                break;
            case"C":
                System.out.println("I need to study");
                break;
            default:
                System.out.println("bu harfi sevmedim");
                break;

        }
    }
}
