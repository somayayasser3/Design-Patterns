package Messages;

public class TaskAddedMobileMessageBuilder implements MsgBuilderInterface{
    private String type;
    @Override
    public void setMsgType() {
        this.type="TaskAddedMobileMessage";
    }

    public TaskAddedMobileMessage get(){
        return new TaskAddedMobileMessage();
    }
}
