package iterator;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("PANDA"));
        bookShelf.appendBook(new Book("BEAR"));
        bookShelf.appendBook(new Book("TIGER"));
        bookShelf.appendBook(new Book("RABBIT"));

        Iterator iterator = bookShelf.iterator();

        while(iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println("book.getName() = " + book.getName());
        }
    }
}
