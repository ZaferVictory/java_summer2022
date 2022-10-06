package grup_02calisma;

import java.util.Arrays;

public class arrays04 {
    public static void main(String[] args) {
        // verilen bir arrayde istenmeyen harf içeren kelimeleri silip,
        // kalan elementleri yeni bir array yapın


        String [] arr={"ahmet","mine","selin","mehmet","sabahattin"};

        String istenmeyenHarf="a";

        String kalanElementler = " ";

        String yeniArr="";

        for (int i = 0; i <arr.length ; i++) {

            if (!arr.equals(istenmeyenHarf)){
                kalanElementler+=arr;
            }

        }
      System.out.println(arr.equals(kalanElementler));

    }
}
