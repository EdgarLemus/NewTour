package utils;

import java.text.MessageFormat;

public class ExceptionError {

    public static String messageErrorResponse(String message)
    {
        return MessageFormat.format("Not Found Object. Response type {0} not equals", message);
    }
}
