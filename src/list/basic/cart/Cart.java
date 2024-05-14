package cart;

import java.util.ArrayList;

public class Cart {
    
    private ArrayList<Item> items = new ArrayList<>();

    public void addItem(String name, double price, int amount) {
        //iterate the list looking for this item to increase its value
        boolean wasIncreased = false;
        for(Item i : items)
            if((i.getName() == name) && (i.getPrice() == price)) {
                i.increaseValue(amount);
                wasIncreased = true;
            }
        //if dont exists that item in cart
        if(!wasIncreased)
            items.add(new Item(name, price, amount));
    }

    public void deleteItem(String name) {
        for(Item i : items)
            if((i.getName() == name) ) {
                i.decreaseValue(1);

                if(i.getAmount() == 0) {
                    items.remove(i);
                }
            }
    }

    public String getTotalValue() {
        double sum = 0;
        for(Item i : items) 
            sum += i.getPrice() * i.getAmount();
        
        return String.format("%.2f", sum);   
    }

    public void getAllItems() {
        for(Item i : items) {
            System.out.println(i.toString());
        }
        System.out.println("------------------");
    }   
}
