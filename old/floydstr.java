package old;
public class floydstr {
    public static void main(String[] args) {
      int n = 5;
      int m = 1; 
      
      // outer loop 
      for(int i=1;i<=n; i++) {
        // inner lop 
        for(int j=1; j<=i; j++) {
          System.out.print(m+" ");
          m++; //m = m+1
        }
        System.out.println();
      }

    }
    
}
