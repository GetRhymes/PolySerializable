import java.io.*;

public class PolySerializable implements Serializable {

    public PolySerializable() {}

    public static ByteArrayOutputStream serializeMessage(MessageDTO message) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(message);
        oos.flush();
        baos.flush();
        oos.close();
        baos.close();
        return baos;
    }

    public static MessageDTO deserializeToMessage(ByteArrayOutputStream serializableMessage)
            throws IOException, ClassNotFoundException {
        ByteArrayInputStream bais = new ByteArrayInputStream(serializableMessage.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        // todo catch classCastException
        return (MessageDTO) ois.readObject();
    }
}