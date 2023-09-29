package PasswordValidator;

import InvalidPasswordException.ExpirationException;
import Model.ValidationResult;

public class ExpirationValidator implements PasswordValidator{
    private boolean mustChange;
    public ExpirationValidator(boolean mustChange) {
        this.mustChange = mustChange;
    }

    @Override
     public ValidationResult checkPassword(String password) {
        if(mustChange) {
            return new ValidationResult(true, null);
        }
        return new ValidationResult(false, new ExpirationException());
    }

    public boolean isMustChange() {
        return mustChange;
    }

    public void setMustChange(boolean mustChange) {
        this.mustChange = mustChange;
    }
}
