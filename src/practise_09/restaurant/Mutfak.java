package practise_09.restaurant;

public class Mutfak {

    public String yemekler="adanakebap, urfa ciger,kusbasi,kusleme";
    public String arasicak="yayla corbasi, mercimek,duguncorba,corba";
    public String tatlilar="baklava,sutlac,gullac,kazandibi,kunefe,";
    public String icecekler="ayran,salgam,kola";

    public Mutfak(String adanakebap, String mercimek, String kunefe, String salgam) {
        this.yemekler=adanakebap;
        this.arasicak=mercimek;
        this.tatlilar=kunefe;
        this.icecekler=salgam;


    }

    public Mutfak() {


    }

    @Override
    public String toString() {
        return
                "\nyemekler='" + yemekler +
                "\n arasicak='" + arasicak +
                "\ntatlilar='" + tatlilar +
                "\nicecekler='" + icecekler +
                '}';
    }
}
