import java.util.Calendar;

public class Result {

    public static int findDay(int month, int day, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, (month - 1), day);

        return calendar.get(Calendar.DAY_OF_WEEK);
    }
}
