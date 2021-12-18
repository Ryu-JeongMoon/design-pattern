package visitor;

import java.util.Iterator;

public class ListVisitor extends Visitor{

    private String currentDirectory = "";

    @Override
    public void visit(File file) {
        System.out.println(currentDirectory + "/" + file);
    }

    @Override
    public void visit(Directory directory) {
        System.out.println(currentDirectory + "/" + directory);
        String savedDirectory = currentDirectory;
        currentDirectory = currentDirectory + "/" + directory.getName();
        Iterator iterator = directory.iterator();
        while (iterator.hasNext()) {
            Entry entry = (Entry) iterator.next();
            entry.accept(this);
        }
        currentDirectory = savedDirectory;
    }
}
