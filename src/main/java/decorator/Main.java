package decorator;

public class Main {

    public static void main(String[] args) {
        Display b1 = new StringDisplay("Hello World");
        Display b2 = new SideBorder(b1, '#');
        Display b3 = new FullBorder(b2);

        b1.show();
        b2.show();
        b3.show();
        System.out.println();

        Display side2 = new SideBorder(
            new FullBorder(
                new FullBorder(
                    new SideBorder(new FullBorder(new StringDisplay("panda bear")), '*')
                )
            )
            , '/');
        side2.show();
        System.out.println();

        FullBorder fullBorder = new FullBorder(side2, '+', '-', '%', '*');
        fullBorder.show();
        System.out.println();

        UpDownBorder upDownBorder = new UpDownBorder(fullBorder, '=', '&');
        upDownBorder.show();
    }
}

/*
Decorator 왜 쓰는가 ?
- 다양한 기능을 추가할 수 있다, 실무적인 점에서 중요하겄군
- 동적인 기능 추가가 가능하므로 Framework 와 함께 야무지게 쓸 수 있다
- 자신이 감싸고 있는, 즉 장식하고 있는 내용물을 수정하지 않고 위임을 통한 방식으로 기능을 추가할 수 있다
 */