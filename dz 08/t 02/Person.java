public abstract class Person extends Animal {
    private String  name;
    private  String sex;

    public Person(int weight, int age, String name, String sex) {
        super(weight, age);
        this.name = name;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Имя: " + name + ", Пол: " + sex + super.toString();
    }

    public String getName() {
        return name;
    }
}
