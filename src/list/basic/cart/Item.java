package cart;

public class Item {
 
    private String name;
    private double price;
    private int amount;

    Item(String n, double p, int a) {
        this.name = n;
        this.price = p;
        this.amount = a;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

    public void increaseValue(int value) {
        this.amount += value;
    }

    public void decreaseValue(int value) {
        this.amount -= value;
    }

    @Override
    public String toString() {
        return "( " + this.amount + "x ) [ " + this.name + " - R$: " + this.price + " ]";
    }
}
