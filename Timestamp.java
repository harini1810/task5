import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimestampPrinter {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedNow = now.format(formatter);
        System.out.println("Current Timestmp: " + formattedNow);
    }
}
