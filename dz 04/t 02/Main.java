import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        Libs lb = new Libs();
        int limit = lb.input("Введите диапозон генерации, размера массива: "), size = lb.randomInt(limit),
                box;
        limit = lb.input("Введите диапозон генерации чисел:");
        LinkedList<Integer> arrayNums = new LinkedList<Integer>();
        for (int i = 0; i < size; i++) {
            arrayNums.addLast(lb.randomInt(limit)); // Так же это и добавление в конец очереди
        }
        System.out.println(arrayNums);
        System.out.println("Удаление первого элемента");
        System.out.println(arrayNums.getFirst());
        arrayNums.removeFirst();
        System.out.println(arrayNums);
        System.out.println("Вывод первого элемента без удаления");
        System.out.println(arrayNums.getFirst());
        System.out.println(arrayNums);
    }
}