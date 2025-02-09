package class1.ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder[] products = new ProductOrder[3];
        ProductOrder dubu = new ProductOrder();
        dubu.productName = "dubu";
        dubu.price = 2000;
        dubu.quantity = 2;
        products[0] = dubu;

        ProductOrder gimch = new ProductOrder();
        gimch.productName = "gimch";
        gimch.price = 5000;
        gimch.quantity = 1;
        products[1] = gimch;

        ProductOrder corla = new ProductOrder();
        corla.productName = "corla";
        corla.price = 1500;
        corla.quantity = 2;
        products[2] = corla;

        int totalPrice = 0;
        for (ProductOrder product : products) {
            System.out.println("productName : " + product.productName + ", price : " + product.price + ", quantity : " + product.quantity);
            totalPrice += (product.price * product.quantity);
        }
        System.out.println("totalPrice : " + totalPrice);
    }
}
