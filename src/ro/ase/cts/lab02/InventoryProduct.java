package ro.ase.cts.lab02;

class InventoryProduct
{
    private Product product;
    private int quantity;

    public InventoryProduct(Product p, int q)
    {
        this.product = new Product(p);
        this.quantity = q;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int q) {
        this.quantity = q;
    }
}
