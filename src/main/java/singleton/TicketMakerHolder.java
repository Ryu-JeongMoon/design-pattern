package singleton;

public class TicketMakerHolder {

    private TicketMakerHolder() {
    }

    private static class TicketMaker {
        private static int ticket = 1000;
    }

    public static int getNextTicketNumber() {
        return TicketMaker.ticket++;
    }
}
