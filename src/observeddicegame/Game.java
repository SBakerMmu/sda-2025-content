package observeddicegame;

interface Game {
    void reset();
    void setPosition(int position);
    void advance(int count);
}
