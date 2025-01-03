package observeddicegame;

final class UnderflowEvent extends PositionChangeEvent {

    UnderflowEvent(int oldPosition, int newPosition) {
        super(oldPosition, newPosition);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UnderflowEvent{");
        sb.append("oldPosition=").append(oldPosition());
        sb.append(", newPosition=").append(newPosition());
        sb.append('}');
        return sb.toString();
    }
}
