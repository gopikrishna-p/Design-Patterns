package newsletternotification;

import newsletternotification.observer.Observer1;
import newsletternotification.observer.Observer2;
import newsletternotification.source.NewsLetterPublisher;

public class NewsLetterDriver {

    public static void main(String args[]){
        NewsLetterPublisher newsLetterPublisher =  new NewsLetterPublisher();
        Observer observer1 = new Observer1("Observer 1");
        Observer observer12 = new Observer1("Observer 12");
        Observer observer2 = new Observer2("Observer 2");
        newsLetterPublisher.subscribeNewsLetter(observer1);
        newsLetterPublisher.subscribeNewsLetter(observer2);
        newsLetterPublisher.subscribeNewsLetter(observer12);
        newsLetterPublisher.notifyAllObservers();
        newsLetterPublisher.unSubscribeNewsLetter(observer1);
        newsLetterPublisher.notifyAllObservers();
    }
    //OutPut
//    Observer 1 is Notified about the newsletter
//    Observer 2 is Notified about the newsletter
//    Observer 12 is Notified about the newsletter
//    Observer 2 is Notified about the newsletter
//    Observer 12 is Notified about the newsletter
}
