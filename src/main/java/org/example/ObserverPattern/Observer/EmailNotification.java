package org.example.ObserverPattern.Observer;

import org.example.ObserverPattern.Observable.StockObervableInterface;

public class EmailNotification implements NotificationObserverInterface{
    StockObervableInterface stockObervableInterface;
    String username;

    EmailNotification(StockObervableInterface stockObervableInterface, String username){
        this.stockObervableInterface=stockObervableInterface;
        this.username=username;
    }


    @Override
    public void update() {
        sendEmail(username);
    }

    private void sendEmail(String username) {
        String emailId = username;
        System.out.println(stockObervableInterface.getStock() + "Stocks are available to " + emailId);
    }
}
