package practise_01;

public class Q04_JavaVariable {

    public static void main(String[] args) {
        // Initializing Variable  //variable baslangic degeri verme
        int yas=33;
        double boy=1.72;
        System.out.println("yas:" +yas);
        System.out.println("boy:"+ boy);

        // To copy the variable's value

            int yasim=33;
            int enesYas=yasim;
        System.out.println("yasim = " + yasim);
        System.out.println("enesYas = " + enesYas);

        // you can declare multiple variables in the same line
            int yil=2022, ay=6, gun=20;
        System.out.println("yil = " + yil);

        // updating a variable

            yil=2032;
        System.out.println("update yil:"+ yil);

        //Bir degisken tanimlayin : x
        //Baska bir degiskeni initialize edin : y
        //x degiskenini initialize edin
        //y degiskenini yeni bir degerle guncelleyin

        int yas1=50;
        double boy1=1.73;
        System.out.println("yas1 : " + yas1);
        System.out.println("boy1 : " + boy1);

        // To copy the variable's value

        int yasim1=50;
        int enesinYasi=yasim1;
        System.out.println("enesinYasi = " + enesinYasi);
        System.out.println("yasim1 = " + yasim1);

        int yil1=2022;  ay=6;   gun=21;
        System.out.println("yil1 = " + yil1);
        System.out.println("ay = " + ay);
        System.out.println("gun = " + gun);
        
        yil1=2042;
        System.out.println("yil1 = " + yil1);
        


    }
}
