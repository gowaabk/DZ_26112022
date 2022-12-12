package GenTree4;

import java.util.ArrayList;

public class GenTree implements DataStore {
    private ArrayList<Node> arrayTree = new ArrayList<>();

    @Override
    public ArrayList<Node> getData() {
        return arrayTree;
    }

    @Override
    public void append(Person parent, Person child) {

        arrayTree.add(new Node(parent, Relationship.parent, child));
        arrayTree.add(new Node(child, Relationship.child, parent));
    }
}
