package restart;

import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        System.out.println("\t\tWELCOME\n\t  INFANT JESUS SCHOOL");
        System.out.println("\t\nENTER YOUR MARKS BELOW:\n");

        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER MATHS MARKS : ");
        int m = sc.nextInt();

        System.out.println("ENTER PHYSICS MARKS :");
        int p = sc.nextInt();

        System.out.println("ENTER CHEMISTRY MARKS :");
        int c = sc.nextInt();

        System.out.println("ENTER CS MARKS :");
        int q = sc.nextInt();

        int total = (m + p + c + q);
        int avg = (m + p + c + q) / 4;
        System.out.println("\nYOUR TOTAL MARKS IS:" + total + "/500");
        System.out.println("YOUR PERCENTAGE MARKS IS : " + avg + "%");
        System.out.println("\nthank you\nMADE BY CHIRAG :)");
    }
}
