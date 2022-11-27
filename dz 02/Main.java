import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        MyLog logger = new MyLog();
        logger.info("Активация логов");
        int command;
        String messageForUserOne ="Введите номер операции: ", messageForUserTwo ="Введите первое значение: "
                , messageForUserThree ="Введите второе значение: ";
        do {
            System.out.println("""
                    Выберете номер операции:
                    1. Сложение.
                    2. Вычетание.
                    3. Умножение.
                    4. Деление.
                    5. Выход.""");
            logger.info("Запуск цикла");
            command = input(messageForUserOne);
            int a, b;
            switch (command) {
                case 1 -> {
                    a = input(messageForUserTwo);
                    b = input(messageForUserThree);
                    System.out.println("Сумма значений = " + (a + b));
                    logger.info("Выполнено сложение");
                }
                case 2 -> {
                    a = input(messageForUserTwo);
                    b = input(messageForUserThree);
                    System.out.println("Разность значений = " + (a - b));
                    logger.info("Выполнено вычетание");
                }
                case 3 -> {
                    a = input(messageForUserTwo);
                    b = input(messageForUserThree);
                    System.out.println("Произведение значений = " + (a * b));
                    logger.info("Выполнено умножение");
                }
                case 4 -> {
                    try {
                        double c = input(messageForUserTwo);
                        b = input(messageForUserThree);
                        if (b==0){
                            logger.warning("Пользователь ввел 0");
                            System.out.println("Делить на 0 нельзя!!!");
                        }else {
                            System.out.println("Деление значений = " + (c / b));
                            logger.info("Выполнено деление");
                        }
                    } catch (ArithmeticException e){
                        logger.error("Переход в блок catch");
                    }
                }
                case 5 -> {
                    System.out.println("Приятно было поработать!");
                    logger.info("Выполнен выход из цикла");
                }

                default -> {
                    System.out.println("Не корректный ввод!");
                    logger.info("Обработка ошибки пользователя");
                }
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