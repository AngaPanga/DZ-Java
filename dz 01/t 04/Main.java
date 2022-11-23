// 5? +?7= 68
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        int a, b, box, result;
        String messageForUserOne ="Введите выражение: ";
        String expression = input(messageForUserOne);
        String[] element = expression.replace(" ", "").replace("+"," ")
                .replace("="," ").split(" ");
        a = convert(element[0]);
        b = convert(element[1]);
        result = Integer.parseInt(element[2]);
        box = result - a - b;
        if (box<0){
            System.out.println("Решения нет!");
        }
        else
        {
            if (a > b){
                a = a + box % 10;
                b = b + 10 * (box / 10);
            }
            else
            {
                a = a + 10 * (box / 10);
                b = b + box % 10;
            }
            System.out.println("Решение уравнения: a = " + a + " b = " + b);
        }
    }

    static String input(String msg) {
        Scanner in = new Scanner(System.in);
        System.out.print(msg);
        return in.nextLine();
    }

    static int convert(String msg) {
        int num, i = msg.indexOf("?");
        if (i == 0){
            num = msg.charAt(1) - '0';
            return num;
        }
        else
        {
            num = (msg.charAt(0)- '0') * 10;
            return num;
        }
    }
}