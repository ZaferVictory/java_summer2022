package day44_Collections;

import java.util.Deque;
import java.util.LinkedList;

public class C05_LinkedList_DequeDataTuru {

    public static void main(String[] args) {
        Deque<String> ll4=new LinkedList<>();
        ll4.add("cavidan");
        ll4.add("mesut");
        ll4.add("selim");
        ll4.add("tevfik");
        ll4.add("selim");

        System.out.println(ll4);

        ll4.removeLastOccurrence("selim");// sondakı selimi sıldı
        System.out.println(ll4);//[cavidan, mesut, selim, tevfik]

        System.out.println(ll4.pop());/* linklis' in basındakı elentı silip bize dondurur.*/
        ll4.removeFirst();
        ll4.removeLast();
        /* deqeue  iki taraflı queue demektir, dolayısıuyla her metodun first ve last'i*/
    }
}
