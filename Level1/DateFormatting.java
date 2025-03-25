import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatting {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();

        System.out.println("Format 1 (dd/MM/yyyy): " + formatDate(currentDate, "dd/MM/yyyy"));
        System.out.println("Format 2 (yyyy-MM-dd): " + formatDate(currentDate, "yyyy-MM-dd"));
        System.out.println("Format 3 (EEE, MMM dd, yyyy): " + formatDate(currentDate, "EEE, MMM dd, yyyy"));
    }

    public static String formatDate(LocalDate date, String pattern) {
        return date.format(DateTimeFormatter.ofPattern(pattern));
    }
}