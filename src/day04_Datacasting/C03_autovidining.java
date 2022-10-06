package day04_Datacasting;

public class C03_autovidining {
    public static void main(String[] args) {
        // dar veri turundeki bir degeri, genis veri turundeki variable'a
        // otomatik olarak assign eder

        byte sayi1= 23;
        short sayi2=55;

        int sayi3= sayi1+sayi2; // 78 olarak çıkar


        double sayi4= sayi1*sayi2; // 1265.0 gene itiraz etmez çünkü kaba konulacaklardan birisi byte diğeri short
                                   // sorun yok ben daha büyüğüm alırım dedi
        System.out.println(sayi4);

        sayi4=(double)sayi2/sayi1 ;  // başta double olamdan 55.0 / 23 = 2 olarak görür virgülden sonrakini atar
                            // işte burada veri kaybı var ben bunu nasıl engellerim
                            //gördüğün gibi sayi2 nin başına (double) getirdik. sonuçta 2.361 li uzun bir rakam çıktı.
                            // veri kaybını engelledik

        System.out.println(sayi4);
    }

    }

