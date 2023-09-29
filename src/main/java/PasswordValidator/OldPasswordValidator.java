package PasswordValidator;

import InvalidPasswordException.OldPasswordException;
import Model.ValidationResult;

import java.util.List;

public class OldPasswordValidator implements PasswordValidator{
    private List<String> oldPasswordList;
    public OldPasswordValidator(List<String> oldPasswordList) {
        this.oldPasswordList = oldPasswordList;
    }

    @Override
     public ValidationResult checkPassword(String password) {
        for (String oldPassword: oldPasswordList) {
            if(password.equals(oldPassword)) {
                return new ValidationResult(false, new OldPasswordException());
            }        
        }
        return new ValidationResult(true, null);
    }

    public List<String> getOldPasswordList() {
        return oldPasswordList;
    }

    public void setOldPasswordList(List<String> oldPasswordList) {
        this.oldPasswordList = oldPasswordList;
    }
}
