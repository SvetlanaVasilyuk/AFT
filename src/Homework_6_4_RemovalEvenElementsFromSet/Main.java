package Homework_6_4_RemovalEvenElementsFromSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.LinkedHashSet;

public class Main {

    public static Set<String> removeEvenLength(Set<String> set) {
        LinkedHashSet<String> set2 = new LinkedHashSet<>();
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            if (element.length() % 2 != 0) {
                set2.add(element);
            }
        }
        return set2;
    }

    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("Протекала");
        set.add("Речка");
        set.add("Через");
        set.add("Речку");
        set.add("Мост");
        set.add("На");
        set.add("Мосту");
        set.add("Овечка");
        set.add("У");
        set.add("Овечки");
        set.add("Хвост");

        System.out.println("Исходное множество: " + set.toString());

        System.out.println("Новое множество: " + removeEvenLength(set).toString());
    }
}
