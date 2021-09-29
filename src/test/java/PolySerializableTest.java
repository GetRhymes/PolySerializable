import com.poly.parser.Message;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class PolySerializableTest {

    @Test
    public void serializableTest() throws IOException, ClassNotFoundException {
        Message message = new Message("2021-09-23", "Nikita", "Hello, World!", null, null);
        Message messageAfterParse = new Message();
        messageAfterParse.parseToMessage(message.toTransferString());
        Assertions.assertTrue(message.equals(messageAfterParse));
    }
}
