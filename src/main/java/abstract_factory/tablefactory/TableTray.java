package abstract_factory.tablefactory;

import abstract_factory.factory.Item;
import abstract_factory.factory.Tray;

public class TableTray extends Tray {

    public TableTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuilder buffer = new StringBuilder();
        buffer.append("<td><table width=\"100%\" border=\"1\"><tr><td bgcolor=\"#cccccc\" align=\"center\" colspan\"")
            .append(tray.size())
            .append("\"><b>")
            .append(caption)
            .append("</b></td></tr>\n<tr>\n");

        for (Item item : tray) {
            buffer.append(item.makeHTML());
        }

        buffer.append("</tr></table></td>");

        return buffer.toString();
    }
}
