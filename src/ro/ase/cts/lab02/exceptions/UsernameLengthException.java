package ro.ase.cts.lab02.exceptions;

public class UsernameLengthException extends Exception{
    @Override
    public String getMessage() {
        return "Username-ul trebuie sa aiba minim 5 caractere.";
    }
}
