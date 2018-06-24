package amit.sandbox.java9.concurrency;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.SubmissionPublisher;

public class FlowTest  {
    public static void main(String[] args) throws InterruptedException {
        SubmissionPublisher<String> submissionPublisher = new SubmissionPublisher<>(ForkJoinPool.commonPool(), 10);
        submissionPublisher.subscribe(new FlowSubscriber());
        for(int i = 0; i < 10; i++) {
            submissionPublisher.submit(i + "");
        }
        Thread.sleep(20000);
    }
}
