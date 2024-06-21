package restart;

import java.util.Scanner;

public class revtable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int a = sc.nextInt();
        for (int i = 10; i >= 1; i--) {
           // System.out.println(a + " x " + i + " = " + a * i);
            System.out.printf("\n%d x %d = %d\n", a, i, a * i);

        }

    }
}
