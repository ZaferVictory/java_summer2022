package practise_04;

public class Q01_MethodCreation {

    public static void main(String[] args) {
         /*
        Problem tanımı :
        Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method yazınız.
        Test Data:
        input: "aabbcccccddddaaa"
        output: abcd
     */
        birkereyazdir("aabbcccccddddaaa");




    }

    public static void birkereyazdir(String str) {
        String output = "";// string default değeri "" oldugu icin isleme etki etmesin diye böyle atama yaptık.

        for (int i = 0; i < str.length(); i++) {

            if (!output.contains(str.substring(i, i + 1))) {// tekrarsiz karakter döndüreceğimiz için sonucumuz str dan alacağımız herhangi bir karakteri içermesin
                output += str.substring(i, i + 1); // aynı ikinci harfi içermiyorsa buraya ekle dedim.
            }

        }
        System.out.println(output);
    }
}
