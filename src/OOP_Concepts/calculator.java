package OOP_Concepts;


public class calculator {
    String name ="HesapMakinası";
    public static int plus(int a, int b){
        return a+b;
    }
    public static int minus(int a, int b){
        return Math.abs(a-b);
    }

    public void doubleName(){
        System.out.println(name.repeat(2));
    }
}
