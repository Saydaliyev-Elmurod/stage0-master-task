package com.epam.conditions;

import java.time.LocalDate;
import java.util.Date;

public class DaysInMonth {

    public void printDays(int year, int month) {
        if (year < 0 || month > 12 || month < 1) {
            System.out.println("invalid date");
            return;
        }
        boolean flag = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        int day = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> flag ? 29 : 28;
            default -> 0;
        };
        System.out.println(day);

    }

}
