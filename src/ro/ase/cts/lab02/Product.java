package ro.ase.cts.lab02;

import ro.ase.cts.lab02.exceptions.DiscountAmountException;
import ro.ase.cts.lab02.exceptions.InvalidPriceValueException;
import ro.ase.cts.lab02.exceptions.PercentageValueException;
import ro.ase.cts.lab02.exceptions.StringMinLengthException;

class Product
{
    private int id;
    private String name; // len > 5
    private double price; // > 0
    private String description; // ex.: processor, memory, power, volume (for refrigerators etc); permite ""

    public Product(int id, String name, double price, String description)
    {
        try {
            this.id = id;
            this.name = name;
            this.price = price;
            this.description = description;

            if(name.length() <= 5)
                throw new StringMinLengthException();
            if(price < 0) {
                throw new InvalidPriceValueException();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public Product(Product p) {
        this.id = p.id;
        this.name = p.name;
        this.price = p.price;
        this.description = p.description;
    }

    public boolean equals(Product p)
    {
        if(p.id != this.id || !p.name.equals(this.name) || p.price != this.price || !p.description.equals(this.description))
            return false;

        return true;
    }

    public void applyPercentDiscount(float discountPercentage) {
        try {
            if(discountPercentage < 0 || discountPercentage > 1)
                throw new PercentageValueException();
            this.price -= this.price * discountPercentage;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void applyAmountDiscount(double discountAmount) {
        try {
            if(discountAmount < 0 || discountAmount > this.price)
                throw new DiscountAmountException();
            this.price -= discountAmount;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void increasePricePercentage(float increasePercentage) {
        this.price += this.price * increasePercentage;
    }

    public void increasePriceAmount(double increaseAmount) {
        this.price += increaseAmount;
    }

    public void setName(String name) {
        this.name = name;
    }
}
