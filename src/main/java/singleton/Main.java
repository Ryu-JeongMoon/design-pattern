package singleton;

public class Main {

    public static void main(String[] args) {
        Singleton o1 = Singleton.getInstance();
        Singleton o2 = Singleton.getInstance();

        System.out.println("(o1 == o2) = " + (o1 == o2));
        System.out.println("o1.equals(o2) = " + o1.equals(o2));

        for (int i = 0; i < 10; i++) {
            System.out.println(TicketMakerHolder.getNextTicketNumber());
        }
    }
}
