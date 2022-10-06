package day11_stringManupulation;

public class C02_lastIndexOf {

    public static void main(String[] args) {

        String cumle = "Java cok kolay, Java cok guzel";
        String kelime= "Java";
        /* verilen kelime icin asagidaki sartlardan uygun olani yazan bir program yaziniz
           - verilen kelime cumlede kullanilmamis
           - verilen kelime cumlede sadece 1 kere kullanilmis
           - verilen kelime cumlede birden fazla kullanilmis
         */
        int kelimeIlkIndex = cumle.indexOf(kelime);
        int kelimeSonIndex = cumle.lastIndexOf(kelime);
        if (kelimeIlkIndex==-1){
            System.out.println("verilen kelime cumlede kullanilmamis");
        } else if (kelimeIlkIndex==kelimeSonIndex){
            System.out.println("verilen kelime cumlede sadece 1 kere kullanilmis");
        } else{
            System.out.println("verilen kelime cumlede birden fazla kullanilmis");
        }
        String cumle1="Javayı ogrenecegim sonunda,Java,Java";
        String kelime1="Java";


        int kelimeİlkIndex1=cumle1.indexOf(kelime1);
        int kelimeSonIndex2=cumle1.lastIndexOf(kelime1);

        if (kelimeİlkIndex1==-1){
            System.out.println("yazdıgın kelime burda yok");
        }else if(kelimeİlkIndex1==kelimeSonIndex2){
            System.out.println("verilen kelime cumlede sadece 1 kere kullanılmıs");
        } else {
            System.out.println("verilen kelime cümlede birden fazla kullanılmıs");
        }


    }
}
