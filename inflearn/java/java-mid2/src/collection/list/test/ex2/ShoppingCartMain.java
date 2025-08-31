package collection.list.test.ex2;

public class ShoppingCartMain {
    public static void main(String[] args) {
        ShoopingCart cart = new ShoopingCart();
        Item item1 = new Item("Garlic", 2000, 2);
        Item item2 = new Item("seed", 3000, 4);
        cart.addItem(item1);
        cart.addItem(item2);

        cart.displayItems();
    }
}
