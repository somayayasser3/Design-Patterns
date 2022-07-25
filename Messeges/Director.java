package Messages;

public class Director {
    MsgBuilderInterface msg=new MsgBuilderInterface() {
        @Override
        public void setMsgType() {
        }
    };
    public void buildDailyNewsEmailMessage(MsgBuilderInterface msg){
        msg.setMsgType();
    }
    public void buildDailyNewsMobileMessage(MsgBuilderInterface msg){
        msg.setMsgType();
    }
    public void buildTaskAddedEmailMessage(MsgBuilderInterface msg){
        msg.setMsgType();
    }
    public void buildTaskAddedMobileMessage(MsgBuilderInterface msg){
        msg.setMsgType();
    }
    public void buildGradesAnnouncementEmailMessage(MsgBuilderInterface msg){
        msg.setMsgType();
    }
    public void buildGradesAnnouncementMobileMessage(MsgBuilderInterface msg){
        msg.setMsgType();
    }

}
