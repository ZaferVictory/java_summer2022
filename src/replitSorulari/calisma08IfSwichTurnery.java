package replitSorulari;

import java.util.Scanner;

public class calisma08IfSwichTurnery {

    public static void main(String[] args) {
        /*
Kullanıcıdan bir isim yazmasını isteyin, adın uzunluğu 3 olmalıdır.
 Ardından, adın aynı karakterlere sahip
olup olmadığını kontrol edin.
Eger aynı karakterlere sahipse
"isim ayni karakterlere sahiptir." yazdirin.
Eger ayni kaakterlere sahip degilse
"Dizenin benzersiz karakterleri var" yazdirin.
Ternary kullanin.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen 3 karakterli bir isim yaziniz");
        String isim=scan.next();
       char karakter=0;
       int kontrol=0;
//ali
            if (isim.length()==3){
                 karakter=isim.charAt(0);
                 if ((karakter==isim.charAt(1))||(karakter==isim.charAt(2))){
                     kontrol++;
                 }
                karakter=isim.charAt(1);
                 if  ((karakter==isim.charAt(0))||(karakter==isim.charAt(2))) {
                    kontrol++;
                 }
                 if (kontrol>0){
                     System.out.println("Benzer harfler var");
                 }else {
                     System.out.println("Benzer harf YOK");
                 }
            }else {
                System.out.println("3li harfli girin");
            }
            kontrol=0;

        System.out.println(isim.length()!=3?"3 karakterli kelime girin":
                (isim.charAt(0)==isim.charAt(1)||isim.charAt(0)==isim.charAt(2)||isim.charAt(1)==isim.charAt(2))?
                "Benzer harfler vardir":"Benzer harfler Yoktur.");

          }
}
