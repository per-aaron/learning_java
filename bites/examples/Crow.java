package bites.examples;

import java.util.Random;

public class Crow implements BirdInterface{
    Random rand = new Random();
    @Override
    public void fly() {
        int n = rand.nextInt(3);
        if (n == 0){
            System.out.println("It's migration season, you travel 100 miles today");
        } else {
            System.out.println("You travel 10 miles, as the crow flies");
        }
    }

    @Override
    public void sing() {
        System.out.println("CAWWW");
    }

    @Override
    public void eat() {
        int n = rand.nextInt(2);
        if (n == 1) {
            System.out.println("Early bird gets the worm!");
        } else {
            System.out.println("Oops, you overslept, no worms to be found");
        }

    }

    public static void main(String[] args) {
        Crow maggie = new Crow();
        maggie.fly();
        maggie.sing();
        maggie.eat();
        System.out.println("Day 2");
        maggie.fly();
        maggie.sing();
        maggie.eat();
    }
}
