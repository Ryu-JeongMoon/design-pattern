package decorator;

public class UpDownBorder extends Border {

    private final char upDownChar;
    private final char sideChar;

    public UpDownBorder(Display display) {
        this(display, '=', '|');
    }

    public UpDownBorder(Display display, char upDownChar, char sideChar) {
        super(display);
        this.upDownChar = upDownChar;
        this.sideChar = sideChar;
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
        if (row == 0 || row == display.getRows() + 1) {
            return sideChar + makeLine(upDownChar, display.getColumns()) + sideChar;
        } else {
            return sideChar + display.getRowText(row - 1) + sideChar;
        }
    }

    private String makeLine(char ch, int count) {
        return String.valueOf(ch).repeat(count);
    }
}
