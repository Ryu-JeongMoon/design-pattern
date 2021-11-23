package abstract_factory;

import abstract_factory.factory.Factory;
import abstract_factory.factory.Link;
import abstract_factory.factory.Page;
import abstract_factory.factory.Tray;

public class Main {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Main class.name.of.ConcreteFactory");
            System.out.println("Example1: java Main listfactory.ListFactory");
            System.out.println("Example1: java Main tablefactory.TableFactory");
            System.exit(0);
        }

        Factory factory = Factory.getFactory(args[0]);

        Link joins = factory.createLink("중앙일보", "https://www.joongang.co.kr/");
        Link chosun = factory.createLink("조선일보", "https://www.chosun.com/");

        Link yahoo = factory.createLink("Yahoo!", "https://www.yahoo.com/");
        Link github = factory.createLink("Github", "https://github.com/");
        Link google = factory.createLink("Google", "https://www.google.co.kr/");

        Tray newsTray = factory.createTray("newspaper");
        newsTray.add(joins);
        newsTray.add(chosun);

        Tray searchTray = factory.createTray("search engine");
        searchTray.add(yahoo);
        searchTray.add(google);
        searchTray.add(github);

        Page page = factory.createPage("LinkPage", "PANDA");
        page.add(newsTray);
        page.add(searchTray);
        page.output();
    }
}
