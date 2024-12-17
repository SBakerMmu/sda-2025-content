package commandintroduction;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public final class Example {

    public static void run() {
        single();
        history();
        composite();
        menu();

    }

    private static void composite() {
        System.out.printf("Composite%n");
        MyClass anInstanceOfMyClass = new MyClass();
        System.out.printf("value %d%n", anInstanceOfMyClass.getValue());

        Command add3 = new AddCommand(anInstanceOfMyClass, 3);
        Command add4 = new AddCommand(anInstanceOfMyClass, 4);
        Command add5 = new AddCommand(anInstanceOfMyClass, 5);

        CompositeCommand compositeCommand = new CompositeCommand();
        compositeCommand.add(add3);
        compositeCommand.add(add4);
        compositeCommand.add(add5);

        executeCommand(compositeCommand);
        System.out.printf("value %d%n", anInstanceOfMyClass.getValue());
        undoCommand(add4);
        System.out.printf("value %d%n", anInstanceOfMyClass.getValue());
    }

    private static void executeCommand(Command command) {
        command.execute();
    }

    private static void undoCommand(Command command) {
        command.undo();
    }


    private static void history() {
        System.out.printf("History%n");
        MyClass anInstanceOfMyClass = new MyClass();
        Stack<Command> history = new Stack<>();

        System.out.printf("value %d%n", anInstanceOfMyClass.getValue());

        Command add3 = new AddCommand(anInstanceOfMyClass, 3);
        add3.execute();
        history.push(add3);
        System.out.printf("value %d%n", anInstanceOfMyClass.getValue());

        Command add4 = new AddCommand(anInstanceOfMyClass, 4);
        add4.execute();
        history.push(add4);
        System.out.printf("value %d%n", anInstanceOfMyClass.getValue());

        Command add5 = new AddCommand(anInstanceOfMyClass, 5);
        add5.execute();
        history.push(add5);
        System.out.printf("value %d%n", anInstanceOfMyClass.getValue());

        while (!history.empty()) {
            history.pop().undo();
            ;
            System.out.printf("value %d%n", anInstanceOfMyClass.getValue());
        }
    }

    private static void single() {
        System.out.printf("Single%n");
        MyClass anInstanceOfMyClass = new MyClass();
        Command command = new AddCommand(anInstanceOfMyClass, 2);
        System.out.printf("value %d%n", anInstanceOfMyClass.getValue());
        command.execute();
        System.out.printf("value %d%n", anInstanceOfMyClass.getValue());
        command.undo();
        System.out.printf("value %d%n", anInstanceOfMyClass.getValue());
    }


    private static void menu() {

        class CutCommand implements Command {
            @Override
            public void execute() {
                System.out.printf("execute %s%n", this);
            }

            @Override
            public void undo() {
                System.out.printf("undo %s%n", this);
            }
        }
        class CopyCommand implements Command {
            @Override
            public void execute() {
                System.out.printf("execute %s%n", this);
            }

            @Override
            public void undo() {
                System.out.printf("undo %s%n", this);
            }
        }
        class PasteCommand implements Command {
            @Override
            public void execute() {
                System.out.printf("execute %s%n", this);
            }

            @Override
            public void undo() {
                System.out.printf("undo %s%n", this);
            }
        }


        //Create the Menu
        Map<String, Command> menu = new HashMap<>();
        menu.put("Cut", new CutCommand());
        menu.put("Copy", new CopyCommand());
        menu.put("Paste", new PasteCommand());


        //User selects item from the menu
        String selection = "Copy";


        //Execute the command
        menu.get(selection).execute();

    }
}

