package InvalidPasswordException;

public class BlackListException extends InvalidPasswordException {

    @Override
    String getExceptionMessage() {
        return "Mat khau trung voi mat khau trong black list";
    }
}
