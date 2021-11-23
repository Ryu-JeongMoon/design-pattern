package abstract_factory.factory;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public abstract class Page {

    protected String title;
    protected String author;
    protected ArrayList<Item> content= new ArrayList<>();

    public Page(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void add(Item item) {
        content.add(item);
    }

    public void output() {
        try {
            String filename = title + ".html";
            FileWriter writer = new FileWriter(filename);
            writer.write(this.makeHTML());
            System.out.println(filename + " 작성 완료~~");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public abstract String makeHTML();
}
