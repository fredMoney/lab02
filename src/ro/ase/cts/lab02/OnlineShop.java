package ro.ase.cts.lab02;

import java.util.ArrayList;

class OnlineShop {
    private String onlineShopName;
    private String imageFileName;
    private ArrayList<Product> products;

    OnlineShop(String name, String img, ArrayList<Product> products)
    {
        this.products = new ArrayList<Product>();
        this.imageFileName = img;
        this.onlineShopName = name;
    }

    public void modifyProductsList(int what, Product p)
    {
        if(what == 1)
        {
            this.products.add(p);
        }
        else
            this.products.remove(p);
    }


}