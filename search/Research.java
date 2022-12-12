package GenTree4.search;
//package search;

import java.util.ArrayList;

import GenTree4.GenTree;
import GenTree4.Node;
import GenTree4.Person;

public abstract class Research {
    ArrayList<Node> tree;
    private Person person;

    public Research(GenTree pd, Person person) {
        tree = pd.getData();
        this.person = person;
    }

    public ArrayList<Person> start() {
        return null;
    }

    public Person getPerson() {
        return person;
    }
}