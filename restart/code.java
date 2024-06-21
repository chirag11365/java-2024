
package restart;

import java.util.Scanner;

public class code {
    public static void main(String[] args) {

        String name = "chirag";
        System.out.println(name);
        int a = 6;
        float b = 10.56f;
        System.out.printf("the value a is %d and the value of b is %.2f\n", a, b);
        // .2f shows decimal upto 2 decimal places
        // %d is format specifier

        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine(); // input as a string
        System.out.println(st);

    }

}
