package InvalidPasswordException;

public class OldPasswordException extends InvalidPasswordException {
    @Override
    String getExceptionMessage() {
        return "Mat khau trung voi mat khau cu";
    }
}
