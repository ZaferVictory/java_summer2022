package practise_14Q0_SortedArray;

import java.util.Arrays;

public class Solution {

    /*
    ınteger olarak artan degerler seklınde verilen dizinin elemanlarının karesını yıne artan degerlerde ekrana yazdıran
    metod olusturunuz
    ornek:

    Input nums =[-4,-1, 0, 3, 10]
    Output:[0,1,9, 16, 100]
     */

    public static void main(String[] args) {
       int[]  num ={-4,-1, 0, 3, 10};
      //  System.out.println(Arrays.toString(sortedArray(num)));

       int[] num2=Arrays.stream(num).map(x->x*x).sorted().toArray();// bu lambda experison ile yaptım diğer yolda 7-8 satırda yaparken
        System.out.println(Arrays.toString(num2));                  // burada 1 satırda yaptım.

    }

   /* public static int[] sortedArray(int[] num){
        for (int i = 0; i <num.length ; i++) {

            num[i]=num[i]*num[i];


        }
        Arrays.sort(num);

        return num;


    }*/

}
