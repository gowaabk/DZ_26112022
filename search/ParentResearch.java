package GenTree4.search;

import java.util.ArrayList;

import GenTree4.Node;
import GenTree4.Person;
import GenTree4.Relationship;
import GenTree4.GenTree;

public class ParentResearch extends Research {

    public ParentResearch(GenTree pd, Person person) {
        super(pd, person);
    }

    @Override
    public ArrayList<Person> start() {

        var result = new ArrayList<Person>();

        for (Node node : tree) {
            if (super.getPerson().getName().equals(node.person2.getName())
                    && node.relation == Relationship.parent) {
                result.add(node.person1);
            }
        }
        return result;
    }
}