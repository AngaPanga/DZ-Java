public class Program {
    Libs lb = new Libs();
    public void printResult() {
        Person p = new Person(lb.inputStr("Полное имя: "), lb.inputStr("Дата рождения: "),
                lb.inputStr("Пол: "),lb.inputStr("Есть ли родители (да/нет): "));
        System.out.println(p);
    }
}
