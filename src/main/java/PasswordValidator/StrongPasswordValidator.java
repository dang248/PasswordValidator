package PasswordValidator;

import InvalidPasswordException.StrongPasswordException;
import Model.ValidationResult;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StrongPasswordValidator implements PasswordValidator{
    public StrongPasswordValidator() {}

    @Override
    public ValidationResult checkPassword(String password) {
        String dateTimePattern = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*]).{8,}$";
        Pattern pattern = Pattern.compile(dateTimePattern);
        Matcher matcher = pattern.matcher(password);
        if (!matcher.matches())
        {
            return new ValidationResult(false, new StrongPasswordException());

        }
        return new ValidationResult(true, null);
    }
}
