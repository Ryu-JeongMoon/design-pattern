package decorator;

public class SideBorder extends Border {

    private final char decorateChar;

    public SideBorder(Display display, char decorateChar) {
        super(display);
        this.decorateChar = decorateChar;
    }

    // 내용물의 양쪽에 장식 문자가 더해지므로 좌우 => 2
    @Override
    int getColumns() {
        return display.getColumns() + 2;
    }

    @Override
    int getRows() {
        return display.getRows();
    }

    @Override
    String getRowText(int row) {
        return decorateChar + display.getRowText(row) + decorateChar;
    }
}
