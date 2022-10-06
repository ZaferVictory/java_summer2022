package day32_StringBuilder;

public class C05_indexOf_lastIndexOf {


    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("pay attention please");


        System.out.println(sb.indexOf("pay"));//0

        System.out.println(sb);//pay attention please  (aslı degısmedi)

        System.out.println(sb.indexOf("e"));//7

        System.out.println(sb.indexOf("e",10));// 10 uncu indexten sonra e yi arıyorum turkcesi bu 16 olarak bana döndürür

        System.out.println(sb.lastIndexOf("e"));//19

        System.out.println(sb.lastIndexOf("e",10));// 10. index e gidecek once ardından pay' e dogru geri dönecek e hangisindeyse onu getirecek
    }                                                           //7 olarak bize döndürür

}
