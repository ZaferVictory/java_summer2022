package practise_15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lesson2_Array_ArrayList {

    public static void main(String[] args) {
        String[]pazarSepeti=new String[5];

        String[] pazarSepeti2={"elma","patates","kivi","karpuz","muz"};// eleman sayısı belli olan yerde array kullaınılır. belli degilse array kullanılmaz

        // uzunluk esnek olması gerekıyorsa collection yapıları kullanırız

        List<String>listpazarsepeti= new ArrayList<>();// estliğin sag tarafı concrete class olmak zorunda
        listpazarsepeti.add("elma");
        listpazarsepeti.add("patates");
        listpazarsepeti.remove("remove");
        List<String>listPazarSepeti2=Arrays.asList(pazarSepeti2);
        System.out.println(listPazarSepeti2.size());

        listpazarsepeti.add(0,"çikolata");

        listpazarsepeti.set(0,"pasta");
        System.out.println(listpazarsepeti);

        System.out.println(listPazarSepeti2.get(0));

        if(!listPazarSepeti2.contains("ketcap")) listPazarSepeti2.add("ketcap");




    }
}
