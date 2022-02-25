package ComparatorVsComparable;

import OOP_Concepts.Animal;

import java.util.Comparator;

public class AnimalComparatorName implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        if (o1.name.compareTo(o2.name)>0)
            return 1;
        else
            return -1;
    }
}
