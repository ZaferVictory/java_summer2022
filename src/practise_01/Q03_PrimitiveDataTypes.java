package practise_01;

public class Q03_PrimitiveDataTypes {
    public static void main(String[] args) {
        /*
         * Primitive data type
                byte: only takes whole numbers
	 	        short: only takes whole numbers
	 	        int(used more often): only takes whole numbers
	 	        long: only takes whole numbers

	 	        float: can take decimals (MUST have F or f at the end)
	 	        double( used more often): can take decimals

	 	        boolean: true or false boolean expressions
	 	        char: character within single quote ''
	 	        	 	also takes number
         * Range: double > float >long > int >short > byte
         */
        //byte, short, integer,long, double, float veri tiplerinin max ve min degerlerini yazdiralim.

        int intMax= Integer.MAX_VALUE;
        int intMin= Integer.MIN_VALUE;

        System.out.println("intMax = " + intMax);
        System.out.println("intMin = " + intMin);
        
        byte byteMax=Byte.MAX_VALUE;
        byte byteMın=Byte.MIN_VALUE;

        System.out.println("byteMax = " + byteMax);
        System.out.println("byteMın = " + byteMın);
        
        short shortMax= Short.MAX_VALUE;
        short shortMın= Short.MIN_VALUE;

        System.out.println("shortmax = " + shortMax);
        System.out.println("shortMın = " + shortMın);
        
        long longMax= Long.MAX_VALUE;
        long longmın= Long.MIN_VALUE;

        System.out.println("longMax = " + longMax);
        System.out.println("longmın = " + longmın);
        
        double doublemax= Double.MAX_VALUE;
        double doublemın= Double.MIN_VALUE;

        System.out.println("doublemax = " + doublemax);
        System.out.println("doublemın = " + doublemın);
        
        float floatmax=Float.MAX_VALUE;
        float floatmın=Float.MIN_VALUE;


        System.out.println("floatmax = " + floatmax);
        System.out.println("floatmın = " + floatmın);


        //Her veri turuyle bir tane olmak uzere 4 degisken olusturun (float, double, char, boolean)
        //Degiskenler icin anlamli isimler kullanip, yazdiralim

        float latopFiyati=999.99f;
        double kiloMetre=35.56;
        char sınıf='A';
        boolean dogruMu=true;

        System.out.println("latopFiyati = " + latopFiyati);
        System.out.println("kiloMetre = " + kiloMetre);
        System.out.println("sınıf = " + sınıf);
        System.out.println("dogruMu = " + dogruMu);

        







    }

}
