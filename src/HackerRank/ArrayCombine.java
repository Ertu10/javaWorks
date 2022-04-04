package HackerRank;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayCombine {
    public static String ArrayChallenge(int[] arr) {
        int amount = 0;
        int largest = arr[0];
        for (int a : arr) {
            if (a > largest) {
                largest = a;
            }
        }

        ArrayList<Integer> com = new ArrayList<>();
        for (int a : arr) {
            if (a == largest)
                continue;
            else
                com.add(a);
        }

        for (int a : com) {
            amount = amount + a;
        }

        if (amount == largest) {
            return "true";
        } else {
            int diff = amount - largest;
            if (com.contains(diff))
                return "true";
            else
                return "false";

        }

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        //System.out.print(ArrayChallenge(s.nextLine()));
    }

}
