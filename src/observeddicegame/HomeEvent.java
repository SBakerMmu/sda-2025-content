package observeddicegame;

final class HomeEvent extends PositionChangeEvent {

    HomeEvent(int originalPosition, int newPosition) {
        super(originalPosition, newPosition);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("HomeEvent{");
        sb.append(", newPosition=").append(newPosition());
        sb.append('}');
        return sb.toString();
    }
}
