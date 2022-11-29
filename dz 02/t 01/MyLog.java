import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;

public class MyLog {
    String logName = "log.txt";
    StringBuilder data = new StringBuilder();
    Calendar time = Calendar.getInstance();

    void writeLog(StringBuilder dataInfo){
        try(FileOutputStream fos = new FileOutputStream(logName)){
            byte[] buffer = dataInfo.toString().getBytes();
            fos.write(buffer, 0, buffer.length);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    void info(String exitPlayce){
        data.append(time.getTime()).append("\n Контрольная точка: ").append(exitPlayce)
                .append("\n Успештное выполнение кода\n\n");
        writeLog(data);
    }

    void error(String exitPlayce) {
        data.append("!!! ERROR !!!\n").append(time.getTime()).append("\n Контрольная точка: ").append(exitPlayce)
                .append("\n Сбой программы.\n\n");
        writeLog(data);
    }
    void warning(String exitPlayce){
        data.append("~~~ WARNING ~~~\n").append(time.getTime()).append("\n Контрольная точка: ").append(exitPlayce)
                .append("\n Программа вышла на исключение\n\n");
        writeLog(data);
    }
}
