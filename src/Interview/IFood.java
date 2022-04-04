package Interview;

public interface IFood {
    default void consume(){
        System.out.println("Consumed");
    }
}

