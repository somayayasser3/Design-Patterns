package Messages;

public class DailyNewsMobileMessageBuilder implements MsgBuilderInterface {
    private String type;
    @Override
    public void setMsgType() {
        type="DailyNewsMobileMessage";
    }
    public DailyNewsMobileMessage get(){
        return new DailyNewsMobileMessage();
    }

}
