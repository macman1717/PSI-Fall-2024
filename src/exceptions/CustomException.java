package exceptions;

import java.io.IOException;

public class CustomException extends IOException {
    public CustomException() {
    }

    public CustomException(String s) {
        super(s);
    }
}