package day32_StringBuilder;

public class C06_replace {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Calm down");

        sb.replace(5,10,"up");
        System.out.println(sb);

        sb.replace(4,5,"---");
        System.out.println(sb);// metodun sonunda string builder donduruyorsa string degısıyor demektir

        sb.replace(5,7,"down");
        System.out.println(sb);

        sb.replace(9,11,"");
        System.out.println(sb);

        sb.replace(4,9," down");
        System.out.println(sb);

    }
}
