package ro.ase.cts.lab02.exceptions;

public class InvalidPriceValueException extends Exception{
    @Override
    public String getMessage() {
        return "Valoarea pretului este invalida.";
    }
}
