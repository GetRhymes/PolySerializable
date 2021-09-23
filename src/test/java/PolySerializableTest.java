
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PolySerializableTest {

    private final PolySerializable polySerializable = new PolySerializable();

    @Test
    public void serializableTest() throws IOException, ClassNotFoundException {
        MessageDTO message = new MessageDTO("2021-09-23", "Nikita", "Hello, World!");
        MessageDTO deserializableMessage = polySerializable
                .deserializableMessage(polySerializable.serializableMessage(message));
        assertEquals(message, deserializableMessage);
    }

    @Test
    public void deserializableTest() {

    }
}
