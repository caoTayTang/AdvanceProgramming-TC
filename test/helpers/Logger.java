package helpers;

public class Logger {
    public static void log(Constants.LogType type, String str) {
        switch (type) {
            case FAIL:
                System.out.println(Constants.RED + str + Constants.RESET);
                break;
            case PASS:
                System.out.println(Constants.GREEN + str + Constants.RESET);
                break;
            case INFO:
                System.out.println(Constants.BOLD + str + Constants.RESET);
                break;
            case LOG:
                System.out.println(Constants.YELLOW + str + Constants.RESET);
                break;
        }
    }
}
