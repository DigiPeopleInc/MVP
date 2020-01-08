package ru.digipeople.ui.mvp;

/**
 * @author Aleksandr Brazhkin
 */
public interface KeepAliveProvider {
    boolean keepAlive(boolean parentKeepAlive);
}
