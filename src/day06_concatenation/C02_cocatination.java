package day06_concatenation;

public class C02_cocatination {

    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Güzeldir";
        int sayi1 = 5;
        int sayi2 = 4;

        System.out.println(str1 + " " + str2 + " " + sayi1 + sayi2);// java güzeldir 54
        System.out.println(str1 + " " + 5 + " " + str2);// java 5 güzeldir
        System.out.println(str1 + " " + (sayi1 + sayi2 + 85));//java 94
        System.out.println(str1 + " " + (sayi1 + sayi2 + 10));//java 19
        System.out.println((sayi1 + sayi2 + 45) + " " + str2);// 54 güzeldir


        // yukarıdaki benim yaptığım ilkel yöntem
        // aşağıdaki ise hocanın yaptığı


        System.out.println(str1 + " " + str2 + " " + sayi1 + sayi2); // Java Guzeldir 54
        System.out.println(str1 + " " + str2 + " " + (sayi1 + sayi2)); // Java Guzeldir 9
        System.out.println(sayi1 + sayi2 + " " + str1); // 9 Java
        System.out.println("" + sayi1 + sayi2 + " " + str2); // 54 Guzeldir// baştaki çifr tırnak "" string'tir. dolayısıyla strong oluyor.
        // eğer bir string ile sayi1' i birleştirirseniz yanındaki o sayıda artık sring olur.

        System.out.println(str1.concat(str2)); // JavaGuzeldir
        System.out.println(str1.concat(" ").concat(str2)); // Java Guzeldir// 23.satırda str1'den sonra + koyarak java güzeldir yaptık.
                                                                // aynı işlemi burada str1'in yanına . koyduk hazır metodları getirdik.oradanda concat'
                                                                //seçtik bu şekilde de istediğimiz şeyi yaptık
    }
}
