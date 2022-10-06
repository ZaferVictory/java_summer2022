package day44_Collections;

import java.util.LinkedList;
import java.util.Queue;

public class C04_LinkList_QueueDataTuru {

    public static void main(String[] args) {
        Queue<String> ll3=new LinkedList<>();

        ll3.add("adem");
        ll3.add("zeynep");
        ll3.add("hpolat");
        ll3.add("kadir");
/*
        // Queue kuyryuk demektır , sıra onemlidir.
        // gelen sonra gelir, giden bastan gider


 */

        System.out.println(ll3);//[adem, zeynep, hpolat, kadir]

        System.out.println(ll3.remove());//adem



        System.out.println(ll3);//[zeynep, hpolat, kadir]

        System.out.println(ll3.remove("hpolat"));//true

        System.out.println(ll3);//[zeynep, kadir]

        System.out.println(ll3.element());// Q nun en basındakı adamı bana getiriyor ama sılmıyor

        System.out.println(ll3.peek());

        Queue<String> ll4=new LinkedList<>();

       // System.out.println(ll4.element());// throws exception

        System.out.println(ll4.peek());//null
        /*
        peek ve element silmeden ilk elementi bize dondurur.
        aralarındakı fark boslıste olursa peek null doner
        element exceptıon fırlatır.

         */

                ll3.offer("ahmet");
                ll3.offer("sefa");

        System.out.println(ll3);//[zeynep, kadir, ahmet, sefa] add metodu gıbı

        System.out.println(ll3.poll());

    }

}
