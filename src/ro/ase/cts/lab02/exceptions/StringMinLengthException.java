package ro.ase.cts.lab02.exceptions;

public class StringMinLengthException extends Exception{
    @Override
    public String getMessage() {
        return "Lungimea numelui produsului este prea mica.";
    }
}
