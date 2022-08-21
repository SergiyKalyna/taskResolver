import java.util.Calendar;

public class Result {

    public static String findDay(int month, int day, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, (month - 1), day);

        return getDay(calendar.get(Calendar.DAY_OF_WEEK));
    }

    public static String getDay(int day) {
        switch (day) {
            case 1:
                return "SUNDAY";
            case 2:
                return "MONDAY";
            case 3:
                return "TUESDAY";
            case 4:
                return "WEDNESDAY";
            case 5:
                return "THURSDAY";
            case 6:
                return "FRIDAY";
            default:
                return "SATURDAY";
        }
    }
}
