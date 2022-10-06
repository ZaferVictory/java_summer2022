package day26_constructer;

public class manav {

    String ürün="ürün belirtilmedi";
    String cinsi= "cinsi belirtilmedi";
    String memleketi="ürün nereden geld girilmedi";
    int fiyatı;
    int nakliyeucreti;


    public manav() {

    }

    public manav(String ürün, String cinsi, String memleketi, int fiyatı, int nakliyeucreti) {
        this.ürün = ürün;
        this.cinsi = cinsi;
        this.memleketi = memleketi;
        this.fiyatı = fiyatı;
        this.nakliyeucreti = nakliyeucreti;
    }

    @Override
    public String toString() {
        return
                "\nürün=" + ürün +
                "\ncinsi=" + cinsi +
                "\nmemleketi=" + memleketi +
                "\nfiyatı=" + fiyatı +
                "\nnakliyeucreti=" + nakliyeucreti;
    }
}
