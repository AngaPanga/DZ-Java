import java.util.Calendar;
import java.util.GregorianCalendar;

public interface TimeInfo extends Libs {
    default Calendar tinp(){
        System.out.println("Выполнить до...");
        int day = inputInt("День: "), month = inputInt("Месяц (числом): ") -1, year = inputInt("Год: ");
        return new GregorianCalendar(year, month, day);
    }

    default String getDate(Calendar dd){
        return dd.get(Calendar.DAY_OF_MONTH) + "." + (1 + dd.get(Calendar.MONTH)) + "." + dd.get(Calendar.YEAR);
    }
}