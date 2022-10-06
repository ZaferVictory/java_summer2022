package day44_Collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C04_LinkList {

    public static void main(String[] args) {
        LinkedList ll1= new LinkedList<>();

        List<String> ll2=new LinkedList<>();

        Queue<String> ll3=new LinkedList<>();

        Deque<String> ll4=new LinkedList<>();

        ll2.add("berk");
        ll2.add("done");
        ll2.add("enes");
        ll2.add("ayse");

        System.out.println(ll2);

        System.out.println(ll2.remove(3));// 3.index te ki ayse yi sılıyordu ve bana aysayı donduruyordu
        System.out.println(ll2.remove("kemal"));// false remove nin ıkı casıdı vardı hatırla

        System.out.println(ll2.isEmpty());// false

        ll2.set(1,"serap");

        System.out.println(ll2);// done gıttı yerıne serap geldı

        ll1.add("berk");
        ll1.add("ismaıl");

        System.out.println(ll1);

        ll2.retainAll(ll1);/* ll2 deki tum elementleri ll1 ıle karsılastırır ll1 de olmayanları sıler*/

        System.out.println(ll2);//berk

        System.out.println(ll2.hashCode());//3020251

        ll2.add("fatih");
        System.out.println(ll2.hashCode());//190831485


    }
}
