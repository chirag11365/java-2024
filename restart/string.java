package restart;

public class string {
    public static void main(String[] args) {
        String name = "Chirag Verma";
        int value = name.length();

        System.out.println(value);

        String lc = name.toLowerCase();
        System.out.println(lc);

        String uc = name.toUpperCase();
        System.out.println(uc);

        String nontrimmedString = "   hello   ";
        System.out.println(nontrimmedString);
        String trim = nontrimmedString.trim();
        System.out.println(trim);

        System.out.println(name.substring(1, 5));
        System.out.println(name.replace('r', 'l'));

        System.out.println(name.startsWith("Chira"));
        // it see capital letter too durng start or end
        System.out.println(name.endsWith("verma"));
        // its ending with Verma
        // in order to check the location will give the letter
        System.out.println(name.charAt(3));

        // in order to give
    }

}