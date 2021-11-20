package prototype.framework;

public abstract class Product implements Cloneable {

    public void use(String s){};

    public Product createClone() {
        Product p = null;
        try {
            p = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}

/*
인터페이스에 public abstract 생략되있어서 안 붙여도 되지롱
추상클래스에는 public 붙여줘야 되지롱

Cloneable 은 마커 인터페이스라서 별 다른 기능은 없고 요놈이 붙어있어야
자바가 제공하는 clone 메서드를 사용할 수 있다 안 붙이면 CloneNotSupportedException 터짐둥

Product 구현한 애들이 같은 createClone 으로 오버라이드하니께
default 로 만들어버릴라 했는데 cannot find symbol clone() 뜨넹?!

기본적으로 default 로 되어있고 사용하기 위해서는 사용하는 쪽에서 public 으로 메서드 만들고 정의해야 한다?!
clone 메서드는  Object 클래스 안에서 protected 로 감싸져 있고 이를 재정의해야 한다
인터페이스는 Object 상속 안 하니까 clone() 이 없다는 거고만!

abstract class 로 만들고 여기서 createClone() 정의하니까 된당 우헤헤헤
단순 복사가 목적이라면 추상 클래스 나쁘지 않을지도 ??
단 메서드 수가 많아질 경우 Product 는 인터페이스로 정의하고 요놈을 구현하는 추상 클래스를 여러개 만들어야 하겠고만
 */