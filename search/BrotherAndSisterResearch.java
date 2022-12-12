package GenTree4.search;

import java.util.ArrayList;

import GenTree4.GenTree;
import GenTree4.Node;
import GenTree4.Person;
import GenTree4.Relationship;

public class BrotherAndSisterResearch extends Research {
    private Person parent;

    public BrotherAndSisterResearch(GenTree pd, Person person) {
        super(pd, person);

    }

    @Override
    public ArrayList<Person> start() {

        for (Node node : tree) {
            if (super.getPerson().getName().equals(node.person1.getName())
                    && node.relation == Relationship.child) {
                parent = node.person2;
                break;
            }
        }

        var result = new ArrayList<Person>();

        for (Node node : tree) {
            if (parent.getName().equals(node.person1.getName())
                    && node.relation == Relationship.parent
                    && !node.person2.getName().equals(super.getPerson().getName())) {
                result.add(node.person2);
            }
        }

        return result;
    }
}