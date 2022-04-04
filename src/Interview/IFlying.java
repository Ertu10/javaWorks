package Interview;

public interface IFlying {
    public default boolean canFly() {
        return true;
    }
}
