package restart;

public class random {
    public static void main(String[] args) {
        while (true) {
            int a = (int) (Math.random() * 10 + 1);
            System.out.println(a);
            if (a == 5) {
                break;

            }
            if (a % 4 == 0) {
                continue;
            }
            System.out.println("hello");
        }

    }
}
