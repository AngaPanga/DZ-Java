import java.util.*;

public interface Libs {

    default int randomInt(int max){
        Random rnd = new Random();
        return rnd.nextInt(max);
    }

    default String inputStr(String msg) {
        Scanner in = new Scanner(System.in);
        System.out.print(msg);
        return in.nextLine();
    }

    default int inputInt(String msg) {
        Scanner in = new Scanner(System.in);
        System.out.print(msg);
        return in.nextInt();
    }

    default double inputDbl(String msg) {
        Scanner in = new Scanner(System.in);
        System.out.print(msg);
        return in.nextDouble();
    }

    default String convertText(int id, int level, String dateStart, String dateEnd, String author, String task){
        return id + "," + level +
                "," + dateStart +
                "," + dateEnd +
                "," + author +
                "," + task + "\n";
    }

    default Calendar strToDate(String str){
        ArrayList<String> dmy = new ArrayList<>(Arrays.asList(str.split("\\.")));
        return new GregorianCalendar(Integer.parseInt(dmy.get(2)),(Integer.parseInt(dmy.get(1))-1),
                Integer.parseInt(dmy.get(0)));
    }
}