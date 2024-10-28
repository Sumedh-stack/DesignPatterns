package org.example.ObserverPattern.Observable;

import org.example.ObserverPattern.Observer.NotificationAlertObserver;


public interface StockObervable{



    void add(NotificationAlertObserver notificationObserverInterface);

    void delete(NotificationAlertObserver notificationObserverInterface);

    void setStock(int data);
    int getStock();

    void notifySubscriber();
}
