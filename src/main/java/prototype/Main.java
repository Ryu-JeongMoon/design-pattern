package prototype;

import prototype.framework.Manager;
import prototype.framework.Product;

public class Main {

    private static final String STRONG_MESSAGE = "strong message";
    private static final String WARNING_BOX = "warning box";
    private static final String SLASH_BOX = "slash box";

    public static void main(String[] args) {
        Manager manager = new Manager();
        UnderLinePen u1 = new UnderLinePen('-');
        MessageBox m1 = new MessageBox('*');
        MessageBox m2 = new MessageBox('/');

        manager.register(STRONG_MESSAGE, u1);
        manager.register(WARNING_BOX, m1);
        manager.register(SLASH_BOX, m2);

        Product p1 = manager.create(STRONG_MESSAGE);
        p1.use("Hello world");

        Product p2 = manager.create(WARNING_BOX);
        p2.use("Hello Java");

        Product p3 = manager.create(SLASH_BOX);
        p3.use("Hello Design");
    }
}
/*
꺼낼때 일일이 이름을 지정해줘야 하는 단점이 있고만
상수로 만들던지 하면 되겄군

왜 Prototype 패턴을 이용하는가?
자바가 최종적으로 지향하는 부품으로써의 재이용을 하기 위해 필요하다
소스 코드 상에서 클래스 이름이 등장하면 종속된 관계가 만들어지는 것이고 배포가 필요한 상황에서 같이 배포해줘야 한다
개념 상 상위에 존재하는 framework 패키지를 배포할 때, 그에 속하는 MessageBox, UnderLinePen 도 같이 배포해줘야 한다는 것

clone 메서드는 shallow-copy 한당
필드에 배열이나 객체가 있을 경우 참조값만 전달된다는 것
 */