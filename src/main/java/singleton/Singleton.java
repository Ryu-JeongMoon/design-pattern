package singleton;

public class Singleton {

    private static Singleton singleton = new Singleton();

    private Singleton() {
        System.out.println("인스턴스 생성");
    }

    public static Singleton getInstance() {
        return singleton;
    }
}

/*
Singleton 왜 필요한 것인가?

객체 생성에는 비용이 든다
특히 객체 생성 비용이 비싼 놈들이 있는데 DB connection 을 담당하는 놈 등이 있다
이런 놈들의 인스턴스가 단 하나임을 보장하는 것이 싱글턴의 의의
 */