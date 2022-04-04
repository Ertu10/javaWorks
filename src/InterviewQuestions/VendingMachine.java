package InterviewQuestions;

import javax.sound.midi.Soundbank;
import java.util.*;

public class VendingMachine {
    final static int[] coins = {1, 5, 10, 25};
    public static Map<String, Integer> products;
    public static String selectedProduct;
    public static List<String> moneys;

    static {
        products = new HashMap<>();
        products.put("Water", 40);
        products.put("Crisp", 65);
        products.put("Chocolate", 75);

        moneys = new ArrayList<>();
        moneys.add("0");
    }

    public static void main(String[] args) {

        System.out.println("Welcome VENDING MACHINE");
        System.out.println("-----MENU-----");
        System.out.println(products.keySet());
        System.out.println(products.values());
        System.out.println("--------------");
        System.out.println("for buying , please write just 'buy'!");
        System.out.println("you can cancel your process, please write just 'cancel'");
        System.out.println("only use these moneys 1, 5, 10, 25 ");
        System.out.println("Please insert money and select your product.");

        Scanner scan = new Scanner(System.in);
        boolean sit = true;
        while (sit) {
            if (check(scan.next(), coins)) {

            }
        }

    }

    public static boolean check(String money, int[] coins) {

        if (money.equalsIgnoreCase("cancel")) {
            cancel();//reset all thing and refunding total money that added by user.
            return false;
        }else if (products.containsKey(money)){
            selectedProduct = money;
            System.out.println("this product is "+ products.get(money)+"cent");
            return false;
        }
        else if(money.equalsIgnoreCase("buy")){
            buy();
            return false;
        }
        boolean test = false;
        for (int coin : coins) {
            try {
                if (Integer.parseInt(money) == coin) {
                    test = true;
                    moneys.add(money);
                    break;
                } else {
                    test = false;
                }
            } catch (NumberFormatException e) {
                System.out.println("Please write valid command");
                return false;
            }

        }
        if (test == false)
            System.out.println("Please add just valid money");
        return test;
    }

    private static void buy() {

        if(selectedProduct==null) {
            System.out.println("please firstly select product");
            return;
        }
        int totalMoney = calculateMoney(moneys);
        Integer price = products.get(selectedProduct);

        if (calculateMoney(moneys)>=products.get(selectedProduct)){
            System.out.println("Bon appetit!!! Change is "+ (totalMoney- price)+ "cent");
            moneys.clear();moneys.add("0");


        }else{
            System.out.println("your money is not enough for this product please add");
        }
    }

    private static void cancel() {
        selectedProduct = null;
        int totalMoney = calculateMoney(moneys);
        moneys.clear();moneys.add("0");
        System.out.println("refunding " + totalMoney+ "cent please take your money");
    }

    //just calculate total money that added by user
    private static int calculateMoney(List<String> moneys) {
        int amount = 0;
        for (String money : moneys) {
            amount = amount + Integer.parseInt(money);
        }
        return amount;
    }
}
