package com.studycandy.a2c.exception;

/**
 * Coding with Intellij IDEA
 * Author: Chenls
 * Time: 2017/4/10
 */

@SuppressWarnings("deprecation")
public class AppUnavailableException extends A2CBaseException {
    private static final long serialVersionUID = 4871656749919274851L;

    public AppUnavailableException() {
        super();
    }

    public AppUnavailableException(String message) {
        super(message);
    }

    public AppUnavailableException(String message, Throwable cause) {
        super(message, cause);
    }

    public AppUnavailableException(Throwable cause) {
        super(cause);
    }
}
