package replitSorulari;

public class calisma_08IfSwichTurnery {

    // isim1 çift sayıda karakter içeriyorsa,

    // ikinci kelimeyi ilk adın ortasına yerleştirin

    // ilk kelime tek sayida karakter iceriyorsa

    // “isim1, isim2 ye eklenemiyor” yazdırın

    // Örneğin:
    // isim1= mehmet
    // isim1= mehmet
    // Yazdır ==> mehahmetmet

    // isim1= memet
    // isim2= ahmet
    // Yazdır ==> isim1, isim2 ye eklenemiyor

    public static void main(String[] args) {
        String isim1="mehmet";
        String  isim2="ahmet";

       if (isim1.length()%2==0){

           System.out.println(isim1.substring(0,isim1.length()/2).concat(isim2).concat(isim1.substring(isim1.length()/2)));

       }else {
           System.out.println("isim1, isim2 ye eklenemiyor");
       }

    }

}
