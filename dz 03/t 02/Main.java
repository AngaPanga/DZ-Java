import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Libs lb = new Libs();
        int limit = lb.input("Введите диапозон генерации, размера массива: ");
        int size = lb.randomInt(limit);
        limit = lb.input("Введите диапозон генерации чисел:");
        ArrayList<Integer> arrayNums = new ArrayList<Integer> ();
        for (int i = 0; i < size; i++) {
            arrayNums.add(lb.randomInt(limit));
        }
        System.out.println(arrayNums);

        for (int i = 0; i < arrayNums.size(); i++) {
            if (arrayNums.get(i) % 2 == 0){
                arrayNums.remove(i);
            }
        }
        System.out.println("Итоговый массив:");
        System.out.println(arrayNums);
    }
}