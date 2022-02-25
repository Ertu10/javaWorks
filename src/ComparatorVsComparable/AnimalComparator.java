package ComparatorVsComparable;

import OOP_Concepts.Animal;

import java.util.Comparator;

public class AnimalComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        if (o1.age>o2.age)
            return 1;
        else
            return -1;
    }
}
