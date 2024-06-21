package restart;

import java.util.Scanner;

public class marks2 {
    public static void main(String[] args) {
        System.out.println("Enter the marks of Physics, Chemistry and Maths");

        Scanner sc = new Scanner(System.in);
        int PHYSICS = sc.nextInt();
        int CHEMISTRY = sc.nextInt();
        int MATHS = sc.nextInt();

        int total = PHYSICS + CHEMISTRY + MATHS;
        float percentage = (total / 3);
        if (PHYSICS < 33 || CHEMISTRY < 33 || MATHS < 33) {
            System.out.println("You are fail");
        } else if (percentage < 40) {
            System.out.println("You are fail");
        } else {
            System.out.println("You are pass");
        }

    }
}
