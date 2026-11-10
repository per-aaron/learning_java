package bites.examples;

public class Penguin implements BirdInterface{
    @Override
    public void fly() {
        System.out.println("Try as you might, you seem to be unable to take off");
    }

    @Override
    public void sing() {
        System.out.println("Noot Noot!");
    }

    @Override
    public void eat() {
        System.out.println("You fish out some anchovies, now where's the olive oil?");
    }

    public static void main(String[] args) {
        Penguin pingu = new Penguin();
        pingu.fly();
        pingu.sing();
        pingu.eat();
    }
}
