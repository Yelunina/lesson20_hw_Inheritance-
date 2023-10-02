package ait.computer;

import ait.computer.model.Computer;
import ait.computer.model.Laptop;
import ait.computer.model.Smartphone;

public class ComputerAppl {
    public static void main(String[] args) {
        Computer[] shop = new Computer[4];
        shop[0] = new Computer("i5", 12, 512, "HP");
        shop[1] = new Laptop("i7", 16, 512, "Asus", 3, 2.1);
        shop[2] = new Laptop("i7", 24, 1024, "Asus", 3, 2.1);
        shop[3] = new Smartphone("i3", 7, 265, "Iphone", 24, 0.34, 12345678);
        shop[0].setRam(24);
        for (int i = 0; i < shop.length; i++) {
            System.out.println(shop[i]);
        }
    }
}