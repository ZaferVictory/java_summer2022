package grup_02calisma;

public class arrays {
    public static void main(String[] args) {
        /*
        asagıdakı mda in tüm elemanlarının carpımını
        ekrana yazdıran bir method yazınız.{{1,2,3}{4,5,6}}
         */

        int [][] Arr={{1,2,3},{4,5,6}};

        int carpim=1;

        for (int i = 0; i <Arr.length ; i++) {
            for (int j = 0; j < Arr[i].length; j++) {

                carpim*=Arr[i][j];



            }

        }
        System.out.println(carpim);
    }
}
