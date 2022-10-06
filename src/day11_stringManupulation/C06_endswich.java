package day11_stringManupulation;

public class C06_endswich {

    public static void main(String[] args) {
        /*
        1) Kullanicidan email adresini girmesini isteyin,
                mail @gmail.com icermiyorsa  “lutfen gmail adresi giriniz”,
        @gmail.com ile bitiyorsa  “Email adresiniz kaydedildi “ ,
        @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin.

         */

        String email="zafer@gmail.com";
        if (!email.contains("gmail.com")){
            System.out.println("lütfen gmail adresi yazınız");
        }else if (email.endsWith("@gmail.com")){
            System.out.println("e mail adresiniz kaydedildi");
        }else{
            System.out.println("yazımı kontrol edin");
        }
    }
}
