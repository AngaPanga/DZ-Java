import java.util.ArrayList;
import java.util.Collections;

public class Outputinfo {
    Libs lb =new Libs();
    Construction genTree = new Construction();

    public void inputTree(){
        genTree.createTree();
    }

    public void printTree(){
        for (ArrayList<Node> levelTree: genTree.tree) {
            for (Node node: levelTree) {
                System.out.println(node);
            }
        }
    }
    public void findChild(){
        System.out.println("Поиск \"Ребенка\" по имени");
        String findName = lb.inputStr("Введите имя ребенка для поиска: ");
        for (ArrayList<Node> levelTree: genTree.tree) {
            for (Node node: levelTree) {
                if (node.compareTo(findName) == 0) {
                    System.out.println(node);
                }
            }
        }
    }

    public void sortPeople(){
        System.out.println("Сортировка \"Ребенок\" по возрасту.");
        ArrayList<Person> people = new ArrayList<>();
        for (ArrayList<Node> levelTree: genTree.tree) {
            for (Node node: levelTree) {
                people.add(node.getChild());
            }
        }
        Collections.sort(people, new PeoepleSorting());
        for (Person ppl: people) {
            System.out.println(ppl);
        }
    }
}
