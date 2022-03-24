package ro.ase.cts.lab02.exceptions;

public class PercentageValueException extends Exception{
    @Override
    public String getMessage() {
        return "Parametrul nu este procent.";
    }
}
