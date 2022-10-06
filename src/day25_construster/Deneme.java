package day25_construster;

import java.util.ArrayList;
import java.util.List;

public class Deneme {
    String marka="opel astra ";
    String model="sedan kasa";
    int yil;
    int fiyat;


    public void arabaci(){

        System.out.println("bu arac benzınli motora sahiptir");
        List<Integer>Arr=new ArrayList<>();
        Arr.add(5);
        Arr.add(3);
        Arr.add(2);
        Arr.add(1);
        System.out.println(Arr);
        Arr.set(0,6);
        System.out.println(Arr);
        Arr.remove(3);
        System.out.println(Arr);
        Arr.remove(1);
        System.out.println(Arr);
        Arr.addAll(Arr);
        System.out.println(Arr);
    }

    public void motorcu(){

        System.out.println("bu arac şu kadar hiz yapar");


    }
}
