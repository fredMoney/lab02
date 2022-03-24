package ro.ase.cts.lab02;

import ro.ase.cts.lab02.exceptions.OrderProductQuantityException;

import java.util.ArrayList;

class Order
{
    private ArrayList<Product> products;
    private String address;

    public Order()
    {
        products = new ArrayList<Product>();
    }
    public void addProduct(Product p)
    {
        try {
            if(products.size() > 99)
                throw new OrderProductQuantityException();

            products.add(p);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void removeProduct(Product p)
    {
        products.remove(p);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String addr) {
        this.address = addr;
    }
}
