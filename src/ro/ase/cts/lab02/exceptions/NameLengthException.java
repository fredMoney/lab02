package ro.ase.cts.lab02.exceptions;

public class NameLengthException extends Exception{
    @Override
    public String getMessage() {
        return "Numele trebuie sa aiba minim 10 caractere.";
    }
}
