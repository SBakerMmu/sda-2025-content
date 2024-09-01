package compositemenu;

import java.util.Objects;

class LeafMenuItem extends AbstractMenuItem {
    private final Command command;

    LeafMenuItem(CompositeMenuItem parent, String name, Command command) {
        super(parent, name);
        this.command = command;
    }

    @Override
    public void display() {
        System.out.printf("%s%s%n", indent(), name);
    }
}
