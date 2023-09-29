package InvalidPasswordException;

public class PersonalDataException extends InvalidPasswordException {
    @Override
    String getExceptionMessage() {
        return "Mat khau chua thong tin ca nhan";
    }
}
