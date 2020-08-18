package exercises;

import java.util.Scanner;

public class MPG {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many miles have you traveled? ");
        double miles = input.nextDouble();
        System.out.print("How many gallons of gas have you consumed while traveling that distance? ");
        double gas = input.nextDouble();
        double mpg = miles/gas;
        System.out.println("Your vehicle gets " + mpg + " mpg.");
        input.close();

    }
}
