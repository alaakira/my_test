package tripify_server.exception;

public class TestNotFoundException extends RuntimeException{

    public static final String EXCEPTION_MESSAGE = "ITEM NOT FOUND EXCEPTION";

    public TestNotFoundException(String message) {
        super(EXCEPTION_MESSAGE);
    }

}
