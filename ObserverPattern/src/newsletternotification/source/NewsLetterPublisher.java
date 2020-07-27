package newsletternotification.source;

import newsletternotification.Observer;

import java.util.ArrayList;
import java.util.List;

// Source or Publisher ,This maintains the list of observers or subscribers
public class NewsLetterPublisher {

    List<Observer> subscribersList = new ArrayList<Observer>();


    //subscribe method
   public void subscribeNewsLetter(Observer observer) {
        if (!subscribersList.contains(observer)) {
            subscribersList.add(observer);
        }
    }

    //Unsubscribe method
    public void unSubscribeNewsLetter(Observer observer) {
        if (subscribersList.contains(observer)) {
            subscribersList.remove(observer);
        }
    }

    //Notify all observers
    public void notifyAllObservers() {
        for (Observer observer : subscribersList) {
            observer.notifyObserver();
        }
    }
}
