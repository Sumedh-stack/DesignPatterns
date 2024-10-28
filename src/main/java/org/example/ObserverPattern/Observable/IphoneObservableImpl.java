package org.example.ObserverPattern.Observable;

import org.example.ObserverPattern.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StockObervable{

    List<NotificationAlertObserver> observerList = new ArrayList<>();
    int stockCount =0;

    @Override
    public void add(NotificationAlertObserver notificationObserverInterface) {
        observerList.add(notificationObserverInterface);
    }

    @Override
    public void delete(NotificationAlertObserver notificationObserverInterface) {
        observerList.remove(notificationObserverInterface);
    }

    @Override
    public void setStock(int data) {
        if(stockCount == 0){
            stockCount=stockCount+data;
            notifySubscriber();
        }


    }

    @Override
    public int getStock() {
        return stockCount;
    }

    @Override
    public void notifySubscriber() {
        for(NotificationAlertObserver observer: observerList){
            observer.update();
        }
    }
}
