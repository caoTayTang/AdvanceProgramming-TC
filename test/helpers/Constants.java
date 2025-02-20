package helpers;

public class Constants {
    public final static String RED = "\033[0;31m";
    public final static String GREEN = "\033[0;32m";
    public final static String YELLOW = "\033[0;33m";
    public final static String BOLD = "\033[1m";
    public final static String RESET = "\033[0m";

    public static enum LogType {
        FAIL,
        PASS,
        INFO,
        LOG
    }
}
