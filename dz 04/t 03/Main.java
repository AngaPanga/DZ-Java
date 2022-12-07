import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int command;
        String messageForUserOne ="Введите номер операции: ", messageForUserTwo ="Введите первое значение: "
                , messageForUserThree ="Введите второе значение: ";
        LinkedList<String> history = new LinkedList<String>();
        do {
            System.out.println("""
                    
                    Выберете номер операции:
                    1. Сложение.
                    2. Вычетание.
                    3. Умножение.
                    4. Деление.
                    5. Показать историю операций.
                    6. Отменить последнюю операцию.
                    7. Выход.""");
            command = input(messageForUserOne);
            int a, b;
            switch (command) {
                case 1 -> {
                    a = input(messageForUserTwo);
                    b = input(messageForUserThree);
                    System.out.println("Сумма значений = " + (a + b));
                    history.add(a + " + " + b + " = " + (a+b));
                }
                case 2 -> {
                    a = input(messageForUserTwo);
                    b = input(messageForUserThree);
                    System.out.println("Разность значений = " + (a - b));
                    history.add(a + " - " + b + " = " + (a-b));
                }
                case 3 -> {
                    a = input(messageForUserTwo);
                    b = input(messageForUserThree);
                    System.out.println("Произведение значений = " + (a * b));
                    history.add(a + " * " + b + " = " + (a*b));
                }
                case 4 -> {
                    double c = input(messageForUserTwo);
                    b = input(messageForUserThree);
                    if (b==0){
                        System.out.println("Делить на 0 нельзя!!!");
                        history.add("Ошибка");
                    }else {
                        System.out.println("Деление значений = " + (c / b));
                        history.add(c + " / " + b + " = " + (c/b));
                    }
                }
                case 5 -> {
                    for (int i = 0; i < history.size(); i++) {
                        System.out.println((i+1) + ". " + history.get(i));
                    }
                }
                case 6 -> {
                    System.out.println("Запись " + history.getLast() + " была удалена.");
                    history.removeLast();
                }
                case 7 -> {
                    System.out.println("Приятно было поработать!");
                }
                default -> {
                    System.out.println("Не корректный ввод!");
                }
            }
        }
        while (command != 7);
    }

    static int input(String msg) {
        Scanner in = new Scanner(System.in);
        System.out.print(msg);
        return in.nextInt();
    }
}