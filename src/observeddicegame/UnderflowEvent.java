package observeddicegame;

import java.util.Objects;

final class UnderflowEvent extends PositionChangeEvent {

    UnderflowEvent(int originalPosition, int newPosition) {
        super(originalPosition, newPosition);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UnderflowEvent{");
        sb.append("originalPosition=").append(originalPosition());
        sb.append(", newPosition=").append(newPosition());
        sb.append('}');
        return sb.toString();
    }
}
