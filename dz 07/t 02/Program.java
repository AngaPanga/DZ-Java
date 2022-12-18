public class Program {
    Libs lb = new Libs();
    public void printResult() {
        TrickyBugMan man = new TrickyBugMan(lb.inputStr("Полное имя: "), lb.inputStr("Дата рождения: "),
                lb.inputStr("Пол: "));
        Fridge cryptOfFood = new Fridge();
        man.setAccess((lb.inputBul(man.getFullName() + " полез в холодильник. \nА жена дала доступ? (да/нет): ")));
        cryptOfFood.interaction(man.getFullName(),man.getAccess());
    }
}
