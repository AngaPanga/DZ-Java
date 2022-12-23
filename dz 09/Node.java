public class Node implements Comparable<String>{
    Libs lb = new Libs();
    private Person child;
    private Person mather;
    private Person father;

    public Node() {
        System.out.println("~~~  Ребенок  ~~~");
        this.child = inp();
        System.out.println("~~~  Мама  ~~~");
        this.mather = inp();
        System.out.println("~~~  Папа  ~~~");
        this.father = inp();
    }
    public Node(Person child) {
        this.child = child;
        System.out.println("~~~  Мама  ~~~");
        this.mather = inp();
        System.out.println("~~~  Папа  ~~~");
        this.father = inp();
    }

    public int compareTo(String inpName) {
        return this.child.getFullName().compareTo(inpName);
    }

    @Override
    public String toString() {
        return "\n" + child + "\n" + mather + "\n" + father;
    }

    public Person getChild() {
        return child;
    }
    public Person getMather() {return mather;}
    public Person getFather() {return father;}
    public String getNameMather() {
        return mather.getFullName();
    }
    public String getNameFather() {
        return father.getFullName();
    }

    private Person inp() {
        return new Person(lb.inputStr("Полное имя: "), lb.inputInt("Возраст: "), lb.inputStr("Пол: "));
    }
}