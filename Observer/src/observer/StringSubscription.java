package observer;

import java.util.concurrent.Flow;

public class StringSubscription implements Flow.Subscription {

    private String message;
    private Flow.Subscriber subscriber;
    private boolean completed;

    public StringSubscription(Flow.Subscriber subscriber) {
        this.subscriber = subscriber;
    }

    @Override
    public void request(long n) {
        if (n != 0 && !completed && message != "") {
            if (n < 0) {
                IllegalArgumentException ex = new IllegalArgumentException();
                subscriber.onError(ex);
            } else {
                subscriber.onNext(message);
                message = "";
            }
        }
    }

    @Override
    public void cancel() {
        completed = true;
    }

    public void send(String message) {
        this.message = message;
    }
}
