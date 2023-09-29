package InvalidPasswordException;

public class StrongPasswordException extends InvalidPasswordException {
    @Override
    String getExceptionMessage() {
        return "Mat khau khong chua du cac thanh phan mat khau manh";
    }
}
