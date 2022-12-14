package day30_ImmuTable_Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class C06_LocalDateTime {
    public static void main(String[] args) {
        LocalDateTime tarihSaat = LocalDateTime.now();

        System.out.println(tarihSaat); // 2022-07-23T18:39:59.070277900

        System.out.println(tarihSaat.plusMonths(3).plusHours(100)); // 2022-10-27T22:41:58.917967300

        System.out.println(tarihSaat.minusDays(100).plusHours(100)); // 2022-04-18T22:43:17.767691500

        System.out.println(tarihSaat.toLocalDate()); // 2022-07-23
    }
}
