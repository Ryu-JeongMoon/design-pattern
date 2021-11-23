package abstract_factory.tablefactory;

import abstract_factory.factory.Item;
import abstract_factory.factory.Page;

public class TablePage extends Page {

    public TablePage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        StringBuilder buffer = new StringBuilder();
        buffer.append("<html><head><title>")
            .append(title)
            .append("</title></head>\n<body>\n<h1>")
            .append(title)
            .append("</h1>\n<table width=\"80%\" border=\"3\">\n");

        for (Item item : content) {
            buffer.append("<tr>").append(item.makeHTML()).append("</tr>");
        }

        buffer.append("</table>\n<hr><address>")
            .append(author)
            .append("</address></body></html>\n");

        return buffer.toString();
    }
}
