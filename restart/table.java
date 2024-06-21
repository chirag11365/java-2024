package restart;

import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the table u want :");
        int a = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(a + " x " + i + " = " + a * i);
        }
        System.out.println("thanku for using java:)");

    }

}
