public class Person {
    private String  fullName;
    private  Integer age;
    private  String sex;


    public Person (String mame, Integer date, String  sex){
        this.fullName = mame;
        this.age = date;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "ФИО: " + fullName + ", Возраст: "  + age + ", Пол: " + sex;
    }

    public String getFullName() {return fullName;}

    public int getAge() {
        return age;
    }
}
