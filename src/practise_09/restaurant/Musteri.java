package practise_09.restaurant;

public class Musteri {


    public static void main(String[] args) {
        Mutfak menu= new Mutfak();

        System.out.println(menu.toString());

        Mutfak siparisim=new Mutfak("adanakebap","mercimek","kunefe","salgam");

        System.out.println("siparisim "+siparisim);
    }

}
