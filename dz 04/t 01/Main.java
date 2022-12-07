import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        Libs lb = new Libs();
        int limit = lb.input("Введите диапозон генерации, размера массива: "), size = lb.randomInt(limit),
                box;
        limit = lb.input("Введите диапозон генерации чисел:");
        LinkedList<Integer> arrayNums = new LinkedList<Integer>();
        for (int i = 0; i < size; i++) {
            arrayNums.add(lb.randomInt(limit));
        }
        System.out.println(arrayNums);

        for (int i = 0; i < arrayNums.size()/2; i++) {
            box = arrayNums.get(arrayNums.size()-i-1);
            arrayNums.set(arrayNums.size()-i-1,arrayNums.get(i));
            arrayNums.set(i, box);
        }
        System.out.println(arrayNums);
    }
}