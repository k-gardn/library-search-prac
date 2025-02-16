package com.library.utill;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateUtills {
    private static  final DateTimeFormatter YYYYMMDD_FOMATTER = DateTimeFormatter.ofPattern("yyyyMMdd");
    public  static LocalDate parseYYYMMDD(String date){
        return LocalDate.parse(date, YYYYMMDD_FOMATTER);
    }
}
