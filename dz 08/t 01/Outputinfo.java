import java.util.ArrayList;

public class Outputinfo {
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
}
