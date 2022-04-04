package InterviewQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class AntiClockl {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int [][] cube = new int[n][n];
        System.out.println(cube.length);
        int x = 1;
        for (int i = 0; i < cube.length; i++) {
            for (int j = 0; j < cube.length; j++) {
                cube[i][j] = x++;
            }
        }
        System.out.println(Arrays.deepToString(cube));
        int a = n;
        for (int i = 0; i < n; i++) {
            int number = a;
            for (int j = 0; j < n; j++) {
                cube[i][j] = number;
                number = number + n;
            }
            a--;
        }
        System.out.println(Arrays.deepToString(cube));
//        int d = n-1;
//        for (int i = 0; i < n; i++) {
//            int f = 0;
//            for (int j = 0; j < n; j++) {
//                System.out.print(cube[f][d]);
//                f++;
//            }
//            d--;
//            System.out.println();
//        }
        /////////////////////
//        int j = n-1;
//        for (int i = 0; i < n; i++) {
//            if(i==3){
//                i=0;
//                System.out.println();
//            }
//            System.out.print(cube[i][j]);
//
//        }
        }

}
