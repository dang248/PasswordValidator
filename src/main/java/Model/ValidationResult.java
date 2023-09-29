package Model;


import InvalidPasswordException.InvalidPasswordException;

public class ValidationResult {
    private final boolean isValid;
    private InvalidPasswordException exception;

    public ValidationResult(boolean isValid, InvalidPasswordException exception){
        this.isValid = isValid;
        this.exception = exception;
    }

    public boolean isValid() {
        return isValid;
    }


    public InvalidPasswordException getException() {
        return exception;
    }

}
