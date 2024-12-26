package observeddicegame;

interface ExtendedGameObserver {
    void onOverflow(OverflowEvent overflowEvent);
    void onUnderflow(UnderflowEvent underflowEvent);
    void onWin(WinEvent winEvent);
}
