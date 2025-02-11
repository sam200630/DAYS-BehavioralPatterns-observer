package edu.unisabana.dyas.patterns.observer.impl.observers;

import edu.unisabana.dyas.patterns.observer.impl.ConfigurationManager;
import edu.unisabana.dyas.patterns.observer.impl.AbstractObserver;
import java.text.DecimalFormat;

public class MoneyFormatObserver extends AbstractObserver {
    @Override
    public void notifyObserver(String command, Object source) {
        if ("moneyFormat".equals(command)) {
            ConfigurationManager conf = (ConfigurationManager) source;
            System.out.println("Observer ==> MoneyFormatObserver.moneyFormatChange > "
                    + conf.getMoneyFormat().format(1234.56));
        }
    }
}
