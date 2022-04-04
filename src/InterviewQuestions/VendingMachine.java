package InterviewQuestions;

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
        products.put("Albeni", 50);

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
            check(scan.next(), coins);


        }

    }

    public static boolean check(String input, int[] coins) {

        if (input.equalsIgnoreCase("cancel")) {
            cancel();//reset all thing and refunding total input that added by user.
            return false;
        }else if (products.containsKey(input)){
            selectedProduct = input;
            System.out.println("this product is "+ products.get(input)+"cent");
            return false;
        }
        else if(input.equalsIgnoreCase("buy")){
            buy();
            return false;
        }
        boolean test = false;
        for (int coin : coins) {
            try {
                if (Integer.parseInt(input) == coin) {
                    test = true;
                    moneys.add(input);
                    System.out.println("your balance: " + calculateMoney(moneys));
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
            System.out.println("Please add just valid input");
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
            selectedProduct = null;


        }else{
            System.out.println("your money is not enough for this product please add "+ (products.get(selectedProduct)-calculateMoney(moneys)));
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
