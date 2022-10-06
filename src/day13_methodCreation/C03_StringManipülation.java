package day13_methodCreation;

public class C03_StringManipülation {

    public static void main(String[] args) {
        /*
String methodlarını kullanarak " Java ogrenmek123 Cok guzel@ "
Stringini " Java ogrenmek cok guzel." şekline getirin

 */
        /*

            String str=" Java ogrenmek123 Cok guzel@ ";

            str=str.trim();//Java ogrenmek123 Cok guzel@

            str=str.replaceAll("\\d","");//Java ogrenmek Cok guzel@
            str=str.replace("@",".");//Java ogrenmek Cok guzel.
            str=str.replace("Cok","cok");

            System.out.println(str);

         */


        String str=" Java ogrenmek123 Cok guzel@ ";
        str=str.trim();
        str=str.replaceAll("\\d","");
        str=str.replace("@",".");
        str=str.replace("Cok","cok");


        System.out.println(str);

    }
}
