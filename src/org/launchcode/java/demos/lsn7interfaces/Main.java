package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();

        flavors.sort(new FlavorComparator());

        cones.sort(new ConeComparator());

        printArray(flavors);
        System.out.println("\n");
        printArray(cones);
    }

    public static <T extends Ingredient> void printArray(ArrayList<T> arr){
        for (T item : arr) {
            Ingredient ing = (Ingredient) item;
            System.out.println(ing.getName() + ": " + ing.getCost());
        }
    }
}
