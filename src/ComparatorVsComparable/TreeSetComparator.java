package ComparatorVsComparable;

import OOP_Concepts.Animal;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetComparator {
    public static void main(String[] args) {
        Set sinan = new HashSet<>();
        Animal a = new Animal();
        a.name="Ahmet";
        a.age=1;
        Animal b = new Animal();
        b.age=3;
        b.name="Bartu";
        sinan.add(a);sinan.add(b);
        Animal c = new Animal();
        c.age = 2;
        c.name = "Cemil";

        TreeSet<Animal> ERT = new TreeSet<>(new AnimalComparator());
        ERT.add(a);
        ERT.add(b);
        ERT.add(c);
        for (Animal animal : ERT) {
            System.out.println("animal.age = " + animal.age);
            System.out.println("animal.name = " + animal.name);
        }
        System.out.println();
        TreeSet<Animal> da = new TreeSet<>(new AnimalComparatorName());
        da.add(a);
        da.add(b);
        da.add(c);
        for (Animal animal : da) {
            System.out.println("animal.age = " + animal.age);
            System.out.println("animal.name = " + animal.name);
        }
    }
}
