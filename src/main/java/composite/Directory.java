package composite;

import java.util.ArrayList;

public class Directory extends Entry {

    private String name;

    private ArrayList<Entry> directory = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public Entry add(Entry entry) {
        directory.add(entry);
        return entry;
    }

    @Override
    String getName() {
        return name;
    }

    @Override
    int getSize() {
        int size = 0;
        for (Entry entry : directory) {
            size += entry.getSize();
        }
        return size;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
        for (Entry entry : directory) {
            entry.printList("\t" + prefix + "/" + name);
        }
    }
}
