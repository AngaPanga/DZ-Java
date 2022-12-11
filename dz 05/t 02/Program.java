import java.util.*;

public class Program {
    Libs lb = new Libs();

    public void printResult(){
        TreeMap <Integer, ArrayList<String>> getCopys = fillCopys();
        for (Integer ind: getCopys.descendingKeySet()) {
            System.out.println(ind + " повторов " + getCopys.get(ind));
        }
    }
    public TreeMap<Integer, ArrayList<String>> fillCopys() {
        ArrayList<String> getList = originList();
        TreeMap<Integer, ArrayList<String>> copyList = new TreeMap<>();
        int count = 0;
        for (int i = 0; i < getList.size(); i++) {
            for (String s : getList) {
                if (Objects.equals(getList.get(i), s)) count++;
            }
            if (copyList.containsKey(count)) {
                if (!copyList.get(count).contains(getList.get(i))) copyList.get(count).add(getList.get(i));
            }else {
                ArrayList<String> temp = new ArrayList<>();
                temp.add(getList.get(i));
                copyList.put(count, temp);
            }
            count = 0;
        }
        return copyList;
    }

    public ArrayList<String> originList() {
       ArrayList<String> listNames = new ArrayList<>();
       String inp;
       System.out.println("q - Остановить заполнение списка." );
       do {
           inp  = lb.inputStr("Введите Имя Фамилию: ");
           if (!Objects.equals(inp, "q")) listNames.add(inp);
       }while (!Objects.equals(inp,"q"));
       return listNames;
    }
}
