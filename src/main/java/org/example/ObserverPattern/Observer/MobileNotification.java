package org.example.ObserverPattern.Observer;

import org.example.ObserverPattern.Observable.StockObervableInterface;

public class MobileNotification implements NotificationObserverInterface{

    StockObervableInterface stockObervableInterface;

    MobileNotification(StockObervableInterface stockObervableInterface){
        this.stockObervableInterface=stockObervableInterface;
    }

    @Override
    public void update() {
        sendEmail();
    }

    private void sendEmail() {
        System.out.println(stockObervableInterface.getStock() + "Stocks are available");
    }
}
