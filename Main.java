package GenTree4;

import GenTree4.search.*;

public class Main {
    public static void main(String[] args) {

        Person anastsiya = new Person("Анастасия", "Ж", 20);
        Person valery = new Person("Валерий", "М", 30);
        Person dasha = new Person("Даша", "Ж", 5);
        Person ivan = new Person("Иван", "М", 27);
        Person vitaly = new Person("Виталий", "М", 32);
        Person yulya = new Person("Юля", "Ж", 33);
        Person slava = new Person("Вячеслав", "М", 40);
        Person vitalina = new Person("Виталина", "Ж", 36);

        System.out.println(dasha.getInfo());

        GenTree genTreeParents = new GenTree();
        genTreeParents.append(anastsiya, valery);
        genTreeParents.append(anastsiya, dasha);
        genTreeParents.append(ivan, slava);
        genTreeParents.append(anastsiya, slava);
        genTreeParents.append(ivan, dasha);
        genTreeParents.append(ivan, valery);
        genTreeParents.append(vitaly, yulya);
        genTreeParents.append(vitalina, yulya);

        GenTree genTreeChild = new GenTree();
        genTreeChild.append(valery, anastsiya);
        genTreeChild.append(dasha, anastsiya);
        // genTreeChild.append(slava, anastsiya);
        // genTreeChild.append(dasha, ivan);
        // genTreeChild.append(slava, ivan);
        genTreeChild.append(dasha, ivan);
        genTreeChild.append(yulya, vitaly);
        genTreeChild.append(yulya, vitalina);

        System.out.println("*** Поиск родителей: " + valery.getName());
        for (Person hum : (new ParentResearch(genTreeParents, valery).start())) {
            System.out.println(hum.getName());
        }

        System.out.println("*** Поиск детей: " + yulya.getName());
        for (Person hum : (new ChildResearch(genTreeChild, yulya).start())) {
            System.out.println(hum.getName());
        }

        System.out.println("*** Поиск братьев и сестёр: " + dasha.getName());
        for (Person hum : (new BrotherAndSisterResearch(genTreeParents, dasha).start())) {
            System.out.println(hum.getName());
        }
    }
}