package bites.examples;

import java.util.Random;

public class Gull implements BirdInterface{
    Random rand = new Random();
    @Override
    public void fly() {
        int n = rand.nextInt(3);
        if (n > 0){
            System.out.println("There is a strong tailwind, you travel 200 miles today");
        } else {
            System.out.println("Storms at sea today, you travel 30 miles inland");
        }
    }

    @Override
    public void sing() {
        int n = rand.nextInt(3);
        if (n == 0){
            System.out.println("kee-yah!");
        } else if (n == 1) {
            System.out.println("ke-ke-ke-ke");
        } else {
            System.out.println("Haw-haw-haw");
        }
    }

    @Override
    public void eat() {
        int n = rand.nextInt(4);
        if (n == 0){
            System.out.println("You find an unsuspecting tourist, that's plus one chip butty!");
        } else {
            System.out.println("You scoop a mackerel out of the drink");
        }
    }

    public static void main(String[] args) {
        Gull seagull = new Gull();
        seagull.fly();
        seagull.sing();
        seagull.eat();
    }
}
