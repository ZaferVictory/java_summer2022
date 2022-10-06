package day05_matematikselislemler;

public class C02_pre_post_increment {
    public static void main(String[] args) {
        int sayi=10;
        int sayi1=20;
        int sayi2=40;
                                                   //11
        System.out.println("pre-increment : " +  ++sayi); //11 burada iki işlem var 1) artırma
                                                          //                        2) yazdırma, dikkat ettiğin gibi önce
                                                          //                          arttırdık sonra yazdırıdık


        System.out.println("post-increment : " +  sayi++); //11 burada iki işlem var 2) artırma
                                                            //                       1) yazdırma
                                                            // post incrementte ise önce yazdırdık sonra arttırdık
                                                            // öne yazdırdığımızda sayı 11 olarak yazdırıyor.
                                                            // sonra 12 olarak arttırıyor

        System.out.println("post-increment'den sonra : " + sayi); // 12

        System.out.println("pre-increment : " +  ++sayi1);//21
        System.out.println("post-increment : " +  sayi1++);//21
        System.out.println("post-increment'den sonra : " + sayi1);//22

        System.out.println("pre-increment:"+ ++sayi2);//41
        System.out.println("post-increment:"+ sayi2++);//41
        System.out.println("post-increment'den sonra:"+sayi2);//42


        sayi++; // 13

        ++sayi; // 14

       int  m=2;

        System.out.println(m++ + --m + --m + ++m + ++m );

        int sayi5=15;

        sayi5-=10;
        System.out.println(sayi5);

    }
}
