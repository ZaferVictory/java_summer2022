package day39_exception;

import java.util.ArrayList;
import java.util.List;

public class deneme {

    public static void main(String[] args) {

        List<String> list=new ArrayList<>(3);
        list.add("ahmet");
        list.add("mehmet");
        list.set(1,"ziya");
        System.out.println(list);


         try {
             list.set(2,"aslan");
             list.set(2,"aaaa");
         }catch (IndexOutOfBoundsException e){

             System.out.println(list);
         }
    }
}
