package DateAndTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateAndTimeExample {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalDate yesterday = date.minusDays(1);
        LocalDate tomorrow = yesterday.plusDays(2);
        System.out.println("Today date: "+date);
        System.out.println("Yesterday date: "+yesterday);
        System.out.println("Tomorrow date: "+tomorrow);
        LocalDate date1 = LocalDate.of(2023, 1, 7);
        System.out.println("2023 is Leap year or not ?"+date1.isLeapYear());
        //String to local Data
        String dateInString = "2023-01-07";
        LocalDate d1 = LocalDate.parse(dateInString);
        System.out.println("String to LocalDate : " + d1);
        //Date to String
        LocalDate date2 = LocalDate.now();
        String stringToDate = date2.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println("Date1 in string :  " + stringToDate);
    }
}
