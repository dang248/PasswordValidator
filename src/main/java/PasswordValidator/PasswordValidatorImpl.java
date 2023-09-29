package PasswordValidator;

import Model.UserDatabase;
import Model.ValidationResult;

import java.util.ArrayList;
import java.util.List;

public class PasswordValidatorImpl {
    private String username;
    private String password;
    private List<String> blackList;
    private List<String> oldPasswordList;
    private UserDatabase userDatabase;
    private  List<PasswordValidator> passwordValidatorList;


    public PasswordValidatorImpl(String username, String password, List<String> blackList, List<String> oldPasswordList, UserDatabase userDatabase) {
        this.username = username;
        this.password = password;
        this.blackList = blackList;
        this.oldPasswordList = oldPasswordList;
        this.userDatabase = userDatabase;
    }

    public ValidationResult checkPasswordAll(){
        ValidationResult validationResult = new ValidationResult(true, null);
        passwordValidatorList = new ArrayList<>();
        PasswordValidator strongPasswordValidator = new StrongPasswordValidator();
        PasswordValidator blackListValidator = new BlackListValidator(blackList);
        PasswordValidator personalDataValidator = new PersonalDataValidator(userDatabase);
        PasswordValidator oldPasswordValidator = new OldPasswordValidator(oldPasswordList);
        passwordValidatorList.add(blackListValidator);
        passwordValidatorList.add(strongPasswordValidator);
        passwordValidatorList.add(oldPasswordValidator);
        passwordValidatorList.add(personalDataValidator);
        for (PasswordValidator validator: passwordValidatorList) {
            validationResult = validator.checkPassword(password);
            if(!validationResult.isValid()){
             return validationResult;
            }
        }
        return validationResult;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<String> getBlackList() {
        return blackList;
    }

    public void setBlackList(List<String> blackList) {
        this.blackList = blackList;
    }

    public List<String> getOldPasswordList() {
        return oldPasswordList;
    }

    public void setOldPasswordList(List<String> oldPasswordList) {
        this.oldPasswordList = oldPasswordList;
    }

    public UserDatabase getUserDatabase() {
        return userDatabase;
    }

    public void setUserDatabase(UserDatabase userDatabase) {
        this.userDatabase = userDatabase;
    }

    public List<PasswordValidator> getPasswordValidatorList() {
        return passwordValidatorList;
    }

    public void setPasswordValidatorList(List<PasswordValidator> passwordValidatorList) {
        this.passwordValidatorList = passwordValidatorList;
    }

}
