package chainOfResponsiblity;

class DatabaseHandler implements SearchHandler {
    private final SearchHandler successor;

    public DatabaseHandler(SearchHandler successor) {
        this.successor = successor;
    }

    @Override
    public boolean hasReference(String oid) {
        boolean lookup = lookupInDatabase(oid);
        if (lookup) return true;
            //Failed to handle the call, pass on to successor
        else return successor.hasReference(oid);
    }

    private boolean lookupInDatabase(String oid) {
        //look up from database, return true or false if exists
        return false;
    }
}
