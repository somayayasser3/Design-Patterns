package Gateways;

import Messages.*;

public class AdaptorClass implements AdaptorInterface{

    EmailGateway eg=new EmailGateway();
    SMSGateway sms=new SMSGateway();
    @Override
    public void  receiveMessage(String msg,String to) {
        String [] s=msg.split("#");
        Director di=new Director();
        if(s[0].equalsIgnoreCase("dailyNewsEmailMessage")){
            DailyNewsEmailMessageBuilder Dm=new DailyNewsEmailMessageBuilder();
            di.buildDailyNewsEmailMessage(Dm);
            DailyNewsEmailMessage d=Dm.getMsg();
             eg.sendMessage(d,s[1],to);
        }
        else if(s[0].equalsIgnoreCase("GradesannouncementEmailMessage")){
            GradesAnnouncementEmailMessageBuilder Dm=new GradesAnnouncementEmailMessageBuilder();
            di.buildGradesAnnouncementEmailMessage(Dm);
            GradesAnnouncementEmailMessage gE=Dm.get();
             eg.sendMessage(gE,s[1],to);

        }
        else if(s[0].equalsIgnoreCase("TaskAddedEmailMessage")){
            TaskAddedEmailMessageBuilder Dm=new TaskAddedEmailMessageBuilder();
            di.buildTaskAddedEmailMessage(Dm);
            TaskAddedEmailMessage t=Dm.get();
            eg.sendMessage(t,s[1],to);
        }
        else if(s[0].equalsIgnoreCase("TaskAddedMobileMessage")){
            TaskAddedMobileMessageBuilder Dm=new TaskAddedMobileMessageBuilder();
            di.buildTaskAddedMobileMessage(Dm);
            TaskAddedMobileMessage t=Dm.get();
            sms.sendMessage(t,s[1],to);

        }
        else if (s[0].equalsIgnoreCase("GradesAnnouncementMobileMessage")){
            GradesAnnouncementMobileMessageBuilder Dm=new GradesAnnouncementMobileMessageBuilder();
            di.buildGradesAnnouncementMobileMessage(Dm);
            GradesAnnouncementMobileMessage gm=Dm.get();
            sms.sendMessage(gm,s[1],to);
        }
        else if(s[0].equalsIgnoreCase("DailyNewsMobileMessage")){
            DailyNewsMobileMessageBuilder Dm=new DailyNewsMobileMessageBuilder();
            di.buildDailyNewsMobileMessage(Dm);
            DailyNewsMobileMessage dm=Dm.get();
            sms.sendMessage(dm,s[1],to);
        }

    }
}
