package newsletternotification.observer;

import newsletternotification.Observer;

//Observer who is observing publisher/source
public class Observer1 implements Observer {

    public String name;

    public Observer1(String name) {
        this.name = name;
    }

    @Override
    public void  notifyObserver() {
        System.out.println(this.name + " is Notified about the newsletter");
    }
}
