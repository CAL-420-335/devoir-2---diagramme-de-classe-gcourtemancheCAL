package org.example;

import java.time.LocalDateTime;

public abstract class AbstractTimestampLogger implements ILogger{
    @Override
    public void log(ILoggable loggable) {
        LocalDateTime timestamp = LocalDateTime.now();
        String result = String.format("%s : %s", timestamp.toString(), loggable.logTrace());
        write(result);
    }

    public abstract void write(String string);
}
