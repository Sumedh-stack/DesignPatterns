package org.example.ObserverPattern.Observer;

import org.example.ObserverPattern.Observable.StockObervable;
public class MobileNotification implements NotificationAlertObserver{

    StockObervable stockObervable;
   String username;
    public MobileNotification(StockObervable stockObervable, String username){
        this.stockObervable=stockObervable;
        this.username=username;
    }

    @Override
    public void update() {
        sendEmail();
    }

    private void sendEmail() {
        System.out.println(stockObervable.getStock() + "Stocks are available");
    }
}
