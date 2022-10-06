package grup_02calisma;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;

public class arrays1 {

    public static void main(String[] args) {

        // verilen bir arrayde tekrar eden elementleri yazdırın

            int [] arr={5,2,1,2,3,4,5,5,6,3};

            int sayi=arr[0];

          int  tekraredenelement=0;

        for (int i = 0; i <arr.length-1 ; i++) {

            if (arr[i]==arr[i+1]){

                System.out.println(arr[i]);
            }
        }



    }
}
