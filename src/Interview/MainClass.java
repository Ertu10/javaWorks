package Interview;

public class MainClass {
    public static void main(String[] args) {
        IAnimal animal = new Horse() ;
        Horse horse = new Horse();
        Lion lion = new Lion();
        Bear bear = new Bear();

        IFood food = new IFood() {};
        Meat meat = new Meat();
        Grass grass = new Grass();

        System.out.println(animal.eat(food));
        System.out.println(animal.eat(meat));
        System.out.println(animal.eat(grass));

        System.out.println("----------------");


        System.out.println(horse.eat(food));//f
        System.out.println(horse.eat(meat));//f
        System.out.println(horse.eat(grass));//t
        System.out.println(horse.canFly());//t

        System.out.println("----------------");
        System.out.println(lion.eat(food));//f
        System.out.println(lion.eat(meat));//f
        System.out.println(lion.eat(grass));//t
        System.out.println(lion.canRoar());//t

        System.out.println("----------------");
        System.out.println(bear.eat(food));//f
        System.out.println(bear.eat(meat));//f
        System.out.println(bear.eat(grass));//t
        System.out.println(bear.canRoar());//t

    }
}
