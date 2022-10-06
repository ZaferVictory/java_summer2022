package day11_stringManupulation;

public class C05_endswich {

    public static void main(String[] args) {
        String str="Ah be Java";
        System.out.println(str.endsWith("ava"));// true
        System.out.println(str.endsWith("be java"));// true
        System.out.println(str.endsWith("Ah be Java"));// true
        System.out.println(str.endsWith(""));//true
    }
}
