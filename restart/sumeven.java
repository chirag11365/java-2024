package restart;

import java.util.Scanner;

public class sumeven {
    public static void main(String[] args) {
        System.out.println("enter the value if n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += (2 * i);

        }
        System.out.println("sum of even num 0+2+4+...+ = " + sum);

    }

}
