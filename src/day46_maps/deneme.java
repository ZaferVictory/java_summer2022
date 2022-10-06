package day46_maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class deneme {

    public static void main(String[] args) {

        Map<Integer,String>isciListesi=new HashMap<>();

        isciListesi.put(1,"zafer,kosktepe,yazilimci");
        isciListesi.put(2,"hakan,tepe,cayci,");
        isciListesi.put(3,"saffet,yeter,petrolcu");
        isciListesi.put(4,"bilal,hatay,lokantaci");

        System.out.println(isciListesi);
        System.out.println(isciListesi.keySet());

        System.out.println(isciListesi.values());

        Collection <String>tumValueYazdir=isciListesi.values();

        String[] eacharrr;

        int sira=1;

        for (String each: isciListesi.values()
             ) {

        eacharrr=each.split(", ");
            System.out.println(sira+"- "+eacharrr[0]+" "+eacharrr[1]);

            sira++;
        }
        System.out.println(isciListesi);
    }
}
