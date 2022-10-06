package replitSorulari;

import java.util.Scanner;

public class calisma05_Scanner {
/*
    Kullanıcıya kilosunu ve boyunu sorun ve kitle indeksini hesaplayan bir program yazın (BMI)
    IPUCU : BMI = Agirlik(kg) / Boy*Boy (m)
    BMI 18,5'in altındaysa zayıfsınız
    BMI 18,5 ile 25 arasında ise kilonuz idealdir
    BMI 25-30 arasındaysa şişmansınız
    BMI 30'dan büyük veya eşitse, obez
    Input:
    Output:
    Agirlik : 71
    Boy : 1,72
    BMI : 23.99945916711736
    Zayifsiniz.

 */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("boyunuzu giriniz");
        double boy=scan.nextDouble();
        System.out.println("kilonuzu giriniz");
        double kilo=scan.nextDouble();
        double BMI=kilo/(boy*boy);


        if (BMI<18.5){
            System.out.println(BMI+"\nzayıfsınız");
        } else if (BMI>=18.5 && BMI<25) {
            System.out.println(BMI+"\nkilonuz idealdir bosuna kendini harap etme");
        }else if (BMI>=25 && BMI<30){
            System.out.println(BMI+"\nşişmansınız");
        } else if (BMI>=30) {
            System.out.println(BMI+"\nobez");
        }


    }
}
