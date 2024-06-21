package restart;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        // ques1
        int a = 10, b = 20;
        int sum = a + b;
        System.out.println(sum);

        // ques2
        float p = 57, q = 67, r = 89;
        float cgpa = (p + q + r) / 30;
        System.out.println(cgpa);

        // ques3
        System.out.println("what is your name :");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("hello!" + name + " have a nice day dude.");

        // ques 4
        System.out.println("enter your number in km :");
        int num = sc.nextInt();
        float mile = (float) 0.62137119;
        float km = num * mile;
        System.out.println("the conversion in mile is given below:\n");
        System.out.println(km);

        // ques 5
        // to check whether the number is integer or not :
        System.out.println("enter the number:");
        Scanner st = new Scanner(System.in);
        System.out.println(st.hasNextInt());

    }
}
