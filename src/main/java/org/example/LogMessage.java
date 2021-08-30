package org.example;

public class LogMessage implements ILoggable{
    private String message;

    public LogMessage(String msg) {
        this.message = msg;
    }

    @Override
    public String logTrace() {
        return this.message;
    }
}
