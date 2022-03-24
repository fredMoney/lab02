package ro.ase.cts.lab02.exceptions;

public class IdentifierValueException extends Exception{
    @Override
    public String getMessage() {
        return "Id-ul exista deja.";
    }
}
