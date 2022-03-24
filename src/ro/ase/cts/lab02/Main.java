package ro.ase.cts.lab02;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        OnlineShop onlineShop = new OnlineShop("Emag", "logo.jpg", new ArrayList<Product>());

        Product p1 = new Product(1123, "Laptop", 3200.5, "");
        Product p2 = new Product(1245, "Frigider", 207.95, "");

        Product p3 = new Product(p1);

        // p3.setQty(5); ???
        p3.setName("Paine");

        onlineShop.modifyProductsList(1,p1);
        onlineShop.modifyProductsList(1,p2);

        onlineShop.modifyProductsList(2, p1);
        System.out.println(p1.equals(p2));
    }
}
