package org.example;

public class ConsoleLogger extends AbstractTimestampLogger{
    public void write(String message) {
        System.out.println(message);
    }
}
