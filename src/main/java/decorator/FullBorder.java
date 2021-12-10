package decorator;

public class FullBorder extends Border {

    private final char topChar;
    private final char bottomChar;
    private final char sideChar;
    private final char inlineChar;

    public FullBorder(Display display) {
        this(display, '+', '+', '|', '-');
    }

    public FullBorder(Display display, char topChar, char bottomChar, char sideChar, char inlineChar) {
        super(display);
        this.topChar = topChar;
        this.bottomChar = bottomChar;
        this.sideChar = sideChar;
        this.inlineChar = inlineChar;
    }

    @Override
    int getColumns() {
        return display.getColumns() + 2;
    }

    @Override
    int getRows() {
        return display.getRows() + 2;
    }

    @Override
    String getRowText(int row) {
        if (row == 0) {
            return topChar + makeLine(inlineChar, display.getColumns()) + topChar;
        } else if (row == display.getRows() + 1) {
            return bottomChar + makeLine(inlineChar, display.getColumns()) + bottomChar;
        } else {
            return sideChar + display.getRowText(row - 1) + sideChar;
        }
    }

    // 오호 repeat
    private String makeLine(char c, int count) {
        return String.valueOf(c).repeat(count);
    }
}
