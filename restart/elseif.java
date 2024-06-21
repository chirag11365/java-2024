package restart;

import java.util.Scanner;

public class elseif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE AGE:");
        int age = sc.nextInt();
        if (age > 56) {
            System.out.println("You are experienced!");
        } else if (age > 46) {
            System.out.println("You are semi-experienced!");
        } else if (age > 36) {
            System.out.println("You are less-experienced!");

        } else {
            System.out.println("YOU dont have any experience :)");
        }
    }
}
