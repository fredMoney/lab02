package ro.ase.cts.lab02;

import java.util.List;

class Cart {

    private List<CartProduct> products;
    private static final int DEFAULT_CART_QUANTITY = 1;

    public void addProduct(Product product) {
        CartProduct cartProduct = new CartProduct(product, DEFAULT_CART_QUANTITY);
        products.add(cartProduct);
    }
}
