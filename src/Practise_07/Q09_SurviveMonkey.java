package Practise_07;

public class Q09_SurviveMonkey {

     /*
		There is a lonely monkey in the island
		He needs to eat 4 bananas every day
		there are just 165 bananas in that island
		Create following variables and find how many days
		monkey can survive.
		Use do while loop, increment and decrement and if statements
		int numberOfBananas =165, survivalDays = 1;
		boolean monkeyAlive = true;

		Adada yalnız bir maymun var Her gün 4 muz yemesi gerekiyor
		 o adada sadece 165 muz var
		 Aşağıdaki değişkenleri oluşturun ve maymunun kaç gün hayatta kalabileceğini bulun.
		  Do while döngüsü, artırma ve eksiltme ve if deyimleri
		  int numberOfBananas =165, survivalDays = 1; boolean maymunAlive = true;
		*/

    public static void main(String[] args) {
        int numberOfBananas =165, survivalDays = 1;
        boolean monkeyAlive = true;
        System.out.println("maymunlar gunde 4 muz yer");
        do {
            System.out.println("maymunlar gunde 4 muz yer");
            numberOfBananas-=4;// toplam muzdan 4 azalir.
            survivalDays++;// yasadigi gun sayisini bir artir.
            if (numberOfBananas<=4) {// 4 ten az muz kalursa
                monkeyAlive = false;// maymun hayatta değil.
                System.out.println("bugün " + survivalDays + " gun muz kalmadı, maymun sizlere ömür");
            }else
                System.out.println("bugün "+ survivalDays+ " gun maymun halen hayatta..");
        }while (monkeyAlive);
        System.out.println("toplam hayatta kaldiği gun sayisi :"+(survivalDays-1));
    }
}
