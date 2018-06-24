package amit.sandbox.java9.privateinterface;

public interface Logger {

    default void info(String message) {
        log("INFO", message);
    }

    default void error(String message) {
        log("ERROR", message);
    }

    default void warn(String message) {
        log("WARN", message);
    }

    private void log(String level, String message) {
        System.out.println("[" + level + "] - " + message);
    }
}
