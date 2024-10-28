package org.example.ObserverPattern.Observable;

import org.example.ObserverPattern.Observer.NotificationObserverInterface;

public interface StockObervableInterface {


    void add(NotificationObserverInterface notificationObserverInterface);

    void delete(NotificationObserverInterface notificationObserverInterface);

    void setStock(int data);
    int getStock();

    void notifyEveryone();
}
