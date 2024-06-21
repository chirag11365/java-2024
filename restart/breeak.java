package restart;

import java.util.Scanner;

public class breeak {
    public static void main(String[] args) {
        System.out.println(("enter the number:"));
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
            System.out.println("java is great");
            if (i == 2) {
                System.out.println("end");
                break;
            }
        }
    }
}
