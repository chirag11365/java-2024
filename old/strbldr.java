package old;


public class strbldr { 
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("CHIRAG");
        System.out.println(sb);

        // char at index 0
        //  if u want to print the selected index of any number 
        System.out.println(sb.charAt(0));

        // set char at index 0 
        sb.setCharAt(0, 'A');
        System.out.println(sb);

        // insert char at index
        sb.insert(4, 'A');
        System.out.println(sb);

    }
    
}
