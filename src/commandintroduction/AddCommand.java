package commandintroduction;

class AddCommand implements Command {

    private final MyClass instanceOfMyClass;
    private final int i;

    AddCommand(MyClass instanceOfMyClass, int i) {
        this.instanceOfMyClass = instanceOfMyClass;
        this.i = i;
    }

    @Override
    public void execute() {
        instanceOfMyClass.add(i);
    }

    @Override
    public void undo() {
        instanceOfMyClass.add(-i);
    }

}
