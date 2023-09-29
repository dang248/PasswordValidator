package PasswordValidator;

import InvalidPasswordException.FirstLoginException;
import Model.ValidationResult;

public class FirstLoginValidator implements PasswordValidator{
    private String defaultPassword; 
    public FirstLoginValidator(String defaultPassword) {
        this.defaultPassword = defaultPassword;
    }

    @Override
     public ValidationResult checkPassword(String password) {
        if(password.equals(defaultPassword)) {
            return new ValidationResult(false, new FirstLoginException());
        }       
        return new ValidationResult(true, null);
    }

    public String getDefaultPassword() {
        return defaultPassword;
    }

    public void setDefaultPassword(String defaultPassword) {
        this.defaultPassword = defaultPassword;
    }
}
