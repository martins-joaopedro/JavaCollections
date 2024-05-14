package cart;

public class App {
    public static void main(String[] args) {
        
        Cart cart = new Cart();
        
        //expected Tomate 7x 
        cart.addItem("Tomate", 3.5, 2);
        cart.addItem("Tomate", 3.5, 5);
        cart.addItem("Maçã", 5, 5);
        cart.addItem("Sabonete", 10.0, 10);
    
        cart.getAllItems();

        cart.deleteItem("Maçã");
        cart.getAllItems();
        System.out.println("Total do carrinho: " + cart.getTotalValue());
        System.out.println();

        cart.addItem("Shampoo", 20.0, 2);
        cart.getAllItems();
        System.out.println("Total do carrinho: " + cart.getTotalValue());
    }
}
