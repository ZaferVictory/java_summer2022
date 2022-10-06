package day11_stringManupulation;

public class C07_startswich {

    public static void main(String[] args) {
        String input="Java gun geçtikçe guzelleşiyor";


        System.out.println(input.startsWith("J")); // true

        System.out.println(input.startsWith("")); // true

        System.out.println(input.startsWith("gun",5)); //true
    }
}
