package observeddicegame;

interface ExtendedGameBoardObserver extends GameBoardObserver {
    void onEvent(HomeEvent homeEvent);
    void onEvent(PositionSetEvent setEvent);
}
