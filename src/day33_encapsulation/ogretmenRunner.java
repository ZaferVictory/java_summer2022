package day33_encapsulation;

public class ogretmenRunner {

    public static void main(String[] args) {
        ogretmen ogr1=new ogretmen();

        ogr1.setIsim("Tulay");
        System.out.println(ogr1.getIsim());
        /*
        Bu yontemde data hiding degil
        daha anlasilir bir kod amaclanmis olur
         */
    }
}
