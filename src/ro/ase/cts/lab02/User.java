package ro.ase.cts.lab02;

import ro.ase.cts.lab02.exceptions.NameLengthException;
import ro.ase.cts.lab02.exceptions.UsernameLengthException;

import java.util.ArrayList;

class User
{
    private String username; // min. 5 caractere
    private int id; // >= 1
    private String name; // >= 10 caractere
    private ArrayList<Order> orderHistory;
    private Cart shoppingCart;

    public User(String username, int id, String name)
    {
        try {
            this.username = username;
            this.id = id;
            this.name = name;
            orderHistory = new ArrayList<Order>();
            shoppingCart = new Cart();

            if(username.length() < 5) throw new UsernameLengthException();
            if(name.length() < 10) throw new NameLengthException();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void addOrderToHistory(Order order)
    {
        this.orderHistory.add(order);
    }

    public void addProductToShoppingCart(Product product)
    {
        this.shoppingCart.addProduct(product);
    }
}
