package org.example.ObserverPattern;

import org.example.ObserverPattern.Observable.IphoneObservableImpl;
import org.example.ObserverPattern.Observable.StockObervable;
import org.example.ObserverPattern.Observer.EmailNotification;
import org.example.ObserverPattern.Observer.MobileNotification;
import org.example.ObserverPattern.Observer.NotificationAlertObserver;

public class Main {
    public static void main(String[] args) {
        StockObervable iphone = new IphoneObservableImpl();

        NotificationAlertObserver obs1 = new EmailNotification(iphone,"XYZ.gmail.com");
        NotificationAlertObserver obs2 = new EmailNotification(iphone,"pqr.gmail.com");
        NotificationAlertObserver obs3 = new MobileNotification(iphone,"abc.gmail.com");
        iphone.add(obs1);
        iphone.add(obs2);
        iphone.add(obs3);
        iphone.setStock(10);

    }
}
