package grup_03calisma;

import java.util.Scanner;

public class boolen {
    public static void main(String[] args) {
        /*
        Bir boolean oluşturunuz.
        Konsola "Bir Banka Hesabınız Var mı ? " yazınız.
                Varsa True , yoksa False olarak  konsoldan cevap veriniz.
                Boolean'ı yazdırınız.
                */



        Scanner scan=new Scanner(System.in);
        System.out.println("bir banka hesabınız var mı");
        String hesap=scan.nextLine();


        boolean dogrulama=true;
        if (hesap.equals("var")){
            System.out.println(dogrulama);
        }else if (hesap.equals("yok")){
            System.out.println(!dogrulama);
        }

















    }
}
