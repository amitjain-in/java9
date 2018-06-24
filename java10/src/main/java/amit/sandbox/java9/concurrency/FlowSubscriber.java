package amit.sandbox.java9.concurrency;

import java.util.concurrent.Flow;

public class FlowSubscriber implements Flow.Subscriber<String> {

    private Flow.Subscription subscription;

    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        System.out.println(Thread.currentThread().getName() + " - Subscription callback " + subscription);
        this.subscription = subscription;
        subscription.request(1);
    }

    @Override
    public void onNext(String item) {
        System.out.println(Thread.currentThread().getName() + " - Received next item - " + item);
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        subscription.request(1);
    }

    @Override
    public void onError(Throwable throwable) {
        System.err.println(Thread.currentThread().getName() + " - Some error received");
        throwable.printStackTrace();
    }

    @Override
    public void onComplete() {
        System.out.println(Thread.currentThread().getName() + " - Subscriber completed");
    }
}
