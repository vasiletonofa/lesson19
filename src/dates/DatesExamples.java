package dates;

import java.time.*;
import java.util.Set;

public class DatesExamples {

    void dates() {
        LocalDate date = LocalDate.of(2023, Month.MARCH, 15);
        LocalDate dat2 = LocalDate.of(2023, 3, 15);

        LocalTime localTime = LocalTime.of(20, 21);
        LocalTime localTime2 = LocalTime.of(20, 21, 50);

        LocalDateTime localDateTime = LocalDateTime.of(2023, Month.MARCH, 15, 20, 21);
        LocalDateTime localDateTime2 = LocalDateTime.of(date, localTime);

        ZoneId zone = ZoneId.of("US/Eastern");

        ZonedDateTime zonedDateTime = ZonedDateTime.of(date, localTime, zone);
        ZonedDateTime zonedDateTime2 = ZonedDateTime.of(localDateTime, zone);

        Set<String> zones = ZoneId.getAvailableZoneIds();


        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        LocalDateTime currentDateTime = LocalDateTime.now();
        ZonedDateTime currentZoneDateTime = ZonedDateTime.now();

    }
}
