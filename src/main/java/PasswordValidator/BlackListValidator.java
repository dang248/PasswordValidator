package PasswordValidator;

import InvalidPasswordException.BlackListException;
import Model.ValidationResult;

import java.util.List;

public class BlackListValidator implements PasswordValidator{
    private List<String> blackList;

    public List<String> getBlackList() {
        return blackList;
    }

    public void setBlackList(List<String> blackList) {
        this.blackList = blackList;
    }


    public BlackListValidator(List<String> blackList) {
        this.blackList = blackList;
    }

    @Override
     public ValidationResult checkPassword(String password) {
        for (String element : blackList) {
            if (password.contains(element.toLowerCase()))
            {
                return new ValidationResult(false, new BlackListException());
            }
        }
        return new ValidationResult(true, null);


    }
}
