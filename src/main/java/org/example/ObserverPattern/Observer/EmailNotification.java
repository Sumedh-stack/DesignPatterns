package org.example.ObserverPattern.Observer;

import org.example.ObserverPattern.Observable.StockObervable;


public class EmailNotification implements NotificationAlertObserver{
    StockObervable stockObervable;
    String username;

    public EmailNotification(StockObervable stockObervable, String username){
        this.stockObervable=stockObervable;
        this.username=username;
    }


    @Override
    public void update() {
        sendEmail(username);
    }

    private void sendEmail(String username) {
        String emailId = username;
        System.out.println(stockObervable.getStock() + "Stocks are available to " + emailId);
    }
}
