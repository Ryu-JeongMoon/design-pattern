package builder;

public interface Builder {

    void makeTitle(String title);

    void makeString(String str);

    void makeItems(String[] items);

    void close();
}
/*
인스턴스 생성을 위한 API 결정
 */