package old;

public class loop {
    public static void main(String[] args) {
        for (int counter = 0; counter < 10; counter = counter + 1) {
            System.out.println("I AM THE BEST");
        }
        // 10 times i am the best print hoga

        for (int counter = 0; counter < 11; counter++) {
            System.out.print(counter + " ");
        }
        // counter ko i se replace kr skte hai
        // lets see

        for (int i = 0; i < 10; i = i + 1) {
            System.out.println("I AM THE BEST");
        }
        // yha sirf 10 tk print hoga coz i<10 h
        // jaisehi 11 hoga it will stop coming

        int i = 0;
        do {
            System.out.println(i);
            i = i + 1;
        } while (i < 11);

        int j = 12;
        while (j < 11) {
            System.out.println(" hello coder");
        }
        // yha code isliye nhi hua kyuki jab condition dekhi
        // then he saw tha it is already less than 11
        // then why to move further
        // but now lets move furthr how to make it write

        do {
            System.out.println(" hello coder");
        } while (i < 11);

        // note: here " do " atleast output de deta hai
        // make sure "do while" ke last me " ; "
        // dena mat bhulna
    }
}