package day17_nestedForLoop;

public class C03_NestedForLoop {

    public static void main(String[] args) {

         /*
          verilen yukseklik ve boy degerine gore
          *'lardan olusan bir dikdortgen olusturalim
          yukseklik :3  boy:4// sonradan rakamları değiştirdik dikdörtgen oldu.
          * * * *
          * * * *
          * * * *
         */

        int yuksek=4;
        int boy=8;

        for (int i = 1; i <=yuksek; i++) {
            for (int j = 1; j <=boy ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
                

    }
}
