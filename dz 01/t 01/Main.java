import java.util.Scanner;

public class Main {
    public Main() {
}

    public static void main(String[] args) {
        int sum = 0;
        long factorial = 1;
        int n = input();

        for(int i = 1; i < n + 1; ++i) {
            sum += i;
            factorial *= i;
        }

        System.out.println("Треугольное n-ое число: " + sum);
        System.out.println("Факториал числа n: " + factorial);
    }

    static int input() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        return in.nextInt();
    }
}