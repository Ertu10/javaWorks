package OOP_Concepts;

public class calcTest {
    public static void main(String[] args) {
        int firstNumber = 9;
        int secondNumber = 13;

        System.out.println("calculator.minus(firstNumber,secondNumber) = " + calculator.minus(firstNumber, secondNumber));
        System.out.println(calculator.plus(5, 18));
        calculator cal = new calculator();
        cal.doubleName();
        cal.plus(5,7);
    }
}
