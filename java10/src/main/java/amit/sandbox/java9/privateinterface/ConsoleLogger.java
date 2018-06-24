package amit.sandbox.java9.privateinterface;

public class ConsoleLogger implements Logger {

    public static void main(String[] args) {
        Logger logger = new ConsoleLogger();
        logger.info("Hello Information");
        logger.error("Hello Error");
        logger.warn("Hello Warning");
    }

    @Override
    public void error(String message) {
        System.err.println("[ERROR] - " + message);
    }
}
