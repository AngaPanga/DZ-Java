import java.util.Random;
import java.util.Scanner;

public class Libs {

    int randomInt(int max){
        Random rnd = new Random();
        return rnd.nextInt(max);
    }

    String inputStr(String msg) {
        Scanner in = new Scanner(System.in);
        System.out.print(msg);
        return in.nextLine();
    }

    int inputInt(String msg) {
        Scanner in = new Scanner(System.in);
        System.out.print(msg);
        return in.nextInt();
    }
}
