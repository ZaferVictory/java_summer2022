package recap_02özetTekrar;

import java.util.Scanner;

public class Q14_StringManipulatıon {
    public static void main(String[] args) {
        //Kullanicidan ismini ve soyisimi girmesini isteyin, sonrasinda konsola tam ismini buyuk harfler ile yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen isminiz ve soy isnminiz giriniz = ");
        String firstName=scan.nextLine(),
                lastName=scan.nextLine();//multiple declaretion, başına string demedim böyle devam ettim.
        
        String fulname=firstName.concat(" "+lastName).toUpperCase();
        System.out.println("fulname = " + fulname);


    }





}
