package abstract_factory.listfactory;

import abstract_factory.factory.Item;
import abstract_factory.factory.Tray;

public class ListTray extends Tray {

    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuilder buffer = new StringBuilder();
        buffer.append("<li>\n").append(caption).append("\n<ul>\n");
        for (Item item : tray) {
            buffer.append(item.makeHTML());
        }
        buffer.append("</ul>\n</li>\n");

        return buffer.toString();
    }
}
