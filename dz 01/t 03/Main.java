import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        int command;
        String messageForUserOne ="Введите номер операции: ", messageForUserTwo ="Введите первое значение: "
                , messageForUserThree ="Введите второе значение: ";
        do {
            System.out.println("Выберете номер операции:" +
                    "\n1. Сложение." +
                    "\n2. Вычетание." +
                    "\n3. Умножение." +
                    "\n4. Деление." +
                    "\n5. Выход.");
            command = input(messageForUserOne);
            int a, b;
            switch (command) {
                case 1:
                    a = input(messageForUserTwo);
                    b = input(messageForUserThree);
                    System.out.println("Сумма значений = " + (a+b));
                    break;
                case 2:
                    a = input(messageForUserTwo);
                    b = input(messageForUserThree);
                    System.out.println("Разность значений = " + (a-b));                    break;
                case 3:
                    a = input(messageForUserTwo);
                    b = input(messageForUserThree);
                    System.out.println("Произведение значений = " + (a*b));                    break;
                case 4:
                    double c = input(messageForUserTwo);
                    b = input(messageForUserThree);
                    System.out.println("Деление значений = " + (c/b));                    break;
                case 5:
                    System.out.println("Приятно было поработать!");
                    break;
                default:
                    System.out.println("Не корректный ввод!");
            }
        }
        while (command != 5);
    }

    static int input(String msg) {
        Scanner in = new Scanner(System.in);
        System.out.print(msg);
        return in.nextInt();
    }
}