import java.util.List;

public interface PasswordValidator {

    boolean checkPassword(String username, String password);
    boolean checkStrongPasswordComponents();

    boolean checkAgainstPersonalData(UserDatabase userDatabase);

    boolean checkAgainstBlacklist(List<String> blackList);

    boolean lockAccountOnMultipleWrongPasswordAttempts(boolean lockAccount);

    boolean checkAgainstOldPasswords(List<String> oldPasswordList);

    boolean mustChangePasswordOnFirstAccess(String defaultPassword);

    boolean mustChangePasswordRegularly(boolean mustChange);
}
