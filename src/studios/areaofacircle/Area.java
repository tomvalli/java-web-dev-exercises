package studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double pi = 3.14;
        double r;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a radius: ");
        r = in.nextDouble();
        System.out.println(pi * r * r);
    }
}
