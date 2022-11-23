import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        boolean triger = true;
        int n = input();
        System.out.print("Ряд простых чисел: 1 2 3");

        for(int i = 4; i < n + 1; ++i) {
            for(int j = 2; j < i; ++j) {
                if (i % 100 == 0) {
                    System.out.println(" ");
                }

                if (i % j == 0) {
                    triger = false;
                    break;
                }
            }

            if (triger) {
                System.out.print(" " + i);
            }

            triger = true;
        }

    }

    static int input() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        return in.nextInt();
    }
}