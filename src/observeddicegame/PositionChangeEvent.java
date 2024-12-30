package observeddicegame;

import java.util.Objects;

abstract class PositionChangeEvent {
    private final int oldPosition;
    private final int newPosition;

    PositionChangeEvent(int oldPosition, int newPosition) {
        this.oldPosition = oldPosition;
        this.newPosition = newPosition;
    }

    public int oldPosition() {
        return oldPosition;
    }

    public int newPosition() {
        return newPosition;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (PositionChangeEvent) obj;
        return this.oldPosition == that.oldPosition &&
                this.newPosition == that.newPosition;
    }

    @Override
    public int hashCode() {
        return Objects.hash(oldPosition, newPosition);
    }
}
