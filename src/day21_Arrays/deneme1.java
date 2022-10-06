package day21_Arrays;

public class deneme1 {
    public static void main(String[] args) {

            /*
         "Integer sayılardan oluşan bir diziyi parametre olarak alan
         ve dizide 7 rakamı  var ise  "Boom!" ifadesini;
         aksi takdirde  "dizide 7 rakamı yok" ifadesini döndüren bir method oluşturun".
                Örnek çıktı:
                    [1, 2, 3, 4, 5, 6, 7])➞ "Boom!"
                [8, 6, 33, 100] ➞ "dizide 7 rakamı yok"
                [2, 55, 60, 97, 86] ➞ "Boom!"

         */

        int[] arr={1, 2, 3, 4, 5, 6, 7};

        yediVarMi(arr);
    }

    private static void yediVarMi(int[] arr) {

        int basamak=0;
        int kontrol=0;

        for (int each:arr){
             while (each!=0){
                 basamak=each%10;
                 each/=10;
                 if (basamak==7){
                     kontrol++;
                 }
             }
             if (kontrol==0){
                 System.out.println("dizide yedi rakamı yok");
             }else {
                 System.out.println("BOOM!");
             }

        }
    }
}
