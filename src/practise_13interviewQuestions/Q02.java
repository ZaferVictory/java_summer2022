package practise_13interviewQuestions;

public class Q02 {
/*
		 Stringi ters cevirmek icin bir Java Programi yazin
		1.Yol: StringBuilder () kullanarak
		2.Yol: String Classini kullanarak
		3.Yol: Bir method olusturun, ardindan methodu main method dan cagirin. odev olsun Q01 deki gıbı recursive metod ile yapınız
    */

    public static void main(String[] args) {
        /* birinci yol*/
        String input="all is well";

        StringBuilder str=new StringBuilder();

        str.append(input);// string builder metodudur ekleme yapar
        System.out.println("str "+str);
        //System.out.println(str.reverse());// direk böylede yazılabilir
        String tersInput=str.reverse().toString();//reverse ile tersine cevrildi toString ile Stringe cevrildi
        System.out.println("tersInput = " + tersInput);

        System.out.println("2.yol for loop olan");

        for (int i = input.length()-1; i >= 0; i--) {//(int sonHarf=input.length()-1) for loop un ıcıne bunu koyabılırız
                                                      //açıklamasıda şu son harften o ıncı ındex e kadar eksilerek git

            System.out.print(input.charAt(i));

        }



    }

}
