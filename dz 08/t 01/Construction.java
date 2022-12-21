import java.util.ArrayList;

public class Construction {
    Libs lb = new Libs();
    ArrayList<ArrayList<Node>> tree = new ArrayList<>();
    public void createTree (){
        int generation = lb.inputInt("Введите количество поколений: ");
        ArrayList<Node> first = new ArrayList<>();
        Node firstNode = new Node();
        first.add(firstNode);
        tree.add(first);
        if (generation > 1) {
            for (int i = 1; i < generation; i++) {
                tree.add(parentsCount(i));
            }
        }
    }
    public ArrayList<Node> parentsCount(int generation) {
        ArrayList<Node> parentsGeneration = new ArrayList<>();
        ArrayList<Node> previews = new ArrayList<>(tree.get(generation - 1));
        for (Node node: previews) {
            System.out.println("\n    " + node.getNameMather() + "\nРодители:");
            Person mather = node.getMather();
            parentsGeneration.add(createNode(mather));
            System.out.println("\n  " + node.getNameFather() + "\n Родители:\n");
            Person father = node.getFather();
            parentsGeneration.add(createNode(father));
        }
        return parentsGeneration;
    }

    public Node createNode(Person getParent) {return new Node(getParent);}
}