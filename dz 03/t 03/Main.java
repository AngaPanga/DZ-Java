import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Libs lb = new Libs();
        int limit = lb.input("Введите диапозон генерации, размера массива: "), size = lb.randomInt(limit),
                max, min, midle;
        limit = lb.input("Введите диапозон генерации чисел:");
        ArrayList<Integer> arrayNums = new ArrayList<Integer> ();
        for (int i = 0; i < size; i++) {
            arrayNums.add(lb.randomInt(limit));
        }
        System.out.println(arrayNums);

        max = arrayNums.get(0);
        min = arrayNums.get(0);
         for (int i = 1; i < arrayNums.size(); i++) {
            if (arrayNums.get(i) > max){
                max = arrayNums.get(i);
            } else if (arrayNums.get(i) < min) {
                min = arrayNums.get(i);
            }
        }
        System.out.println("Максимальное значение: " + max + ", Минимальное значение: " + min );
        if (arrayNums.size()%2 != 0) System.out.println("Серединное значение: " + arrayNums.get(arrayNums.size()/2));
        else System.out.println("Середина находится между: " + arrayNums.get(arrayNums.size()/2 - 1) +
                " и " + arrayNums.get(arrayNums.size()/2));
    }
}