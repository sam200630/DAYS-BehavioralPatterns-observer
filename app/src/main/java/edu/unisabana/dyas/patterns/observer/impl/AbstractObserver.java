package edu.unisabana.dyas.patterns.observer.impl;

/**
 * Clase base para observadores, asegurando que todos implementen
 * notifyObserver.
 */
public abstract class AbstractObserver implements IObserver {
    @Override
    public abstract void notifyObserver(String command, Object source);
}
