package consume;

public interface Consumable {
    void consume();
    void checkIfExpired();
    void throwAway();
}
