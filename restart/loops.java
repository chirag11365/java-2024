package restart;

public class loops {
    public static void main(String[] args) {
        System.out.println("using while loops:");
        // while me ek variable assign hota h, aur uspe ek condn apply hota h
        // aur ek baad ek add hote jata h !
        // pehele ticket dikhao :)

        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }

        // do while loop : is guranted to execute the code atleast once
        System.out.println("lets see do while loop");
        int j = 0;
        do {
            // bina condn check kiye ghus gya
            // 1st code excute 2nd then condition check
            System.out.println(j);
            j++;
        } while (j <= 5); // till when

        // for loop
        System.out.println("using for loop");
        for (int k = 0; k < 5; k++) {
            System.err.println(k);
        }
        System.out.println("\nlets see another way:");
        int n = 5;
        for (int p = 0; p <= 2 * n; p++) {
            System.out.println(2 * p + 1);
        }

    }

}
