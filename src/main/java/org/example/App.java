package org.example;

import java.util.HashMap;
import java.util.TreeMap;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ConsoleLogger logger = new ConsoleLogger();
        logger.log(new LogMessage("test message"));
        try {
            Thread.sleep(2000);
        } catch (Exception e) {}

        logger.log(new LogMessage("test message2"));
    }
}
