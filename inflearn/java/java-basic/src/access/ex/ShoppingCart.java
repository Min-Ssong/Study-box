package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;

    public void addItem(Item item){
        if(itemCount >= items.length){
            System.out.println("Cart is full");
            return;
        }

        items[itemCount] = item;
        itemCount++;
    }

    public void displayItems(){
        System.out.println("Item List");
        for(int i = 0; i < itemCount; i++){
            System.out.println("ItemName:" + items[i].getItemName() + " , totalPrice:" + items[i].getTotalPrice());
        }
        System.out.println("all Item Price : " + calculateTotalPrice());
    }

    private int calculateTotalPrice(){
        int totalPrice = 0;
        for(int i = 0; i < itemCount; i++){
            totalPrice += items[i].getTotalPrice();
        }
        return totalPrice;
    }
}
