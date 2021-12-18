package visitor;

public class Main {

    public static void main(String[] args) {
        System.out.println("Making root entries...");
        Directory root = new Directory("root");
        Directory bin = new Directory("bin");
        Directory tmp = new Directory("tmp");
        Directory usr = new Directory("usr");

        root.add(bin);
        root.add(tmp);
        root.add(usr);

        bin.add(new File("vi", 10000));
        bin.add(new File("latex", 20000));
        root.accept(new ListVisitor());

        System.out.println("\nMaking user entries...");
        Directory kim = new Directory("kim");
        Directory lee = new Directory("lee");
        Directory park = new Directory("park");
        usr.add(kim);
        usr.add(lee);
        usr.add(park);

        kim.add(new File("diary.html", 100));
        kim.add(new File("Composite.java", 200));
        lee.add(new File("game.doc", 300));
        park.add(new File("memo.txt", 400));
        park.add(new File("junk.mail", 500));
        root.accept(new ListVisitor());
    }
}
