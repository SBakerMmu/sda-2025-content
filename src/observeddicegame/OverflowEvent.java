package observeddicegame;

final class OverflowEvent extends PositionChangeEvent {

    OverflowEvent(int oldPosition, int newPosition) {
        super(oldPosition, newPosition);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("OverflowEvent{");
        sb.append("oldPosition=").append(oldPosition());
        sb.append(", newPosition=").append(newPosition());
        sb.append('}');
        return sb.toString();
    }
}
