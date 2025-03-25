import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimeZones {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");

        System.out.println("Current Time in GMT: " + getTimeInZone("GMT", formatter));
        System.out.println("Current Time in IST: " + getTimeInZone("Asia/Kolkata", formatter));
        System.out.println("Current Time in PST: " + getTimeInZone("America/Los_Angeles", formatter));
    }

    public static String getTimeInZone(String zone, DateTimeFormatter formatter) {
        return ZonedDateTime.now(ZoneId.of(zone)).format(formatter);
    }
}