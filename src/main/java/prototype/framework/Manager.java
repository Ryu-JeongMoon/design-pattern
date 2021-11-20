package prototype.framework;

import java.util.HashMap;

public class Manager {

    private HashMap<String, Product> showcase = new HashMap<>();

    public void register(String name, Product proto) {
        showcase.put(name, proto);
    }

    public Product create(String protoName) {
        Product p = showcase.get(protoName);
        return p.createClone();
    }
}
/*
소스 안에 클래스 이름을 명시하면 밀접한 관계가 생기는 것을 의미한당
따라서 framework 패키지 안의 인터페이스, 클래스에서는 추상화에 의존해야 한다!!
 */