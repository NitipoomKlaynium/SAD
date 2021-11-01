package observer;

import java.util.LinkedList;
import java.util.concurrent.Flow;

public class StringPublisher implements Flow.Publisher<String> {

    private LinkedList<StringSubscriber> subscribers;
    private LinkedList<StringSubscription> subscriptions;

    public StringPublisher() {
        this.subscribers = new LinkedList<StringSubscriber>();
        this.subscriptions = new LinkedList<StringSubscription>();
    }

    @Override
    public void subscribe(Flow.Subscriber subscriber) {
        if (!this.subscribers.contains(subscriber)) {
            this.subscribers.add((StringSubscriber) subscriber);

            StringSubscription subscription = new StringSubscription(subscriber);

            this.subscriptions.add(subscription);
            subscriber.onSubscribe(subscription);
        }
        else {
            System.out.println("This " + subscriber.getClass().getSimpleName() + " are already subscribed.");
        }
    }

    public void publish(String message) {
        for (StringSubscription subscription : this.subscriptions) {
            subscription.request(1);
            subscription.publish(message);
        }
    }
}
