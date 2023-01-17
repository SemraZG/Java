package SelfStudy;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class SelfStudyDateTime {
    public static void main(String[] args) {

        LocalDate date= LocalDate.now();
        System.out.println(date);

        LocalTime time= LocalTime.now();
        System.out.println(time);

        LocalDateTime dateTime= LocalDateTime.now();
        System.out.println(dateTime);

        LocalDateTime dateTimeGermany= LocalDateTime.now(ZoneId.of("Europe/Berlin"));
        System.out.println(dateTimeGermany);
        LocalTime timeInItaly= LocalTime.now(ZoneId.of("Europe/Rome"));
        System.out.println(timeInItaly);

        LocalDate date1= LocalDate.now();
        System.out.println(date);

        LocalDate date1Next= date1.plusYears(2);
        System.out.println(date1Next);

        LocalDate date1Past= date1.minusYears(2);
        System.out.println(date1Past);








    }
}
