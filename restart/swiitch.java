package restart;

import java.util.Scanner;

public class swiitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE AGE:");
        int age = sc.nextInt();

        switch (age) {
            case 18:
                System.out.println("you are a student");
                break;

            case 21:
                System.out.println("you got an internship");
                break;

            case 23:
                System.out.println("you have got a job ");
                break;
            case 60:
                System.out.println("you are a retired from your job");
                break;
            default:
                System.out.println("enjoy your life");
                break;

        }
        System.out.println("THANKS FOR USING MY JAVA CODE");

    }
}
