package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args){
        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(1);
        arrList.add(1);
        arrList.add(2);
        arrList.add(4);
        arrList.add(5);
        arrList.add(6);
        arrList.add(7);
        arrList.add(10);

        System.out.println(sumArr(arrList));

        String suess = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";
        String[] suessArr = suess.split(" ");
        for (int i = 0; i < suessArr.length; i++) {
            suessArr[i] = suessArr[i].trim();
            if (suessArr[i].contains(".")) {
                suessArr[i] = suessArr[i].replace(".", "");
            }
        }
        ArrayList<String> suessArrL = new ArrayList<String>(Arrays.asList(suessArr));

        Scanner in = new Scanner(System.in);
        System.out.print("How many letters are you looking for? ");
        int input = in.nextInt();
        countLetters(suessArrL, input);
    }

    public static int sumArr(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i : arr) {
            sum = (i % 2 == 0) ? (sum += i): (sum = sum);
        }
        return sum;
    }

    public static void countLetters(ArrayList<String> arr, int count) {
        for (String word : arr) {
            if (word.length() == count) {
                System.out.println(word);
            }
        }
    }


}
