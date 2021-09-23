import java.io.Serializable;
import java.util.Objects;

public class MessageDTO implements Serializable {

    private String date;
    private String name;
    private String message;

    public MessageDTO(String date, String name, String message) {
        this.date = date;
        this.name = name;
        this.message = message;
    }

    public MessageDTO() {}

    public String getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    public String getMessage() {
        return message;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "MessageDTO{" +
                "date='" + date + '\'' +
                ", name='" + name + '\'' +
                ", message='" + message + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MessageDTO that = (MessageDTO) o;
        return Objects.equals(date, that.date) && Objects.equals(name, that.name) && Objects.equals(message, that.message);
    }
}
