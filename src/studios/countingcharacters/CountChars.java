package studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountChars {
    public static void main(String[] args) {
        String text = "If the product of two terms is zero then common sense says at least one of the two terms has " +
                "to be zero to start with. So if you move all the terms over to one side, you can put the quadratics " +
                "into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done " +
                "that, it’s pretty straightforward from there.";

        Scanner in = new Scanner(System.in);
        System.out.print("Enter your string here: ");
        text = in.nextLine().toLowerCase();

        char[] charArr = text.toCharArray();
        HashMap<Character, Integer> count = new HashMap<>();

        for (char letter : charArr){
            if (letter > 96 && letter < 123) {
                if(count.containsKey(letter)) {
                    count.put(letter, count.get(letter) + 1);
                } else {
                    count.put(letter, 1);
                }
            }
        }

        for(Map.Entry<Character, Integer> ch : count.entrySet()) {
            System.out.println(ch.getKey() + " : " + ch.getValue());
        }
    }
}
