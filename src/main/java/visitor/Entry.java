package visitor;

import composite.FileTreatmentException;

public abstract class Entry implements Element {

    public abstract String getName();

    public abstract int getSize();

    public Entry add(Entry entry) {
        throw new FileTreatmentException();
    }

    public String toString() {
        return getName() + " (" + getSize() + ")";
    }
}
