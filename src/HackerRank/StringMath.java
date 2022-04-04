package HackerRank;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.*;

public class StringMath {
    public static String StringChallenge(String str) {
        Map<String, String> numbers = new HashMap<>();
        numbers.put("zero","0");numbers.put("one","1");numbers.put("two","2");
        numbers.put("three","3");numbers.put("four","4");numbers.put("five","5");
        numbers.put("six","6");numbers.put("seven","7");numbers.put("eight","8");
        numbers.put("nine","9");numbers.put("minus","-");numbers.put("plus","+");
        numbers.put("-","negative");


        String op="";
        String str1="";
        for(int i= 0 ; i<str.length(); i++){
            str1=str1+str.charAt(i);
            if(numbers.keySet().contains(str1)){
                op = op + numbers.get(str1);
                str1="";
            }
        }
        String temp= "";

        System.out.println("op = " + op);

        String[] num = op.split("[+,-]");
        int res = Integer.parseInt(num[0]);
        System.out.println(Arrays.toString(num));
        for( int i = 0 ; i<num.length ; i++ ){
           if(i!=num.length-1) {
               if (String.valueOf(op.charAt(op.indexOf(num[i]) + num[i].length())).equals("+")) {
                   res = res + Integer.parseInt(num[i + 1]);
               } else if (String.valueOf(op.charAt(op.indexOf(num[i]) + num[i].length())).equals("-")) {
                   res = res - Integer.parseInt(num[i + 1]);
               }
           }
        }
        System.out.println(res);
        String son ="";
        String a = String.valueOf(res);

        return a;
    }

    public static void main(String[] args) {
        StringChallenge("sevensixminussevenplusfourfive");
    }

}
