package Homework_6_1_PersonSuperComparator;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<Person>();
        persons.add(new Person("Николай", 26));
        persons.add(new Person("Василий", 25));
        persons.add(new Person("Александр", 20));
        persons.add(new Person("Константин", 30));
        persons.add(new Person("Николай", 20));
        persons.add(new Person("Константин", 25));

        persons.sort(new PersonSuperComparator());

        for (Person p : persons) {
            System.out.println(p.toString());
        }
    }
}
