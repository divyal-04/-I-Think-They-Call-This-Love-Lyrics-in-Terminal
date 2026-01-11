public final class LyricsPrinter {

    private LyricsPrinter() {}

    // ANSI styles
    private static final String RESET   = "\u001B[0m";
    private static final String BOLD    = "\u001B[1m";
    private static final String CYAN    = "\u001B[36m";
    private static final String MAGENTA = "\u001B[35m";
    private static final String YELLOW  = "\u001B[33m";
    private static final String GREEN   = "\u001B[32m";
    private static final String BLUE    = "\u001B[34m";

    public static void main(String[] args) throws InterruptedException {

        print("[00:00]", "Could this mean anything, anything else?", BLUE);
        Thread.sleep(3000);

        print("[00:03]", "When... all I dream of is your eyes", CYAN);
        Thread.sleep(5000);

        print("[00:08]", "All I long for is your touch", MAGENTA);
        Thread.sleep(5000);

        print(
            "[00:13]",
            "And darling, something tells me it's enough",
            YELLOW
        );
        Thread.sleep(5000);

        print("[00:18]", "You can say that I'm a fool", CYAN);
        Thread.sleep(4000);

        print("[00:22]", "And I don't know very much", MAGENTA);
        Thread.sleep(4000);

        print(
            "[00:26]",
            "But I think they call this love",
            BOLD + GREEN
        );
    }

    private static void print(String time, String lyric, String style) {
        System.out.println(style + time + "  " + lyric + RESET);
    }
}
