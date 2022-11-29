import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        char[] array = new char[500]; // Пока что так, еще пока вникаю в логику буфера
        int size = 0;
        boolean trigger = false;
        File file = new File("log.txt");
        try (FileReader fr = new FileReader(file)) {

            size = fr.read(array);

            for (int i = 0; i < size; i++) {
                if (array[i] == '~' && (!trigger)) trigger = true;
                if (trigger) System.out.print(array[i]);
                if (array[i] == '\n' && array[i+1] == '\n' && (trigger)) trigger = false;
            }
        } catch (IOException e) {
            System.out.print(e.getMessage());
        }
    }
}