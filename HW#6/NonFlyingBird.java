// Abstract class for non-flying birds
public abstract class NonFlyingBird extends Bird {
    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}