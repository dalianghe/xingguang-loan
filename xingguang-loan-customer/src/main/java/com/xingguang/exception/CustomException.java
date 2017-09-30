package com.xingguang.exception;

/**
 * Created by admin on 2017/9/30.
 */
public class CustomException extends RuntimeException {

    private String errorCode;

    public CustomException(String message){
        super(message);
    }

    public CustomException(String errorCode, String message){
        super(message);
        this.setErrorCode(errorCode);
    }

    public CustomException(String errorCode, String message, Throwable cause){
        super(message, cause);
        this.setErrorCode(errorCode);
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
}
