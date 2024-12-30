package observeddicegame;

final class PositionSetEvent extends PositionChangeEvent {

    PositionSetEvent(int originalPosition, int newPosition) {
        super(originalPosition, newPosition);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PositionSetEvent{");
        sb.append("oldPosition=").append(oldPosition());
        sb.append(", newPosition=").append(newPosition());
        sb.append('}');
        return sb.toString();
    }
}
