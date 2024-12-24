package observeddicegame;

interface GameObserver {
    void onOverflow(OverflowEvent overflowEvent);
    void onUnderflow(UnderflowEvent underflowEvent);
}
