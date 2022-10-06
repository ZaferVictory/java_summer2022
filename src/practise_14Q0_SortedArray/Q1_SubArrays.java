package practise_14Q0_SortedArray;

import java.util.Arrays;

public class Q1_SubArrays {
    /*
    bir array, integer bir "k"degeri ve esik değeri olarak da integer "thereshold" degeri verielecek.
    "k" boyutunda ve elemanlarının ortalaması eşik değerinden buyukve ya ona esıt olan kac adet alt dizilerin
    olduğunu ve bu alt dizileri ekrana yazdıran bir metod olusturunuz.
    not= yeni olusacak elemanlar, ilk diziden secilirken arka arkaya sıralı gelmeli

    ornek:

    Input: arr=[2,2,2,2,5,5,5,8], k=3, threshold(esik)=4

    output=3

     */


    public static void main(String[] args) {

        int [] arr={2,2,2,2,5,5,5,8};
        int k=3;
        int threshold=4;
        System.out.println(numOfSubArrays(arr, k, threshold));

    }

    public static int numOfSubArrays(int[]arr,int k,int threshold){

        int []arr2=new int[k];

        int sum=0;
        int count=0;

        for (int i = 0; i < arr.length; i++) {

            if (i==arr.length-(k-1))
                break;

            System.arraycopy(arr,i,arr2,0,k);

            for (int j = 0; j < k; j++) {
                sum+=arr2[j];

            }

            if (sum>=threshold*k){
                count++;
                System.out.println(Arrays.toString(arr2));


            }
            sum=0;
        }
        return count;

    }
}
