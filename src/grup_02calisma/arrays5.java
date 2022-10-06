package grup_02calisma;

public class arrays5 {

// int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,14,15,16,17,18};
    // verilen array de once cift olan sayilari, sonra da tek olan sayilari for each loop kullanarak yazdiriniz..

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,14,15,16,17,18};
        int ciftSayilar=0;
        int tekSayilar=0;

        for (int each:arr){
            if (each%2==0){
                ciftSayilar++;
            }else{
                tekSayilar++;

            }


        }
        System.out.println("cift sayilar "+ciftSayilar);
        System.out.println("tek sayilar "+ tekSayilar);
    }
}
