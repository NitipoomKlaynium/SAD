package observer;

import java.util.LinkedList;
import java.util.concurrent.Flow;

public class StringPublisher implements Flow.Publisher<String> {

    private LinkedList<StringSubscriber> subscribers;
    private LinkedList<StringSubscription> subscriptions;

    public StringPublisher() {
        subscribers = new LinkedList<StringSubscriber>();
        subscriptions = new LinkedList<StringSubscription>();
    }

    @Override
    public void subscribe(Flow.Subscriber subscriber) {
        if (!subscribers.contains(subscriber)) {
            subscribers.add((StringSubscriber) subscriber);

            StringSubscription subscription = new StringSubscription(subscriber);

            subscriptions.add(subscription);
            subscriber.onSubscribe(subscription);
        }
        else {
            System.out.println("This " + subscriber.getClass().getSimpleName() + " are already subscribed.");
        }
    }

    public void publish(String message) {
        for (StringSubscription subscription : subscriptions) {
            subscription.send(message);
            subscription.request(1);
        }
    }
}
