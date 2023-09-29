package PasswordValidator;

import InvalidPasswordException.AccountLockException;
import InvalidPasswordException.BlackListException;
import Model.ValidationResult;

public class AccountLockValidator implements PasswordValidator{
    private boolean lockAccount;
    public AccountLockValidator(boolean lockAccount) {
        this.lockAccount = lockAccount;
    }

    @Override
    public ValidationResult checkPassword(String password) {
        if(lockAccount) {
            return new ValidationResult(true, null);
        }
        return new ValidationResult(false, new AccountLockException());
    }

    public boolean isLockAccount() {
        return lockAccount;
    }

    public void setLockAccount(boolean lockAccount) {
        this.lockAccount = lockAccount;
    }
}
