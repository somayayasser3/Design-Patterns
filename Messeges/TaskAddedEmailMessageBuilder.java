package Messages;

public class TaskAddedEmailMessageBuilder implements MsgBuilderInterface{
   private String type;
    @Override
    public void setMsgType() {
        type="TaskAddedEmailMessage";

    }
    public TaskAddedEmailMessage get(){
        return new TaskAddedEmailMessage();
    }
}
