public abstract class Animal {
    private int wheight;
    private int age;

    public Animal(int weight, int age) {
        this.wheight = weight;
        this.age = age;
    }

    @Override
    public String toString() {return "Вес:" + wheight + ", Возраст: " + age;}
}