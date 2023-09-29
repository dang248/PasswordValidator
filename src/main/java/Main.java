import Model.UserData;
import Model.UserDatabase;
import Model.ValidationResult;
import PasswordValidator.PasswordValidator;
import PasswordValidator.PasswordValidatorImpl;
import PasswordValidator.StrongPasswordValidator;
import PasswordValidator.BlackListValidator;
import PasswordValidator.PersonalDataValidator;
import PasswordValidator.OldPasswordValidator;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String password = "D999ang@";
        String username = "test1";
        UserDatabase userDatabase = () -> null;
        ValidationResult result;
        List<String> oldPasswordList = new ArrayList<>();
        oldPasswordList.add("D999ang@");

        List<String> blackList = new ArrayList<>();;
        blackList.add("123456");
        blackList.add("test1");

        PasswordValidatorImpl passwordValidator = new PasswordValidatorImpl(username, password, blackList, oldPasswordList, userDatabase);
            result = passwordValidator.checkPasswordAll();
            System.out.println(result.getException().toString());
    }
}
