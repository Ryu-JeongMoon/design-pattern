package abstract_factory.listfactory;

import abstract_factory.factory.Item;
import abstract_factory.factory.Page;

public class ListPage extends Page {

    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        StringBuilder buffer = new StringBuilder();
        buffer.append("<html><head><title>")
            .append(title)
            .append("</title></head>\n<body>\n<h1>")
            .append(title)
            .append("</h1>\n<ul>\n");

        for (Item item : content) {
            buffer.append(item.makeHTML());
        }

        buffer.append("</ul>\n<hr><address>")
            .append(author)
            .append("</address></body></html>\n");

        return buffer.toString();
    }
}
