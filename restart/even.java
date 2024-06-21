package restart;

import java.util.Scanner;

public class even {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        int sum = 0;
        int i = 0; // variable assign
        while (i <= n) {
            if (i % 2 == 0) {
                sum += i;
            }
            i++;
        }
        System.out.println("Sum of first 2+4+6+...+" + n + " even numbers is:" + sum);
    }
}
