package PasswordValidator;

import InvalidPasswordException.BlackListException;
import InvalidPasswordException.PersonalDataException;
import Model.UserData;
import Model.UserDatabase;
import Model.ValidationResult;

public class PersonalDataValidator implements PasswordValidator{
    private  UserDatabase userDatabase;

    public UserDatabase getUserDatabase() {
        return userDatabase;
    }

    public void setUserDatabase(UserDatabase userDatabase) {
        this.userDatabase = userDatabase;
    }

    public PersonalDataValidator(UserDatabase userDatabase) {
        this.userDatabase = userDatabase;
    }


    //

    @Override
     public ValidationResult checkPassword(String password) {
        UserData userData = userDatabase.select();
        if (password.equals(userData.getFullName()) ||
                password.equals(userData.getUserName()) ||
                password.equals(userData.getPhoneNumber()) ||
                password.equals(userData.getCmtUser()) ||
                password.equals(userData.getBirthday()) ||
                password.equals(userData.getMaSoNhanVien())) {
            return new ValidationResult(false, new PersonalDataException());
        }
        return new ValidationResult(true, null);
    }
}
