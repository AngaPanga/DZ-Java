public class Program {
    Libs lb = new Libs();
    public void printResult() {
        TrickyBugMan man = new TrickyBugMan(lb.inputStr("Полное имя: "), lb.inputStr("Дата рождения: "),
                lb.inputStr("Пол: "));
        Cat pushok = new Cat();
        man.setAccess((lb.inputStr(man.getFullName() + " кричит что? кис кис?\nВведите его сообщение: ")));
        pushok.interaction(man.getCall());
    }
}
