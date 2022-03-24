package ro.ase.cts.lab02;

import ro.ase.cts.lab02.exceptions.CartQuantityException;

class CartProduct extends Product {
    private int quantity;

    public CartProduct(int id, String name, double price, String description, int quantity) {
        super(id, name, price, description);
        this.quantity = quantity;
    }

    public CartProduct(Product product, int quantity) {
        super(product);
        this.quantity = quantity;
    }

    public void setQuantity(int quantity) {
        try {
            if(quantity < 0) {
                throw new CartQuantityException();
            }
            this.quantity = quantity;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
