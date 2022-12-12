package GenTree4;

import java.util.ArrayList;

public interface DataStore {
    ArrayList<Node> getData();

    void append(Person person1, Person person2);
}