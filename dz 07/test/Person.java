import java.util.Objects;

public class Person {
    Libs lb = new Libs();
    private String  fullName;
    private  String dataOfBrigge;
    private  String sex;
    private  Boolean perents;
    private Person mather;

    public Person (String mame, String date, String  sex, String per){
        this.fullName = mame;
        this.dataOfBrigge = date;
        this.sex = sex;
        this.perents = Objects.equals(per, "да");
        if (perents) {
            this.mather = new Person(lb.inputStr("Полное имя: "), lb.inputStr("Дата рождения: "),
                    lb.inputStr("Пол: "), lb.inputStr("Есть ли родители (да/нет): "));
        }
    }

    @Override
    public String toString() {
        return "ФИО: " + fullName + ", Дата рождения: "  + dataOfBrigge + ", Пол: " + sex + "\nРодитель.\n" +  mather;
    }
}
