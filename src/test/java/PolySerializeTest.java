import com.poly.models.Message;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PolySerializeTest {

    @Test
    public void serializeTest() {
        Message message = new Message(
                "2021-09-23", "Nikita", "Привет! Как дела? Я делаю домашнее задание на тему: компьютерные сети, а ты?", null, null);
        Message messageAfterParse = new Message();
        messageAfterParse.parseToMessage(message.toTransferString());
        Assertions.assertEquals(message, messageAfterParse);
    }

    @Test
    public void serializeTest2() {
        Message message = new Message(
                "2021-09-23", "Nikita", "Татьяна, состоявшая, как мы сказали выше, в должности прачки (впрочем, ей, как искусной и ученой прачке, поручалось одно тонкое белье), была женщина лет двадцати осьми, маленькая, худая, белокурая, с родинками на левой щеке. Родинки на левой щеке почитаются на Руси худой приметой -- предвещанием несчастной жизни... Татьяна не могла похвалиться своей участью. С ранней молодости ее держали в черном теле; работала она за двоих, а ласки никакой никогда не видала; одевали ее плохо, жалованье она получала самое маленькое; родни у ней все равно что не было: о  ", null, null);
        Message messageAfterParse = new Message();
        messageAfterParse.parseToMessage(message.toTransferString());
        System.out.println(message);
        System.out.println(message.toTransferString());
        System.out.println(messageAfterParse);
        Assertions.assertEquals(message, messageAfterParse);
    }
}
