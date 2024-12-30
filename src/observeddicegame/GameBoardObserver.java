package observeddicegame;

interface GameBoardObserver {
    void onEvent(OverflowEvent overflowEvent);
    void onEvent(UnderflowEvent underflowEvent);
}
