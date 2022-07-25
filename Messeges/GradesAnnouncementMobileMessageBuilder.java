package Messages;

public class GradesAnnouncementMobileMessageBuilder implements MsgBuilderInterface{
    private String type;
    @Override
    public void setMsgType() {
        this.type="GradesAnnouncementMobileMessage";

    }
    public GradesAnnouncementMobileMessage get(){
        return new GradesAnnouncementMobileMessage();
    }
}
