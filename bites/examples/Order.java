package bites.examples;

public class Order {
    Integer total = 0;

    public static void main(String[] args){
        Order myOrder = new Order();
        myOrder.addAmount(15);
        myOrder.addDiscount(3);
        System.out.println(myOrder.getTotal());
        System.out.println(myOrder.friendlyTotal());
    }

    public void addAmount(Integer number) {
        this.total += number;
    }

    public void addDiscount(Integer number) {
        this.total -= number;
    }

    public Integer getTotal() {
        return this.total;
    }

    public String friendlyTotal() {
        return String.format("Thanks! The value of your order is £%d", this.total);
    }
}
