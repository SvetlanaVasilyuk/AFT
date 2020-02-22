package Homework_6_1_PersonSuperComparator;

import java.util.Comparator;

public class PersonSuperComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        int result = p1.getName().compareTo(p2.getName());
        if (result != 0) {
            return result;
        }
        if (p1.getAge() > p2.getAge()) {
            return 1;
        } else if (p1.getAge() < p2.getAge()) {
            return -1;
        } else {
            return 0;
        }
    }
}
