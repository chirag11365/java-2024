package restart;

public class strps3 {
    public static void main(String[] args) {
        // ques1
        String name = "Peter Parker";
        System.out.println(name.toLowerCase());

        // ques2
        System.out.println(name.replace(" ", "_"));

        // ques3
        String letter = "Dear <|name|>, Thanks a lot!";
        System.out.println(letter.replace("<|name|>", "Chirag"));

        // ques4
        String myString = "This string contains double and   triple spaces";
        System.out.println(myString.indexOf("  "));
        // if -1 then no vacant spaces available

        // ques5
        String myLetter = "Dear <|name|>, Thanks a lot!";
        System.out.println(myLetter.replace("<|name|>", "Chirag"));

    }
}
