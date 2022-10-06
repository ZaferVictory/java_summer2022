package day25_construster;

public class denemee {

    public static void main(String[] args) {

        Deneme obj1=new Deneme();
        obj1.fiyat=150000;
        obj1.marka="opel astra";
        obj1.model="sedan kasa";
        obj1.yil=2020;

        System.out.println("araba1 fiyat bilgieri\nmarka  :"+obj1.marka+"\nmodel : "+obj1.model+"\nyil"+obj1.yil+"\nfiyat :"+obj1.fiyat);

        obj1.arabaci();
        obj1.motorcu();

    }


}
