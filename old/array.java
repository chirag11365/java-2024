import java.util.*;

public class array {
    public static void main(String[] args) {
        int[] marks = new int[3];
        // or either u can write it as 
        //int marks[] = new int[3];

        marks[0] = 97; // chem 
        marks[1] = 85; // maths
        marks[2] = 76; // english

        // System.out.println(marks[0]);
        // System.out.println(marks[1]); 
        // System.out.println(marks[2]);
        // utna kon likhna jaye 
        // hm loop lga k ke bhi kr skte h 


        for(int i=0; i<3; i++) {
            System.out.println(marks[i]);

        }
        
    }
    
}
