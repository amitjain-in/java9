package amit.sandbox.concurrency;

import java.util.concurrent.locks.StampedLock;

public class StampedLockTest {

    private static final StampedLock stampedLock = new StampedLock();

    public static void main(String[] args) {

    }

    public void run() {
        stampedLock.asReadLock();
    }
}
