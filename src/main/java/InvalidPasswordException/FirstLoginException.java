package InvalidPasswordException;

public class FirstLoginException extends InvalidPasswordException {
    @Override
    String getExceptionMessage() {
        return "Mat khau trung voi mat khau trong black list";
    }
}
