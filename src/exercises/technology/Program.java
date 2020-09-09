package exercises.technology;

import org.w3c.dom.ls.LSOutput;

public class Program {

    public static void main(String[] args) {
        Computer comp = new Computer("Laptop", "Intel i7-7700K", "Windows 10 Home", "Lenovo", "X425", "LTP-7104X223NA", 16, 512, 14.1, 15000, false);
        System.out.println(comp.toString());

        Laptop lap = new Laptop("Laptop", "Intel i7-7700K", "Windows 10 Home", "Lenovo", "X425", "LTP-7104X223NA", 16, 512, 14.1, 15000, false, false, true, true, true, "Intel Iris Plus");
        System.out.println(lap.toString());

        int[] bands = {2,3,5,7,8,12,22,26,58,62,71};
        SmartPhone phone = new SmartPhone("SmartPhone", "Qualcomm Snapdragon 822", "Android 10", "LG", "G6", "H876", 6, 64, 5.61, 3810, true, 488, "89.7", true, false, false, bands);
        System.out.println(phone.toString());
    }

}
