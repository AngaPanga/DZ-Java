import java.util.ArrayList;
import java.util.Objects;

public class Program {
    Libs lb = new Libs();
    int sizeArray;
    ArrayList<Laptop> laptops= new ArrayList<>();

    public void printResult() {
        sizeArray = lb.inputInt("Введите общее количество ноутбуков: ");
        resArray(sizeArray);
        for (int i = 0; i < sizeArray; i++) {
            printElements(i);
        }
        int change = lb.inputInt("""
                Выберете критерий сортировки:\s
                1. Производитель.
                2. Процессор.
                3. ОЗУ.
                4. SSD диск.
                5. HDD диск.
                Ваш выбор:\s""");
        switch (change){
            case 1 ->{
                String userStat = lb.inputStr("Введите макру ноутбука: ");
                for (int i = 0; i < sizeArray; i++) {
                    if (Objects.equals(laptops.get(i).getBrand(), userStat)) printElements(i);
                }
            }
            case 2 ->{
                String userStat = lb.inputStr("Введите процессор: ");
                for (int i = 0; i < sizeArray; i++) {
                    if (Objects.equals(laptops.get(i).getCpu(), userStat)) printElements(i);
                }
            }
            case 3 ->{
                int userStat = lb.inputInt("Введите минимальный размер ОЗУ: ");
                for (int i = 0; i < sizeArray; i++) {
                    if (laptops.get(i).getRam() >= userStat) printElements(i);
                }
            }
            case 4 ->{
                int userStat = lb.inputInt("Введите минимальный размер SSD: ");
                for (int i = 0; i < sizeArray; i++) {
                    if (laptops.get(i).getSsd() >= userStat) printElements(i);
                }
            }
            case 5 ->{
                int userStat = lb.inputInt("Введите минимальный размер HDD");
                for (int i = 0; i < sizeArray; i++) {
                    if (laptops.get(i).getRam() >= userStat) printElements(i);
                }
            }
        }

    }

    public void printElements(int check) {
        System.out.println("Ноутбук " + laptops.get(check).getBrand() + ", " +
                "Процессор: " + laptops.get(check).getCpu() + ", " +
                "Озу: " + laptops.get(check).getRam() + ", " +
                "Диск SSD: " + laptops.get(check).getSsd() + ", " +
                "Диск HDD: " + laptops.get(check).getHdd() + ", " +
                "Вес: " + laptops.get(check).getWeight() + ", " +
                "Цвет: " + laptops.get(check).getColor());
    }

    public void resArray(int count) {
        for (int i = 0; i <count; i++) {
            laptops.add(stats());
        }
    }

    public Laptop stats(){
        return new Laptop(lb.inputStr("Введите бранд ноутбука: "),
                lb.inputStr("Введите процессор ноутбука: "),
                lb.inputInt("Введите ОЗУ ноутбука (Gb): "),
                lb.inputInt("Введите размер SSD ноутбука (Gb): "),
                lb.inputInt("Введите размер HDD ноутбука (Gb): "),
                lb.inputDbl("Введите вес ноутбука: "),
                lb.inputStr("Введите цвет: "));
    }
}
