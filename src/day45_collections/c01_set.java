package day45_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class c01_set {

    public static void main(String[] args) {
        /*
        verilen bir array deki tekrar eden elementleri silip tekrarsız halini
        arraye atan bir code yaziniz
         */

        int [] arr={4,5,3,6,8,5,1,9,0,4,2,5,7,9,1,2,5,7,6};

        Set<Integer> tekrarsizSet=new HashSet<>();/* seti buarada sayıları tekrarsız hale getirmek ıcın kuallandım*/

        for (int each:arr) {
            tekrarsizSet.add(each);
        }

        System.out.println("set ile cıkan "+tekrarsizSet);//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

        int []tekrarsizArr=new int[tekrarsizSet.size()];/* tekrarsız hale getirdiğim sayıları yenı bir array e atamak ıcın yenı bır array olusturdum*/

        System.out.println(Arrays.toString(tekrarsizArr));//[0, 0, 0, 0, 0, 0, 0, 0, 0, 0] iki satır yukarıdakı rakamları buraya atamak ıstıyorum.

        int i=0;

        for (int each:tekrarsizSet) {
            tekrarsizArr[i]=each;
            i++;
        }
        arr=tekrarsizArr;/*tekrarsız halını arr a atadım*/

        System.out.println("bizim array in son halı= "+Arrays.toString(arr));
    }
}
