package restart;

public class bool {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        // left to right precendence
        System.out.println("FOR AND OPERATOR\tA :TALSE , B:FALSE");
        if (a && b) {
            System.out.println("yes");
        } else {
            System.out.println("NO");
        }
        System.out.println("\n");

        System.out.println("FOR OR OPERATOR \t A :TALSE , B:FALSE ");
        if (a || b) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        System.out.println("\n");
        System.out.println("\tfor NOT operator:");
        System.out.println("Not(a) is:" + (!a));

        System.out.println("Not(b) is:" + (!b));

    }
}
