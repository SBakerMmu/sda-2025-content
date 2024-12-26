package observeddicegame;

final class WinEvent extends PositionChangeEvent {

    WinEvent(int originalPosition, int newPosition) {
        super(originalPosition, newPosition);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("WinEvent{");
        sb.append(", newPosition=").append(newPosition());
        sb.append('}');
        return sb.toString();
    }
}
