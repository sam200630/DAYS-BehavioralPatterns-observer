package edu.unisabana.dyas.patterns.observer;

import edu.unisabana.dyas.patterns.observer.impl.ConfigurationManager;
import edu.unisabana.dyas.patterns.observer.impl.observers.DateFormatObserver;
import edu.unisabana.dyas.patterns.observer.impl.observers.MoneyFormatObserver;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

public class ObserverMain {
    public static void main(String[] args) {
        ConfigurationManager conf = ConfigurationManager.getInstance();

        conf.setDefaultDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
        conf.setMoneyFormat(new DecimalFormat("##.00"));
        System.out.println("Initial Configuration Set.");

        DateFormatObserver dateObserver = new DateFormatObserver();
        MoneyFormatObserver moneyObserver = new MoneyFormatObserver();

        conf.addObserver(dateObserver);
        conf.addObserver(moneyObserver);

        System.out.println("\nUpdating Configuration...");
        conf.setDefaultDateFormat(new SimpleDateFormat("dd/MM/yyyy"));
        conf.setMoneyFormat(new DecimalFormat("###,#00.00"));

        System.out.println("\nRemoving Observers...");
        conf.removeObserver(dateObserver);
        conf.removeObserver(moneyObserver);

        conf.setDefaultDateFormat(new SimpleDateFormat("MM/yyyy"));
        conf.setMoneyFormat(new DecimalFormat("###,##0.00"));
    }
}