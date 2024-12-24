package observeddicegame;

import java.util.Objects;

abstract class PositionChangeEvent {
    private final int originalPosition;
    private final int newPosition;

    PositionChangeEvent(int originalPosition, int newPosition) {
        this.originalPosition = originalPosition;
        this.newPosition = newPosition;
    }

    public int originalPosition() {
        return originalPosition;
    }

    public int newPosition() {
        return newPosition;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (PositionChangeEvent) obj;
        return this.originalPosition == that.originalPosition &&
                this.newPosition == that.newPosition;
    }

    @Override
    public int hashCode() {
        return Objects.hash(originalPosition, newPosition);
    }
}
