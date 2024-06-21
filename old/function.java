package old;
import java.util.*;

public class function {
    // public static int calculateSum(int a, int b) {
    //     int sum = a+ b;
    //     return sum;
    
    public static int calculateProduct(int a, int b) {
        return a*b;
    }

    //public static void printMyName(String name) {
       // System.out.println(name);
       // return;
     //}
    // camel case if each new word first word 
    //is in capital letter (by default)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String name  = sc.next();
        //printMyName(name); //call kiya fn ko

        int a = sc.nextInt();
        int b =sc.nextInt();

        System.out.println("The product of 2 numbers is "+ calculateProduct(a,b) );
    }
    
}
