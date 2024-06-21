package restart;

import java.util.Scanner;

public class accl {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the final velocity (v): ");
        double v = sc.nextDouble();

        System.out.println("Enter the initial velocity (u): ");
        double u = sc.nextDouble();

        System.out.println("Enter the acceleration (a): ");
        double a = sc.nextDouble();

        System.out.println("Enter the displacement (s): ");
        double s = sc.nextDouble();

        double result = (v * v - u * u) / (2 * a * s);

        System.out.println("The result is: " + result);
    }
}
