package OOP_Concepts;

public class GasTank {
    double amount = 0;
    double capacity ;

    GasTank(double capacity){
        this.capacity = capacity;
    }
    public void addGas(double gas){
        if((gas+this.amount) > this.capacity){
            this.amount = capacity;
        }else{
            this.amount = this.amount + gas ;
        }
    }
    public void useGas(double gas){
        if((this.amount-gas) < 0){
            this.amount = 0;
        }else{
            this.amount = this.amount - gas ;
        }
    }
    public boolean isEmpty(){
        if(this.amount< 0.1){
            return true;
        }else{
            return false;
        }
    }
    public boolean isFull(){
        if(this.amount>(capacity-0.1)){
            return true;
        }else{
            return false;
        }
    }
    public double getGasLevel(){
        return this.amount;
    }
    public double fillUp(){
        double diff  = this.capacity - this.amount;
        this.amount = capacity;
        return diff;
    }

    public static void main(String[] args) {
        GasTank car = new GasTank(100);

        car.fillUp();
        car.useGas(45);
        System.out.println(car.fillUp());
    }

}
