package ro.ase.cts.lab02.exceptions;

public class OrderProductQuantityException extends Exception{
    @Override
    public String getMessage() {
        return "Nu puteti avea mai mult de 99 de produse in comanda.";
    }
}
