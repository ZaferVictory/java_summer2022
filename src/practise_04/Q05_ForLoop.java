package practise_04;

public class Q05_ForLoop {
    public static void main(String[] args) {
        // 0-255 e kadar olan harflerin , sayı ve harf değerini ekrana yazdırınız.
        int bas=0,bit=255;
        for (int i =bas; i <=bit ; i++) {
            char c=(char) i;
            System.out.println(i+ "==>"+c );

        }

        System.out.println("while ile");

        int i=0;
        while (i<=255){
            char sembol= (char) i;
            System.out.println(i+" - "+sembol);
            i++;
        }

        System.out.println("do while ie");

        int a=0;

        do {
            char karakter= (char) a;
            System.out.println(a+" "+ karakter);
            a++;
        }while (a<255);
    }
}
