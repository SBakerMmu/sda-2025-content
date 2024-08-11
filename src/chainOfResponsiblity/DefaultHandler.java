package chainOfResponsiblity;

class DefaultHandler implements SearchHandler{
    @Override
    public boolean hasReference(String oid) {
        return false;
    }
}
