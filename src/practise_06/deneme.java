package practise_06;

import java.util.Arrays;

public class deneme {

    public static void main(String[] args) {
        /*
         * Girilen Multidimensional arraydeki cift sayilari toplayan bir method
         * yaziniz
         * INPUT : {{1,3,6},{2,8},{5,7,9,14}}
         *
         * OUTPUT : Arraydeki cift sayilarin toplami : 30
         */

       String[][] arr={{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}};

        double toplam=0;


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j].contains("$")){

                    toplam+=Double.parseDouble(arr[i][j].replace("\\$",""))*3.2;
                }else{
                    toplam+=Double.parseDouble(arr[i][j].replace("\\€",""))*4.2;
                }



            }
        }
        System.out.println(Arrays.deepToString(arr));
        System.out.println(toplam);

    }


}
