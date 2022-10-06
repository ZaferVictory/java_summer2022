package day12_stringMaipulation;

public class C04_subString {

    public static void main(String[] args) {

        String str="Java cok yasa";
        System.out.println(str.substring(3,4));//a

        System.out.println(str.substring(5,7));// co

        System.out.println(str.substring(6,6));// "" hiçlik çıkar

       // System.out.println(str.substring(6,2));// exception bu şekilde hata verir
        System.out.println(str.substring(3,6));




    }
}
