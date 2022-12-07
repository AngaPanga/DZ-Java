import java.util.Random;
import java.util.Scanner;

public class Libs {

    int randomInt(int max){
        Random rnd = new Random();
        return rnd.nextInt(max);
    }

    int input(String msg) {
        Scanner in = new Scanner(System.in);
        System.out.print(msg);
        return in.nextInt();
    }
}
