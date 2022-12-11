import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Program {
    Libs lb = new Libs();

    public void printPhone(){
       // ;
        for (Map.Entry <String, ArrayList<String>> listPhone: fillPhone().entrySet()) {
            System.out.println(listPhone);
        }
    } 
    public Map<String, ArrayList<String>> fillPhone() {
        String inp;
        HashMap<String, ArrayList<String>> numbers = new HashMap<>();
        do {
            inp = lb.inputStr("Введите команду 'exit' или фамилию: ");
            if (!Objects.equals(inp, "exit")){
                int count = lb.inputInt("Введите количество номеров телефона: ");
                ArrayList<String> list = new ArrayList<>();
                for (int i = 0; i < count; i++) {
                    list.add(lb.inputStr("Введите номер телефона" + (i+1) + ".: "));
                }
                numbers.put(inp, list);
            }
        } while (!Objects.equals(inp, "exit"));
        return numbers;
    }
}
