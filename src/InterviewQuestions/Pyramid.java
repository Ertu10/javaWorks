package InterviewQuestions;

import java.util.Scanner;

//1
//232
//34543
//4567654
public class Pyramid {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int x ;
        for (int i = 0; i < n; i++) {
            x =i+1;
            for (int j=1; j <= 2*i+1 ; j++) {
                if(j>((2*i+1)/2)){
                    System.out.print(x);
                    x--;
                }
                else{
                    System.out.print(x);
                    x++;
                }
            }
            System.out.println();
        }
    }
}
