package practise_12OkulProje;

public class ogrenci extends Kisi {

    private String ogrenciNo;
    private String sinif;

    public ogrenci(){

    }
    public ogrenci(String adSoyad, String kimlikNo, int yas, String ogrenciNo, String sinif) {
        super(adSoyad, kimlikNo, yas);
        this.ogrenciNo = ogrenciNo;
        this.sinif = sinif;
    }

    public String getOgrenciNo() {
        return ogrenciNo;
    }

    public String getSinif() {
        return sinif;
    }

    public void setOgrenciNo(String ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }

    @Override
    public String toString() {
        return "ogrenci{" +
                "ogrenciNo='" + ogrenciNo + '\'' +
                ", sinif='" + sinif + '\'' +
                '}';
    }
}
