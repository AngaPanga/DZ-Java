import java.util.*;

public class Program {
    Libs lb = new Libs();

    public void printResult(){
    String in = lb.inputStr("Введите римское число: ");
    char[] temp = in.toUpperCase().toCharArray();
    System.out.println("Число в десятичной СИ = " + calculation(temp));
    }

    public int calculation(char[] number) {
        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            if (i != number.length - 1) {
                if (convertNum(number[i]) >= convertNum(number[i + 1])) sum = sum + convertNum(number[i]);
                else sum = sum - convertNum(number[i]);
            } else sum = sum + convertNum(number[i]);
        }
        return sum;
    }

    public int convertNum(char element) {
        Map<Character, Integer> table = new HashMap<>();
        table.put('I', 1);
        table.put('V', 5);
        table.put('X', 10);
        table.put('L', 50);
        table.put('C', 100);
        table.put('D', 500);
        table.put('M', 1000);
        return table.get(element);
    }
}
