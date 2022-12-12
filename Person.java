package GenTree4;

public class Person {
    private String name;
    private String gender;
    private int age;

    public Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public Person(String name) {
        this(name, "", 0);
    }

    public String getInfo() {
        return "Человек: " + this.name + ", Пол: " + this.gender + ", возраст:" + this.age;
    }

    public String getName() {
        return name;
    }
}
