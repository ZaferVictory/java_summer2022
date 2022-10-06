package day32_StringBuilder;

public class C04_subSequence {

    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Kayra");

        String degistirilen=sb.substring(0,3);// istediğimiz sonucu almak için ya variables a tayacagız yada ya da
       // sout içerisine yazdıracagız

        sb.substring(0,3);
        // bu method String oldugu icin Stribg Builder/in eski halini değiştiremez
        System.out.println(degistirilen);//Kayra

        sb.subSequence(0,3);
        System.out.println(sb);// kayra bu da degıstıremedi çünkü string degiştirilemez

        //sb nin içinde string olan metodlar varsa string iimmurtable old. için sonuç da immutable dır
    }
}
