package observeddicegame;

import java.util.Objects;

final class OverflowEvent extends PositionChangeEvent {

    OverflowEvent(int originalPosition, int newPosition) {
        super(originalPosition, newPosition);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("OverflowEvent{");
        sb.append("originalPosition=").append(originalPosition());
        sb.append(", newPosition=").append(newPosition());
        sb.append('}');
        return sb.toString();
    }

}
