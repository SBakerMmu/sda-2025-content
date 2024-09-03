package chainofresponsiblity;

class DefaultHandler implements SearchHandler{
    @Override
    public boolean hasDigitalObject(String doi) {
        return false;
    }
}
