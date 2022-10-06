package grup_03calisma;

public class constructerİsimDegistirme {

    String isim;
    String  soyisim;
    String  no;
    int yas;



    public constructerİsimDegistirme(String isim, String soyisim, String no, int yas) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.no = no;
        this.yas = yas;
    }

    public void soyisimdegistir(String yeniSoyİsim) {

        this.soyisim=yeniSoyİsim;
    }

    @Override
        public String toString() {
            return "constructerİsimDegistirme{" +
                    "isim='" + isim + '\'' +
                    ", soyisim='" + soyisim + '\'' +
                    ", no='" + no + '\'' +
                    ", yas=" + yas +
                    '}';
        }

}
