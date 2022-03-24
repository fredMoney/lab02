package ro.ase.cts.lab02.exceptions;

public class DiscountAmountException extends Exception{
    @Override
    public String getMessage() {
        return "Valoarea discountului este invalida.";
    }
}
