package builder;

public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.makeTitle("Greeting");
        builder.makeString("Morning and Afternoon");
        builder.makeItems(new String[]{"Good Morning", "Good Afternoon"});
        builder.makeString("Night");
        builder.makeItems(new String[]{"Hello", "Good Night", "Good Bye"});
        builder.close();
    }
}
/*
Builder 역할의 API 사용하여 인스턴스 생성
Builder 에만 의존하여 구체 클래스에 대한 의존 X
 */