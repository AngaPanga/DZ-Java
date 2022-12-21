public class Person {
    Libs lb = new Libs();
    private String  fullName;
    private  String dataOfBrigge;
    private  String sex;


    public Person (String mame, String date, String  sex){
        this.fullName = mame;
        this.dataOfBrigge = date;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "ФИО: " + fullName + ", Дата рождения: "  + dataOfBrigge + ", Пол: " + sex;
    }

    public String getFullName() {return fullName;}
}
