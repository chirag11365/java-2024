package restart;

import java.util.Scanner;

public class ques {
    public static void main(String[] args) {
        /*
         * float a = 7 / 4 * 9 / 2;
         * System.out.println(a);
         * 
         * float i = (float) 20.5;
         * System.out.println("incorrect marks is:" + (i + 8));
         * System.out.println("corrected marks is:");
         * System.out.println(i - 8);
         * 
         * System.out.println("enter the number");
         * Scanner sc = new Scanner(System.in);
         * int num = sc.nextInt();
         * int user = 40;
         * if (num > user) {
         * System.out.println("number is greater than 40");
         * } else {
         * System.out.println("number is less than 40");
         * }
         */
        // ques2
        System.out.println("The 3rd law of kinematics");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter velocity (m/s):");
        double v = sc.nextInt();

        System.out.println("enter initial velocity (m/s):");
        double u = sc.nextInt();

        System.out.println("enter acceleration (m/s2):");
        double a = sc.nextInt();

        System.out.println("enter distance (m):");
        double s = sc.nextInt();

        double value = (v * v - u * u) / (2 * a * s);
        System.out.println("the value is :" + value);

        System.out.println("\nthankyou keep coding");

    }

}
