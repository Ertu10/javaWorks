package OOP_Concepts;

public class SavingAccount extends BankAccount{
    private double interestRate ;

    public SavingAccount(double rate){
        this.interestRate = rate;
    }
    public double getInterestRate() {
        return interestRate;
    }
    public double revenue(){
        return this.amount*this.interestRate;
    }
}
class BankTest{
    public static void main(String[] args) {
        SavingAccount ertu = new SavingAccount(1.8);
        System.out.println(ertu.add(100));
        System.out.println(ertu.revenue());



    }
}