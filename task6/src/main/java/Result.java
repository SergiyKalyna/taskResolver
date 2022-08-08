import java.util.Calendar;
import java.util.Date;

public class Result {

    public static int findDay(int month, int day, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(month, day, year));


        return calendar.get(Calendar.DAY_OF_WEEK);
    }
}
