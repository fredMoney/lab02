package ro.ase.cts.lab02.exceptions;

public class CartQuantityException extends Exception{
    @Override
    public String getMessage() {
        return "Cantitatea nu poate fi mai mica de 0.";
    }
}
