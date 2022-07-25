package Messages;

public class DailyNewsEmailMessageBuilder implements MsgBuilderInterface {
    private String type;

    public DailyNewsEmailMessage getMsg() {
        return new DailyNewsEmailMessage();
    }


    @Override
    public void setMsgType() {
        this.type="DailyNewsEmailMessage";
    }
}
