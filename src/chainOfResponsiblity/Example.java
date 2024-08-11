package chainOfResponsiblity;

public final class Example {

    public static void run()
    {
        SearchHandler handler = new DatabaseHandler(new DefaultHandler());
        handler.hasReference("ABC123");
    }

}
