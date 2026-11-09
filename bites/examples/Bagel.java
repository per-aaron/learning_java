package bites.examples;

public class Bagel {
    String seeds;
    String filling;
    Integer price;

    public static void main(String[] args) {
        Bagel firstBagel = new Bagel("sesame", "tofu paté and kimchi", 5);
        System.out.println(firstBagel.getSeeds());
        System.out.println(firstBagel.getFilling());
        System.out.println(firstBagel.getPrice());
    }

    public Bagel(String seeds, String filling, Integer price) {
        this.seeds = seeds;
        this.filling = filling;
        this.price = price;
    }

    public String getSeeds() {
        return this.seeds;
    }

    public String getFilling() {
        return this.filling;
    }

    public Integer getPrice() {
        return this.price;
    }
}
