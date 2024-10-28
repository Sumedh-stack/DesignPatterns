package org.example.ObserverPattern.Observable;

import org.example.ObserverPattern.Observer.NotificationObserverInterface;

import java.util.List;

public class IphoneObservable implements StockObervableInterface{

    List<NotificationObserverInterface> notificationObserverInterfacesList;
    int numberOfStocks;

    @Override
    public void add(NotificationObserverInterface notificationObserverInterface) {
        notificationObserverInterfacesList.add(notificationObserverInterface);
    }

    @Override
    public void delete(NotificationObserverInterface notificationObserverInterface) {
        notificationObserverInterfacesList.remove(notificationObserverInterface);
    }

    @Override
    public void setStock(int data) {
        if(numberOfStocks == 0){
            notifyEveryone();
        }
        numberOfStocks=numberOfStocks+data;

    }

    @Override
    public int getStock() {
        return numberOfStocks;
    }

    @Override
    public void notifyEveryone() {
        for(NotificationObserverInterface notificationObserverInterface: notificationObserverInterfacesList){
            notificationObserverInterface.update();
        }
    }
}
