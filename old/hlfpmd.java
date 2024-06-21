package old;
public class hlfpmd {
    public static void main(String [] args) {
        int n=4;

        // outer loop
        
        // ** for(int i = 1; i<=n; i++) 

        // that is for L TRINGULAR PMD I++
        // BUT NOW LETS SAY THE PMD GOT INVERTED THEN 
        // FOR INV PMD 
        // outer looop for inv pmd
        for(int i = n; i>=1; i--)
        
           //inner loop
           {
            for(int j = 1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }    
}
