import java.util.HashMap;
import java.util.ArrayList;

public class Node {

    private String name;
    private ArrayList<Node> parents;
    private ArrayList<Node> children;
    private HashMap<Node, Double> pDist;

    public Node(String name, ArrayList<Node> parents, ArrayList<Node> children, HashMap<Node, Double> pDist){
        this.name = name;
        this.parents = parents;
        this.children = children;
        this.pDist = pDist;
    }

}
