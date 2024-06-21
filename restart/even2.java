package restart;

import java.util.Scanner;

public class even2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the value of n from the user
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        // Initialize the sum to 0
        int sum = 0;

        // Calculate the sum of the first n even numbers
        int i = 0;
        while (i <= n) {
            if (i % 2 == 0) {
                sum += i;
            }
            i++;
        }

        // Print the sum
        System.out.println("The sum of the first " + n + " even numbers is: " + sum);

        scanner.close();
    }
}
