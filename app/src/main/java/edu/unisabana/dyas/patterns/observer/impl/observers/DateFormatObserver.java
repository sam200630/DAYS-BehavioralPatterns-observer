package edu.unisabana.dyas.patterns.observer.impl.observers;

import edu.unisabana.dyas.patterns.observer.impl.ConfigurationManager;
import edu.unisabana.dyas.patterns.observer.impl.AbstractObserver;
import java.util.Date;

public class DateFormatObserver extends AbstractObserver {
    @Override
    public void notifyObserver(String command, Object source) {
        if ("defaultDateFormat".equals(command)) {
            ConfigurationManager conf = (ConfigurationManager) source;
            System.out.println("Observer ==> DateFormatObserver.dateFormatChange > "
                    + conf.getDefaultDateFormat().format(new Date()));
        }
    }
}