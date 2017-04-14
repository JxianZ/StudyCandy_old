package com.studycandy.a2c.exception;

/**
 * Coding with Intellij IDEA
 * Author: Chenls
 * Time: 2017/4/10
 */
@Deprecated
public class A2CBaseException extends RuntimeException {
    private static final long serialVersionUID = 4871682749919274851L;

    public A2CBaseException() {
        super();
    }

    public A2CBaseException(String message) {
        super(message);
    }

    public A2CBaseException(String message, Throwable cause) {
        super(message, cause);
    }

    public A2CBaseException(Throwable cause) {
        super(cause);
    }
}
