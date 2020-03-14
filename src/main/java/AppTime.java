import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AppTime {

    private LocalDateTime dateTime;
    
    public AppTime() {
        this.dateTime = LocalDateTime.now();
    }

    public AppTime(String dateTimeString) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        this.dateTime = LocalDateTime.parse(dateTimeString, formatter);
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
}