import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

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

    public String getSeniority(AppTime AppTimeNow) {
        long diff = 0;
        LocalDateTime dateTimeNow = AppTimeNow.getDateTime();

        diff = dateTime.until(dateTimeNow, ChronoUnit.YEARS);
        if(diff != 0)
            return diff + "y";
        
        diff = dateTime.until(dateTimeNow, ChronoUnit.MONTHS);
        if(diff != 0)
            return diff + "month";

        diff = dateTime.until(dateTimeNow, ChronoUnit.DAYS);
        if(diff != 0)
            return diff + "d";

        diff = dateTime.until(dateTimeNow, ChronoUnit.HOURS);
        if(diff != 0)
            return diff + "h";

        diff = dateTime.until(dateTimeNow, ChronoUnit.MINUTES);
        if(diff != 0)
            return diff + "min";
        
        return "now";
    }
}