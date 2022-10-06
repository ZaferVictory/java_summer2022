package day29_PassByValueImmuTable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class deneme {
    /*
         bir list olusturalim
         iki ayri method'dan birinde
         sadece elemanlari degistirelim

         digerinde yeni bir list atayip,
         ayni sayida yeni eleman ekleyelim

         ve her iki method call'dan sonra kendi listemizi
         main method icerisinde kontrol edelim
        */
    public static void main(String[] args) {

        int[] arr={5,7,8,10};


       arraydegistir(arr);


        System.out.println(Arrays.toString(arr));



    }

    private static void arraydegistir(int[] arr) {

        Random rnd=new Random();
        arr[0]=rnd.nextInt(50);
        arr[1]=rnd.nextInt(50);
        System.out.println(Arrays.toString(arr));



        arr=new int[3];
        Random rnd1=new Random();

        arr[0]=rnd1.nextInt(100);
        arr[1]=rnd1.nextInt(100);
        arr[2]=rnd1.nextInt(100);

        System.out.println(Arrays.toString(arr));
    }
}
