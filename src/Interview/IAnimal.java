package Interview;

public interface IAnimal {
    default  boolean eat(IFood food){
        if(!canConsume(food)){
            return false;
        }
        food.consume();
        return true;
    }
    boolean canConsume(IFood food);
}
