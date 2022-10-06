package grup_02calisma;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class set {

    public static void main(String[] args) {
        /*
        3) set() methodu kullanarak, E'yi D yapiniz.
ArrayList'i ekrana yazdiriniz, list goyle olmali; A, L, C, D, F, B.
         */
        List<String> harfler=new ArrayList<>();
        harfler.add("A");
        harfler.add("B");
        harfler.add("C");
        harfler.add("D");
        harfler.add("E");
        harfler.add("F");

        harfler.set(1,"G");
        System.out.println(harfler);
        harfler.add("j");
        System.out.println(harfler);
        Collections.sort(harfler);
        System.out.println(harfler);
        harfler.addAll(harfler);
        System.out.println(harfler);
        harfler.remove(5);
        System.out.println(harfler);
        harfler.remove(4);
        System.out.println(harfler);
    }
}
