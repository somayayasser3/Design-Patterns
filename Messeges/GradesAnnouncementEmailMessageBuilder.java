package Messages;

public class GradesAnnouncementEmailMessageBuilder implements MsgBuilderInterface{
    private String type;


    @Override
    public void setMsgType() {
        this.type="GradesAnnouncementEmailMessageBuilder";
    }

    public GradesAnnouncementEmailMessage get(){
        return new GradesAnnouncementEmailMessage();
    }
}
