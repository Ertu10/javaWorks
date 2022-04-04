package Interview;

public interface IHerbivorous extends IAnimal {
    @Override
    default boolean canConsume(IFood food) {
        return food instanceof Grass;
    }
}
