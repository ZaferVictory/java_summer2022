package practise_12OkulProje;

public class Kisi {



    private String adSoyad;
    private String kimlikNo;
    private int yas;// bunlar herkesin ortak ozelligi

    public Kisi(){

    }


    public Kisi(String adSoyad, String kimlikNo, int yas) {
        setAdSoyad(adSoyad);
        this.kimlikNo = kimlikNo;
        setYas(yas);
    }

    public String getAdSoyad() {

        return adSoyad;
    }

    public String getKimlikNo() {

        return kimlikNo;
    }

    public int getYas() {
        return yas;
    }

    public void setAdSoyad(String adSoyad) {

        this.adSoyad = adSoyad.toUpperCase();
    }

    public void setKimlikNo(String kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    public void setYas(int yas) {
        if (yas<0){
            this.yas=-yas;
        }else
            this.yas=yas;


        this.yas = yas;
    }

    @Override
    public String toString() {
        return "Kisi{" +
                "adSoyad='" + adSoyad + '\'' +
                ", kimlikNo='" + kimlikNo + '\'' +
                ", yas=" + yas +
                '}';
    }
}
