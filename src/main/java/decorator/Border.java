package decorator;

public abstract class Border extends Display {

    protected final Display display;

    protected Border(Display display) {
        this.display = display;
    }
}
