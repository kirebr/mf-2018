import java.util.Calendar;
import java.util.Locale;
public class CalendarTest {
    public static void main(final String args[]) {
        final CalendarTest objCalendarTest = new CalendarTest();
        objCalendarTest.execute();
    }
    public void execute() {
        final Calendar objCalendar = Calendar.getInstance();
        final Locale objLocale = new Locale("pt", "BR");
        System.out.println(objCalendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, objLocale));
    }
}
