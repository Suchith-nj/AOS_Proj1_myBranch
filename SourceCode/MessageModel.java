import java.io.Serializable;
import java.util.ArrayList;

/*
 Model which represents the message sent and received in between nodes
 */
public class MessageModel implements Serializable {

    /*
     SERIALVERSION UID (DEFAULT)
     */
    private static final long serialVersionUID = 1L;

    private final int id;
    private final ArrayList<local_state> data;
    private final int messageType;
    private int messageId = 0;

    public MessageModel(final int id, final ArrayList<local_state> payload, final int messageType) {
        this.id = id;
        this.data = payload;
        this.messageType = messageType;
    }

    public MessageModel(final int id, final ArrayList<local_state> payload , final int messageType, final int mId) {
        this.id = id;
        this.data = payload;
        this.messageType = messageType;
        this.messageId = mId;
    }

    public ArrayList<local_state> getData() {
        return data;
    }

    public int getMessageType() {
        return messageType;
    }

    public int getId() {
        return id;
    }

    public int getMessageId() {
        return messageId;
    }

    @Override
    public String toString() {
        return "Id : " + id
                + " Data : " + data
                + " Type : " + messageType;
    }
}