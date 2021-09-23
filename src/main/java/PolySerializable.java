import java.io.*;

public class PolySerializable implements Serializable {

    public PolySerializable() {}

    public ByteArrayOutputStream serializableMessage(MessageDTO message) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(message);
        oos.flush();
        baos.flush();
        oos.close();
        baos.close();
        return baos;
    }

    public MessageDTO deserializableMessage(ByteArrayOutputStream serializableMessage) throws IOException, ClassNotFoundException {
        ByteArrayInputStream bais = new ByteArrayInputStream(serializableMessage.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        return (MessageDTO) ois.readObject();
    }
}