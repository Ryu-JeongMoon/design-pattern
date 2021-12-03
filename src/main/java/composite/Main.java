package composite;

public class Main {

    public static void main(String[] args) {
        Directory root = new Directory("root");
        Directory tmp = new Directory("tmp");
        Directory usr = new Directory("usr");

        Directory kim = new Directory("Kim");
        File diary = new File("diary.html", 300);
        File composite = new File("Composite.java", 500);
        kim.add(diary);
        kim.add(composite);

        Directory lee = new Directory("Lee");
        File memo = new File("memo.txt", 350);
        lee.add(memo);

        Directory park = new Directory("Park");
        File game = new File("game.doc", 150);
        File junk = new File("junk.mail", 900);
        park.add(game);
        park.add(junk);

        usr.add(kim);
        usr.add(lee);
        usr.add(park);

        Directory bin = new Directory("bin");
        File vi = new File("vi", 10);
        File latex = new File("latex", 20);
        bin.add(vi);
        bin.add(latex);

        root.add(bin);
        root.add(tmp);
        root.add(usr);

        root.printList();
    }
}

/*
Composite Pattern 이라 하면 OS 의 File System 을 떠올리거라
루트 디렉토리 안에 여러 디렉토리가 있을 수 있고, 파일도 있을 수 있다

Composite 은 그릇이다
디렉토리는 Composite 역할.
내부에 다른 Entry 넣을 수 있음

파일은 Leaf 역할.
내부에 다른 Entry 를 넣을 수 없다
 */