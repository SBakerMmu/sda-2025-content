package compositemenu;

import java.util.Objects;

abstract class AbstractMenuItem implements MenuItem {
    static final String INDENT = "   ";
    private final AbstractMenuItem parent;
    protected final String name;

    AbstractMenuItem(AbstractMenuItem parent, String name) {
        this.parent = parent;
        this.name = name;
    }

    @Override
    public abstract void display();

    protected String indent() {
        return Objects.isNull(parent) ? "" : String.format("%s%s", parent.indent(), INDENT);
    }
}
