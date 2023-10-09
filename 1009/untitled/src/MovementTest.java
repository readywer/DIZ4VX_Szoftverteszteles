import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MovementTest {
    private Movement movement;

    @BeforeEach
    public void setUp() {
        movement = new Movement();
        movement.defaultValues();
    }

    @Test
    public void testForward() {
        int initialX = movement.getX();
        int initialY = movement.getY();
        Direction initialDirection = movement.getDirection();

        movement.forward();

        if (initialDirection == Direction.N) {
            assertEquals(initialX, movement.getX());
            assertEquals(initialY + 1, movement.getY());
        } else if (initialDirection == Direction.S) {
            assertEquals(initialX, movement.getX());
            assertEquals(initialY - 1, movement.getY());
        } else if (initialDirection == Direction.E) {
            assertEquals(initialX + 1, movement.getX());
            assertEquals(initialY, movement.getY());
        } else if (initialDirection == Direction.W) {
            assertEquals(initialX - 1, movement.getX());
            assertEquals(initialY, movement.getY());
        }
    }

    @Test
    public void testBackward() {
        int initialX = movement.getX();
        int initialY = movement.getY();
        Direction initialDirection = movement.getDirection();

        movement.backward();

        if (initialDirection == Direction.N) {
            assertEquals(initialX, movement.getX());
            assertEquals(initialY - 1, movement.getY());
        } else if (initialDirection == Direction.S) {
            assertEquals(initialX, movement.getX());
            assertEquals(initialY + 1, movement.getY());
        } else if (initialDirection == Direction.E) {
            assertEquals(initialX - 1, movement.getX());
            assertEquals(initialY, movement.getY());
        } else if (initialDirection == Direction.W) {
            assertEquals(initialX + 1, movement.getX());
            assertEquals(initialY, movement.getY());
        }
    }
}