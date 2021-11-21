package builder;

public class TextBuilder implements Builder {

    private StringBuffer buffer = new StringBuffer();

    @Override
    public void makeTitle(String title) {
        buffer.append("====================================\n[").append(title).append("]\n\n");
    }

    @Override
    public void makeString(String str) {
        buffer.append("-").append(str).append("\n\n");
    }

    @Override
    public void makeItems(String[] items) {
        for (String item : items) {
            buffer.append(" =").append(item).append("\n");
        }
        buffer.append("\n");
    }

    @Override
    public void close() {
        buffer.append("====================================\n");
    }

    public String getResult() {
        return buffer.toString();
    }
}
/*
ConcreteBuilder 역할
실제 인스턴스 작성으로 호출되는 메서드 정의
 */