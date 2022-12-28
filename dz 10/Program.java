public class Program implements Libs{
    public void printResult() {
        Plan listPlans = new Plan();
        int userInput;
        do {
            System.out.println("""
                    
                    1. Импорт данных из файла.
                    2. Вывод плана задач.
                    3. Новая задача.
                    4. Сортировка списка задач.
                    5. Экспорт списка задач в файл.
                    6. Выход.""");
            userInput = inputInt("Выберете команду: ");
            switch (userInput){
                case 1 -> listPlans.importFile();
                case 2 -> System.out.println(listPlans);
                case 3 -> listPlans.newTask();
                case 4 -> listPlans.sortingTasks();
                case 5 -> listPlans.exportFile();
            }
        } while (userInput != 6);
    }
}
