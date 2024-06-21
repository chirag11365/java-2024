package old;
public class numtrn {
    public static void main(String[] args) {
        int n = 5;

        // outer loop
        for(int i= 1; i<=n; i++) {
            // inner loop 
            //for(int j=1; j<=i; j++) this was for 
            // previous one now its inverted more colm 
            for(int j=1; j<=n-i+1; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
     
}
