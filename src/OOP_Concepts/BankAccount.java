package OOP_Concepts;

public class BankAccount {
    int amount = 0;

    public int add(int money){
        this.amount += money;
        return amount;
    }
}
