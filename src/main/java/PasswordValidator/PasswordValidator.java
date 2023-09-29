package PasswordValidator;

import Model.UserDatabase;
import Model.ValidationResult;

import java.util.List;

public interface PasswordValidator {
    ValidationResult checkPassword(String password);
}
