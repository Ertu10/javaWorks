package Interview;

public interface IOmnivorous extends IAnimal {
    @Override
    default boolean canConsume(IFood food) {

        return true;
    }
}
