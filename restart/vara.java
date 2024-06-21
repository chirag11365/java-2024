package restart;

import java.util.Scanner;

public class vara {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NAME:");
        String var = sc.nextLine();
        switch (var) {

            case "shubahm":
                System.out.println("hi shubahm nice to see you :)");
                break;

            case "chirag":
                System.out.println("hi chirag nice to see you :)");
                break;

            case "rohit":
                System.out.println("hi rohit nice to see you :)");
                break;
            case "kritika":
                System.out.println("hi kritika nice to see you :)");
                break;
            case "sunny":
                System.out.println("hi sunny nice to see you :)");
                break;

            default:
                System.out.println("hey baby enjoy your life :)\n thanks for visiting my code:)");
                break;
        }

    }

}
