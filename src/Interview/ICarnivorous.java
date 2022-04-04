package Interview;

import OOP_Concepts.Animal;

public interface ICarnivorous extends IAnimal {
    @Override
    default boolean canConsume(IFood food) {
        return food instanceof Meat;
    }
}

