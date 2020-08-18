package exercises;

import java.util.Scanner;

public class AliceTwo {
    public static void main(String[] args) {
        String excerpt = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having " +
                "nothing to do: once or twice she had peeped into the book her sister was reading, but it had no " +
                "pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures " +
                "or conversation?'";
        String search = "";
        Scanner input = new Scanner(System.in);

        System.out.print("Search term: ");
        search = input.next();
        //System.out.print(excerpt.contains(search));

        System.out.println("Index: " + excerpt.indexOf(search));
        System.out.println("Length: " + search.length());


        System.out.println(excerpt.replace(search, ""));
    }
}
