package GenTree4;

public class Node {

    public Node(Person person1, int relation, Person person2) {
        this.person1 = person1;
        this.relation = relation;
        this.person2 = person2;
    }

    public Person person1;
    public int relation;
    public Person person2;

    @Override
    public String toString() {
        return String.format("<%s %s %s>", person1, relation, person2);
    }
}