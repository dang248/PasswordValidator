package InvalidPasswordException;
enum InvalidPasswordExceptionEnum{
    ACCOUNT_LOCK,
    BLACK_LIST,
    EXPIRATION,
    FIRST_LOGIN,
    OLD_PASSWORD,
    PERSONAL_DATA,
    STRONG_PASSWORD
}

public abstract class InvalidPasswordException extends Exception {
    abstract String getExceptionMessage();
}

