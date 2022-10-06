package day30_ImmuTable_Date;

import java.time.LocalDate;
import java.time.Period;

public class C07_Period {

    public static void main(String[] args) {
        // iki tarih arasinda ki sureyi tanima

        LocalDate tarih1=LocalDate.of(1986,11,27);
        LocalDate bugün=LocalDate.now();

        Period period=Period.between(bugün,tarih1);

        System.out.println(period);//P-35Y-7M-26D


    }
}
