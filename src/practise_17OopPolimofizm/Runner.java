package practise_17OopPolimofizm;

public class Runner {

    public static void main(String[] args) {
        civciv civciv1=new civciv();
        ordek ordek1=new ordek();

        hayvanSesCikar(civciv1);
        hayvanSesCikar(ordek1);
    }

    public static void hayvanSesCikar(Animal animal) {
        animal.sesiCikar();
    }

}
