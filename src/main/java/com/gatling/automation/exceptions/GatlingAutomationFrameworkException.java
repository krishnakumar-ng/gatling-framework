package com.gatling.automation.exceptions;

public class GatlingAutomationFrameworkException extends RuntimeException{
    public GatlingAutomationFrameworkException(String message){
        super(message);
    }

    public GatlingAutomationFrameworkException(String message, Throwable cause){
        super(message, cause);
    }
}
