public class Program {
    Libs lb = new Libs();
    public void printResult() {
        System.out.println("Хозяин.");
        TrickyBugMan man = new TrickyBugMan(lb.inputInt("Вес: "), lb.inputInt("Возраст: "),
                lb.inputStr("Имя: "), lb.inputStr("Пол: "));
        Cat pushok = new Cat(lb.inputStr("Кличка кота: "), lb.inputInt("вес: "),
                lb.inputInt("Возраст: "));
        man.setTalk(lb.inputStr("Что говорит хозяин " + man.getName() + ": "));
        pushok.listen(man.getTalk());
    }
}
